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
public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;
    
    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }
    
    public int getPenjualan(){
        return penjualan;
    }
    
    public double getKomisi(){
        return komisi;
    }
    
    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }
    
    public void setKomisi(double komisi){
        this.komisi = komisi;
    }
    
    @Override
    public double gaji(){
        return getPenjualan() * getKomisi();
    }
    
    @Override
    public String toString(){
        return "Sales\t\t: " + getNama() + "\nNo. KTP\t\t: " + getNoKTP() 
                + "\nTotal Penjualan\t: " + getPenjualan() + "\nBesaran Komisi\t: " + getKomisi()
                + "\nPendapatan\t: Rp." + gaji();
    }
}