import java.sql.*;

public class RetrieveDataFromMultipleTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "your-username";
        String password = "your-password";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM table1, table2";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Retrieve data from the result set
                int id1 = resultSet.getInt("table1.id");
                String name1 = resultSet.getString("table1.name");
                int id2 = resultSet.getInt("table2.id");
                String name2 = resultSet.getString("table2.name");

                // Do something with the retrieved data
                System.out.println("Table1 - ID: " + id1 + ", Name: " + name1);
                System.out.println("Table2 - ID: " + id2 + ", Name: " + name2);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
