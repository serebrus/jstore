package uz.micros.jstore.util;

import uz.micros.jstore.entity.blog.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 04.06.14.
 */
public class DBManager {
    private static Connection connect() {
        System.out.println("JDBC");

        Connection res = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            res = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jstore", "postgres", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static List<Post> runQuery(String query) {
        Connection con = connect();
        List<Post> ls = new ArrayList<Post>();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt(1));
                p.setDate(rs.getDate(2));
                p.setText(rs.getString(3));
                ls.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ls;
    }
}
