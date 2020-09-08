import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {
        Connection connection;
        PreparedStatement pre;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb"
                    , "root", "root");
            pre=connection.prepareStatement("insert into adminstrator (adminstrator_name,adminstrator_address,adminstrator_phone) values (?,?,?)");
            pre.setString(1, "wakleed");
            pre.setString(2, "cairo");
            pre.setString(3,"010");

            pre.executeUpdate();

            //  JOptionPane.showMessageDialog(null, "connection Enstablished");
        } catch (Exception ex) {
            System.out.println(ex);

        }

        System.out.printf("Done");
//        return connection;

    }
}
