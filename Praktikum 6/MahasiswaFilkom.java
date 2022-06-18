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
public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String angkatan = "20"+getNIM().charAt(0) + getNIM().charAt(1);
        String prodi = null;

        if (getNIM().charAt(6) == '2') {
            prodi = "Teknik Meniup Gelembung";
        }
        else if (getNIM().charAt(6) == '3') {
            prodi = "Teknik Berburu Ubur Ubur";
        }
        else if (getNIM().charAt(6) == '4') {
            prodi = "Sistem Perhamburgeran";
        }
        else if (getNIM().charAt(6) == '6') {
            prodi = "Pendidikan Chum Bucket";
        }
        else if (getNIM().charAt(6) == '7') {
            prodi = "Teknologi Telepon Kerang";
        }

        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (getIPK() >= 3.0 && getIPK() <= 3.5) {
            beasiswa = 50;
        }

        else if (getIPK() > 3.5 && getIPK() <= 4) {
            beasiswa = 75;
        }

        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString()+"\nIPK            : "+getIPK()+"\nNIM            : "
                +getNIM()+"\nStatus         : "
                +getStatus();
    }
}