package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public static User getUserName(String username){
        String sql = "SELECT * FROM users" +
                "WHERE username = ?";
        User user = null;

        try(Connection conn = DataBase.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, username);
                try(ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        user = new User();
                        user.setUserId(rs.getInt("user_id"));
                        user.setUserName(username);
                        user.setEmail(rs.getString("email"));
                        user.setPassword(rs.getString("password"));
                        user.setDateOfRegistration(rs.getDate("date_of_registration"));
                    }
                }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }
    public static boolean addUserLog(User user, String loginResult){
        String sql = "INSERT INTO user_logs(userr_id, login_time, login_result)" +
                        "VALUES(?, now(), ?)";
        int result = 0;

        try(Connection conn = DataBase.connect();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, user.getUserId());
            stmt.setString(2, loginResult);

            result = stmt.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }
}
