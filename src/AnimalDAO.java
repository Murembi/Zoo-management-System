import java.sql.*;

public class AnimalDAO {

    public boolean addAnimal(String name, String species) {
        String sql = "INSERT INTO animals (name, species) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, species);

            pstmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void getAllAnimals() {
        String sql = "SELECT * FROM animals";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("name") + " - " +
                                rs.getString("species")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchAnimal(String input) {

        String sql = "SELECT * FROM animals WHERE name ILIKE ? OR species ILIKE ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + input + "%");
            pstmt.setString(2, "%" + input + "%");

            ResultSet rs = pstmt.executeQuery();

            boolean found = false;

            while (rs.next()) {
                System.out.println("\nAnimal Found:");
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Species: " + rs.getString("species"));
                found = true;
            }

            if (!found) {
                System.out.println("No animal found for: " + input);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
