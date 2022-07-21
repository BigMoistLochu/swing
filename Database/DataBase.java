package swing.Database;
import java.sql.*;

public class DataBase {
    Connection con;
    PreparedStatement pst;
    String name,price,category,id;

    public DataBase(String name, String price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/produkty", "root","");
            System.out.println("Success");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public void Add()
    {
        try {
            pst = con.prepareStatement("insert into products(name,price,category)values(?,?,?)");
            pst.setString(1, name);
            pst.setString(2, price);
            pst.setString(3, category);
            pst.executeUpdate();
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
        }
    }
}

