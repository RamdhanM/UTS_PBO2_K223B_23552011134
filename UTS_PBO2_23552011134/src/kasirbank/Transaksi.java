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

public class Transaksi {
    private int id;
    private int rekeningId;
    private String tipe;
    private double jumlah;
    private Date tanggal;

    public Transaksi(int rekeningId, String tipe, double jumlah, Date tanggal) {
        this.rekeningId = rekeningId;
        this.tipe = tipe;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) { // tambahan jika nanti mau set ID dari database
        this.id = id;
    }

    public int getRekeningId() {
        return rekeningId;
    }

    public String getTipe() {
        return tipe;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) { // tambahan opsional
        this.tanggal = tanggal;
    }
}