import java.sql.*;

public class StudentDAO {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:students.db")) {
            PreparedStatement insert = con.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
            insert.setInt(1, 104);
            insert.setString(2, "David");
            insert.executeUpdate();

            PreparedStatement update = con.prepareStatement("UPDATE students SET name = ? WHERE id = ?");
            update.setString(1, "Daniel");
            update.setInt(2, 104);
            update.executeUpdate();

            System.out.println("Insert and update done.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

