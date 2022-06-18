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
public class Praktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai pegawai;
        //Pegawai Tetap
        System.out.println("===============");
        System.out.println("|Pegawai Tetap|");
        System.out.println("===============");
        pegawai = new PegawaiTetap("Farhan Hafidz", "215150707111035", 2500000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("Fitra Edi", "3219383316", 2700000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("Mobi Moto", "293814861936493", 1600000);
        System.out.println(pegawai.toString() + "\n");
        
        //Pegawai Harian
        System.out.println("================");
        System.out.println("|Pegawai Harian|");
        System.out.println("================");
        pegawai = new PegawaiHarian("Hari Magu", "31987123602", 7000, 30);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("Phil Foe", "31087128381", 7000, 40);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("Karim Haji", "34517235671", 7000, 50);
        System.out.println(pegawai.toString() + "\n");
        
        //Sales
        System.out.println("=======");
        System.out.println("|Sales|");
        System.out.println("=======");
        pegawai = new Sales("Rodrido B", "3456234284", 40, 12500);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Lucas Madrid", "3910347103", 54, 125000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Ben De Brue", "33242342343", 70, 12500);
        System.out.println(pegawai.toString() + "\n");
    }
    
}