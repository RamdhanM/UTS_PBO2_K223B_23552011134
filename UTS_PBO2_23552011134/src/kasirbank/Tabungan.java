/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirbank;

/**
 *
 * @author Ramdhan Maulana RM
 */
public class Tabungan extends Rekening implements LayananKeuangan {

    public Tabungan(int id, double saldo) {
        super(id, "Tabungan", saldo);
    }

    @Override
    public double hitungBunga() {
        return saldo * 0.01;
    }

    @Override
    public void setor(double jumlah) {
        saldo += jumlah;
    }

    @Override
    public void tarik(double jumlah) {
        saldo -= jumlah;
    }
}
