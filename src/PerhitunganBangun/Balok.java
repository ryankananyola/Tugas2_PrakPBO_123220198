/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PerhitunganBangun;

/**
 *
 * @author USER
 */
public class Balok implements OperasiBalok{
    
    private double panjang, lebar, tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
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
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double VolumeBalok() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double LuasPermukaanBalok() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    
}
