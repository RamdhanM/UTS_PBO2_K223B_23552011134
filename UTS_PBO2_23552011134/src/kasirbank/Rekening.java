/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirbank;

/**
 *
 * @author Ramdhan Maulana RM
 */
public class Rekening {
    protected int id;
    protected String jenis;
    protected double saldo;

    public Rekening(int id, String jenis, double saldo) {
        this.id = id;
        this.jenis = jenis;
        this.saldo = saldo;
    }

    public double hitungBunga() {
        return 0;
    }

    public void infoRekening() {
        System.out.println("Rekening ID: " + id + ", Jenis: " + jenis + ", Saldo: " + saldo);
    }

    // Tambahan getter saldo agar bisa diakses dari DAO
    public double getSaldo() {
        return saldo;
    }

    // Tambahan getter jenis kalau nanti dibutuhkan juga
    public String getJenis() {
        return jenis;
    }

    public int getId() {
        return id;
    }
}