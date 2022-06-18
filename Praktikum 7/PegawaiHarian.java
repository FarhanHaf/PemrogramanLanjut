/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author kakaahan
 */
public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;
      
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }
    
    public double getUpahPerJam(){
        return upahPerJam;
    }
    
    public int getTotalJam(){
        return totalJam;
    }
    
    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }
    
    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }
    
    @Override
    public double gaji(){
        if(totalJam <= 40)
            return getUpahPerJam() * getTotalJam();
        else
            return ((getUpahPerJam() * 40) + (getTotalJam() - 40) * getUpahPerJam() * 1.5); 
    }
    
    @Override
    public String toString(){
        return "Pegawai Harian\t: " + getNama() + "\nNo. KTP\t\t: " + getNoKTP() 
                + "\nUpah per Jam\t: " + getUpahPerJam() + "\nTotal Jam Kerja\t: " + getTotalJam()
                + "\nPendapatan\t: Rp." + gaji(); 
    }
}