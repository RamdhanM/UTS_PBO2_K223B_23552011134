/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirbank;

/**
 *
 * @author Ramdhan Maulana RM
 */
public class Giro extends Rekening implements LayananKeuangan {

    public Giro(int id, double saldo) {
        super(id, "Giro", saldo);
    }

    @Override
    public double hitungBunga() {
        return saldo * 0.005;
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