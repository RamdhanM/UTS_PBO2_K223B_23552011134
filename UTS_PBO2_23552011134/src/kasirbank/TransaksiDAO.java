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

public class TransaksiDAO {

    public static void simpanTransaksi(Transaksi transaksi) {
        String sql = "INSERT INTO transaksi (rekening_id, tipe, jumlah, tanggal) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, transaksi.getRekeningId());
            stmt.setString(2, transaksi.getTipe());
            stmt.setDouble(3, transaksi.getJumlah());
            stmt.setDate(4, new java.sql.Date(transaksi.getTanggal().getTime()));

            stmt.executeUpdate();
            System.out.println("[INFO] Transaksi berhasil disimpan.");
        } catch (SQLException e) {
            System.out.println("[ERROR] Gagal simpan transaksi: " + e.getMessage());
        }
    }

    public static void tampilkanSemuaTransaksi() {
        String sql = "SELECT * FROM transaksi";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n=== HISTORI TRANSAKSI ===");
            while (rs.next()) {
                System.out.println("- ID: " + rs.getInt("id") +
                                   " | Rekening ID: " + rs.getInt("rekening_id") +
                                   " | Tipe: " + rs.getString("tipe") +
                                   " | Jumlah: Rp" + rs.getDouble("jumlah") +
                                   " | Tanggal: " + rs.getDate("tanggal"));
            }
            System.out.println("=========================\n");
        } catch (SQLException e) {
            System.out.println("[ERROR] Gagal tampilkan transaksi: " + e.getMessage());
        }
    }
}