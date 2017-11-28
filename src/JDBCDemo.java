import java.sql.*;

/**
 * Created by Roman on 26.11.2017.
 */
public class JDBCDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/bank"; // 3306 - is a port number  bank - is a DB name
        try {
            // establish connection object
            Connection conn = DriverManager.getConnection(url, "root" , "208ap" );

            // create a statement to send to the DB
            Statement statement = conn.createStatement();

            // execute the statement object
            ResultSet resultSet = statement.executeQuery("SELECT * FROM account");

            // process the result
            int totalBallance = 0;
            double tb = 0;
            while (resultSet.next()){
                System.out.println(resultSet.getString("avail_balance"));
                tb = resultSet.getDouble("avail_balance");
                System.out.println(tb);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
