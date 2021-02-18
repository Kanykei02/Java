package com.company;

import java.sql.*;

public class DataBase {
    private static final String url = "jdbc:postgresql://localhost:5432/";
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

    public static boolean addNews(News news){
        String sql = "INSERT INTO news(news_headline, news_text, publication_time)" +
                        "VALUES(?, ?, now())";
        int result = 0;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, news.getNewsHeadline());
            stmt.setString(2, news.getNewsText());

            result = stmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    public static News getNewsHeadlineAndText(String headline, String text){
        String sql = "SELECT news_headline, news_text FROM news" +
                        "WHERE news_headline = ? AND news_text = ?";
        News news = null;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, headline);
            stmt.setString(2, text);

            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    news = new News();
                    news.setNewsHeadline(headline);
                    news.setNewsText(text);
                }
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return news;
    }

    public static void deleteNews(News news){
        String sql = "DELETE FROM news" +
                    "WHERE news_id = ?";
        int result = 0;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, news.getNewsId());

            try(ResultSet rs = stmt.executeQuery()){
                rs.next();
                result = rs.getInt(1);
                stmt.executeUpdate();
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static News updateNews(News news, int newsId){
        String sql = "UPDATE news" +
                        "SET news_headline = ? AND news_text" +
                        "WHERE news_id = ?";
        News news1 = null;
        int result = 0;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, newsId);
            try(ResultSet rs = stmt.executeQuery()){
                news1 = new News();
                rs.next();
                news1.setNewsId(newsId);
                news1.setNewsHeadline(rs.getString("news_headline"));
                news1.setNewsText(rs.getString("news_text"));

                result = stmt.executeUpdate();
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return news;
    }
}
