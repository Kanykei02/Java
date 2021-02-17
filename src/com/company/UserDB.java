package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDB {

    public static boolean addUser(User user){
        String sql = "INSERT INTO users(user_name, email, password, date_of_registration)" +
                    "VALUES(?, ?, ?, now())";
        int result = 0;
         try (Connection conn = DataBase.connect();
              PreparedStatement stmt = conn.prepareStatement(sql)){
             stmt.setString(1, user.getUserName());
             stmt.setString(2, user.getEmail());
             stmt.setString(3, user.getPassword());

             result = stmt.executeUpdate();
         }
         catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
         return result > 0;
    }
}
