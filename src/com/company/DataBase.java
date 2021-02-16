package com.company;

import java.sql.*;

public class DataBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "aikosha02";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successfully");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static int getTrainersCount() {
        String sql = "SELECT COUNT(*) FROM Trainers";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);) {

            rs.next();
            count = rs.getInt(1);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
}
