/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author kakaahan
 */
public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getJenisKelamin() {
        String jenisKelamin2;
        if (jenisKelamin) {
            jenisKelamin2 = "Laki-laki";
        }
        else {
            jenisKelamin2 = "Perempuan";
        }
        return jenisKelamin2;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan;
        if (jenisKelamin && menikah) {
            tunjangan = 25;
        }

        else if (!jenisKelamin && menikah) {
            tunjangan = 20;
        }

        else {
            tunjangan = 15;
        }

        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "Nama           : "+getNama()+"\nNIK            : "+getNIK()+
            "\nJenis Kelamin  : " +getJenisKelamin()+"\nPendapatan     : "+getPendapatan()+"$";
    }

}