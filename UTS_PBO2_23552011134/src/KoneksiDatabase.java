/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ramdhan Maulana RM
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/kasir_bank";
        String user = "root";
        String password = ""; // kosongkan jika tidak ada password

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi ke database BERHASIL");
        } catch (Exception e) {
            System.out.println("Koneksi GAGAL: " + e.getMessage());
        }
    }
}