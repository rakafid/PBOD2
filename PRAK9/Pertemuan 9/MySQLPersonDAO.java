import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person p) throws Exception {
        String name = p.getName();

        // Create Connection
        // Using the new driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "12345678");

        // Query - using single quotes instead of backticks for string values
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        java.sql.Statement s = con.createStatement();
        s.executeUpdate(query);

        // Close connection
        con.close();
    }
}