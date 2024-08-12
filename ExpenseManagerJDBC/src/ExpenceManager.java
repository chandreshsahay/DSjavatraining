import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenceManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/expencedb";
        //pass the database url,username,password in string
        String password="";
        String username="root";


        try {
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            //Design the java UI for expence Calculator
            JFrame frame=new JFrame("Chanadresh Expences");
//            JLabel tittlelabel=new JLabel("Expences");

            frame.setSize(500,400);
            frame.setLayout(null);
            frame.setVisible(true);
            //To Insert the data into table.
            String insert="insert into expencetd (expencetype,expenceamount,incomeamount) values (?,?,?) ";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1,"Travel");
            ps.setInt(2,250);
            ps.setInt(3,500);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
