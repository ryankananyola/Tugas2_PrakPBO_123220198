/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PerhitunganBangun;

/**
 *
 * @author USER
 */
public class Persegi implements OperasiBangun {
    
    private double panjang, lebar;
    
    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    // Membuat sebuah method Luas untuk mengimplementasikan interface OperasiBangunDatar
   
    @Override
    public double LuasPersegi() {
        return panjang * lebar;
    }

    
    // Membuat sebuah method Keliling untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double KelilingPersegi() {
        return 2 * (panjang + lebar);
    }
}
