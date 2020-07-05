package store;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    Connection connection;
    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost",
                    "root",
                    "nininono447978");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement createStatement() {
        Statement res = null;
        try {
            res =  connection.createStatement();
            res.execute("use store_data;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Product> getAll() {
        List<Product> items = new ArrayList<>();
        Statement st = createStatement();

        try {
            ResultSet res = st.executeQuery("select * from products;");
            while (res.next()) {
                String id = res.getString(1);
                String name = res.getString(2);
                String img = res.getString(3);
                Double price = Double.valueOf(res.getString(4));
                items.add(new Product(id, name, img, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    public Product getProduct(String id) {
        Statement st = createStatement();
        try {
            ResultSet res = st.executeQuery("select * from products where productid = '" + id + "'");
            while (res.next()) {
                String name = res.getString(2);
                String img = res.getString(3);
                Double price = Double.valueOf(res.getString(4));
                return new Product(id, name, img, price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
