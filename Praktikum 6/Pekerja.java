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
public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        gaji = getHariKerja() * getJamKerja() * 15;
        setGaji(gaji);
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        int normalDay = getHariKerja() - 6;
        int lembur = getJamKerja() - 7;
        double bonusLembur = normalDay * lembur * 7;
        double bonusLibur = 6 * getJamKerja() * 20;

        bonus = bonusLembur + bonusLibur;
        setBonus(bonus);
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus() {
        String departement = null;
        String branch = null;
        char branchNum = getNIP().charAt(2);

        if (getNIP().charAt(0) == '1') {
            branch = "Mondstadt";
        }

        else if (getNIP().charAt(0) == '2') {
            branch = "Liyue";
        }

        else if (getNIP().charAt(0) == '3') {
            branch = "Inazuma";
        }

        else if (getNIP().charAt(0) == '4') {
            branch = "Sumeru";
        }

        else if (getNIP().charAt(0) == '5') {
            branch = "Fontaine";
        }

        else if (getNIP().charAt(0) == '6') {
            branch = "Natlan";
        }

        else if (getNIP().charAt(0) == '7') {
            branch = "Snezhnaya";
        }

        if (getNIP().charAt(6) == '1') {
            departement = "Pemasaran";
        }

        else if (getNIP().charAt(6) == '2') {
            departement = "Humas";
        }

        else if (getNIP().charAt(6) == '3') {
            departement = "Riset";
        }

        else if (getNIP().charAt(6) == '4') {
            departement = "Teknologi";
        }

        else if (getNIP().charAt(6) == '5') {
            departement = "Personalia";
        }

        else if (getNIP().charAt(6) == '6') {
            departement = "Akademik";
        }

        else if (getNIP().charAt(6) == '7') {
            departement = "Administrasi";
        }

        else if (getNIP().charAt(6) == '8') {
            departement = "Operasional";
        }

        else if (getNIP().charAt(6) == '9') {
            departement = "Pembangunan";
        }

        return departement+", "+branch+" cabang ke- "+branchNum;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + getGaji();
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus          : "+getBonus()+"$"+"\nGaji           : "+getGaji()+
                "$"+"\nStatus         : "+getStatus();
    }
}