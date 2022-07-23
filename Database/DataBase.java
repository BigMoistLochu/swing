package swing.Database;
import java.sql.*;

public class DataBase {
    Connection con;
    PreparedStatement pst;




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

    public void Add(String name,String price, String category)
    {
        try {
            pst = con.prepareStatement("insert into products(name,price,category)values(?,?,?)");
            pst.setString(1, name);
            pst.setString(2, price);
            pst.setString(3, category);
            pst.executeUpdate();
            con.close();
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
        }
    }

    public String[] Search(String id)
    {
        String[] tablica = new String[3];
        try {
            pst = con.prepareStatement("select * from products where id=?");
            pst.setString(1, id);

            ResultSet rs = pst.executeQuery();
            if(rs.next()==true)
            {
                tablica[0] = rs.getString(1);
                tablica[1] = rs.getString(2);
                tablica[2] = rs.getString(3);
            }
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
        }

        return tablica;
    }
}

