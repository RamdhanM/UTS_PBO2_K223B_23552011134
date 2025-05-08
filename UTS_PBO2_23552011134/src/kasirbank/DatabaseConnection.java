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
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/kasir_bank";
            String user = "root";
            String pass = ""; // jika pakai password, isi di sini
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke database BERHASIL");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Koneksi GAGAL: " + e.getMessage());
            return null;
        }
    }
}