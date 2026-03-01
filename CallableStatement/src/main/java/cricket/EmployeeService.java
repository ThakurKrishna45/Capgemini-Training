package cricket;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public void insertEmp(String name,double salary){
        String sql="CALL InsertEmp(?,?)";
        try (Connection conn=DatabaseUtil.getConnection();
             CallableStatement stmt= conn.prepareCall(sql)){
            stmt.setString(1,name);
            stmt.setDouble(2,salary);
            stmt.execute();
            System.out.println("Insertion successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    public List<Employee> getAllEmployees(){
//        List<Employee> employees= new ArrayList<>();
//
//        return null;
//    }
}
