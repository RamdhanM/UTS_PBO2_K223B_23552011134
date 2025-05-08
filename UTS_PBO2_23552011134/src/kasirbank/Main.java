/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirbank;

/**
 *
 * @author Ramdhan Maulana RM
 */
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Buat rekening tabungan dan giro
        Tabungan t = new Tabungan(1, 1000000);
        Giro g = new Giro(2, 2000000);

        // Lakukan transaksi setor dan tarik
        t.setor(500000);
        g.tarik(300000);

        // Simpan rekening ke database
        RekeningDAO.simpanRekening(t);
        RekeningDAO.simpanRekening(g);

        // Tampilkan informasi rekening
        System.out.println("\n==== INFORMASI SALDO ====");
        System.out.println("Saldo Tabungan: " + t.getSaldo());
        System.out.println("Bunga Tabungan: " + t.hitungBunga());

        System.out.println("Saldo Giro: " + g.getSaldo());
        System.out.println("Bunga Giro: " + g.hitungBunga());

        // Buat transaksi dan simpan ke database
        Transaksi trx1 = new Transaksi(t.getId(), "Setor", 500000, new Date());
        Transaksi trx2 = new Transaksi(g.getId(), "Tarik", 300000, new Date());

        TransaksiDAO.simpanTransaksi(trx1);
        TransaksiDAO.simpanTransaksi(trx2);

        // Tampilkan semua rekening
        System.out.println("\n==== DAFTAR REKENING ====");
        RekeningDAO.tampilkanSemuaRekening();

        // Tampilkan semua transaksi
        System.out.println("\n==== HISTORI TRANSAKSI ====");
        TransaksiDAO.tampilkanSemuaTransaksi();
    }
}