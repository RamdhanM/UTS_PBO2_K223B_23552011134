/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirbank;

/**
 *
 * @author Ramdhan Maulana RM
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RekeningDAO {

    public static void simpanRekening(Rekening rekening) {
        String sql = "INSERT INTO rekening (jenis, saldo) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, rekening.getClass().getSimpleName()); // Tabungan / Giro
            stmt.setDouble(2, rekening.getSaldo());
            stmt.executeUpdate();

            System.out.println("[INFO] Data rekening berhasil disimpan.");
        } catch (SQLException e) {
            System.out.println("[ERROR] Gagal menyimpan rekening: " + e.getMessage());
        }
    }

    public static void tampilkanSemuaRekening() {
        String sql = "SELECT * FROM rekening";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n=== DATA SEMUA REKENING ===");
            while (rs.next()) {
                System.out.println("- ID: " + rs.getInt("id") +
                                   " | Jenis: " + rs.getString("jenis") +
                                   " | Saldo: Rp" + rs.getDouble("saldo"));
            }
            System.out.println("===========================\n");
        } catch (SQLException e) {
            System.out.println("[ERROR] Gagal ambil data rekening: " + e.getMessage());
        }
    }
}