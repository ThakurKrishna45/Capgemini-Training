package com.capg.dao;

import com.capg.entity.Player;
import com.capg.repository.PlayerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO{
    @Override
    public void insertPlayer(Player player) {
        String sql="Insert into players values (?,?,?)";
        try(Connection conn= PlayerRepository.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)){
            pstmt.setInt(1,player.getPlayerId());
            pstmt.setString(2,player.getPlayerName());
            pstmt.setString(3,player.getPlayerCountry());
            pstmt.executeUpdate();
            System.out.println("Player Inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePlayer(Player player) {
        String sql="Update players set name =? where id=?";
        try(Connection conn= PlayerRepository.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)) {
            pstmt.setInt(2, player.getPlayerId());
            pstmt.setString(1, player.getPlayerName());
            pstmt.executeUpdate();
            System.out.println("Player name updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePlayer(int playerId) {
        String sql="Delete from players where id=?";
        try(Connection conn= PlayerRepository.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)){
            pstmt.setInt(1, playerId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Player> getAllPlayers() {
        String sql="Select * from players";
        List<Player> players= new ArrayList<>();
        try(Connection conn= PlayerRepository.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)){
           ResultSet rs= pstmt.executeQuery();
           while(rs.next()){
               int id=rs.getInt("id");
               String name=rs.getString("name");
               String country= rs.getString("country");
               Player p=new Player(id,name,country);
               players.add(p);
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return players;
    }
}
