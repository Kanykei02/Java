package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDB {
    public static Car getCarByID(int id){
        String sql = "SELECT * FROM car_info WHERE car_id = ?";
        Car car = null;
        try (Connection conn = DataBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            try(ResultSet rs = stmt.executeQuery()){

                if(rs.next()){
                    car = new Car();
                    car.setCarId(rs.getInt("car_id"));
                    car.setManufactureYear(rs.getDate("manufacture_year"));
                    car.setModel(rs.getString("model"));
                    car.setPrice(rs.getInt("price"));
                    car.setColor(rs.getString("color"));
                    return car;
                }
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return car;
    }
}
