package preparedStatement;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Driver driver=new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/capPlayer"
                ,"postgres","1");

//        ------------------------------------------------Insert--------------------------------------------
//        String insertedQuery= "Insert into players values(?,?,?)";
//        PreparedStatement preparedStatement=connection.prepareStatement(insertedQuery);
//        preparedStatement.setInt(1,3);
//        preparedStatement.setString(2,"Rohit Sharma");
//        preparedStatement.setString(3,"Cricket");
//        int rowsInserted =preparedStatement.executeUpdate();
//        if(rowsInserted>0) System.out.println("Insertion successful");
//        else System.out.println("Insertion failed");

//        --------------------------------------Update-------------------------------------------
        String updateQuery="Update players set sports= ? where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
        preparedStatement.setString(1,"Dance");
        preparedStatement.setInt(2,3);
        int rowsUpdated=preparedStatement.executeUpdate();
        if(rowsUpdated>0) System.out.println(rowsUpdated+" rows updated");
        else System.out.println("Updation failed");
        connection.close();
    }
}


// order= desc/asc
// name
//setstring(1,order+" "+name);