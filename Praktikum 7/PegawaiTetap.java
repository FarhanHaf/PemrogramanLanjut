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
public class PegawaiTetap extends Pegawai{
    private double upah;
    
    public PegawaiTetap(String nama, String noKTP, double upah){
       super(nama, noKTP); 
       this.upah = upah;
    }
    
    public void setUpah(double upah){
        this.upah = upah;
    }
    
    public double getUpah(){
        return upah;
    }
    
    @Override
    public double gaji(){
        return upah;    
    }
    
    @Override
    public String toString(){
        return "Pegawai Tetap\t: " + getNama() + "\nNo. KTP\t\t: " + getNoKTP() + "\nUpah\t\t: " + getUpah() 
                + "\nPendapatan\t: Rp." + gaji(); 
    }
}