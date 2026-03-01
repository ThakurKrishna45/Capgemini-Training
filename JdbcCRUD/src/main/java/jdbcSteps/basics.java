package jdbcSteps;
//import org.postgresql.Driver;
import java.sql.*;
public class basics {
    public static void main(String[] args) throws SQLException{
        Driver driver=new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/capPlayer"
                ,"postgres","1");
        Statement statement=connection.createStatement();

//      -----------------------------------------Insert--------------------------------
//        int rowsInserted= statement.executeUpdate("Insert into players values(2,'Chris Gayle','cricket')");
//        if(rowsInserted>0) System.out.println(rowsInserted+" rows inserted");
//        else System.out.println("Failed");

//       ---------------------------------------- Fetch---------------------------------------
//        ResultSet rs=statement.executeQuery("Select * from players");
//        while(rs.next()){
//            int id=rs.getInt("id");
//            String name=rs.getString("name");
//            String sport= rs.getString("sports");
//            System.out.println(id+" | "+name+" | "+sport);
//        }

//      -----------------------------------------Update----------------------------------------------
//        int rowsUpdated=statement.executeUpdate("Update players set sports ='football' where id=1");
//        if(rowsUpdated>0) System.out.printf(rowsUpdated+" rows updated");
//        else System.out.println("Update failed");

//      -----------------------------------------Delete------------------------------------------------
        int rowsDelete= statement.executeUpdate("Delete from players where id=1");
        if(rowsDelete>0) System.out.println(rowsDelete+" rows Deleted");
        else System.out.printf("Delete failed");
        connection.close();

    }
}
