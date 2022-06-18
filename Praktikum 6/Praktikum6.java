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
public class Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Manusia
        System.out.println("-----------------Manusia-------------------");
        Manusia man1 = new Manusia("Farhan Hafidz", "215150707111035", true, true);       
        System.out.println(man1.toString());
        Manusia woman1 = new Manusia("Ika", "323232323", false, false);
        System.out.println("-------------------------------------------");
        System.out.println(woman1.toString());
        Manusia man2 = new Manusia("Rajak", "313131313", true, true);
        System.out.println("-------------------------------------------");
        System.out.println(man2.toString());    
        System.out.println("");
        
        //Mahasiswa
         System.out.println("-----------------Mahasiswa----------------");
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70); 
        System.out.println(mhs1.toString());
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Bayu Wicakson", "35678910282", true, false, "19515040111032", 3.6);
        System.out.println("-------------------------------------------");
        System.out.println(mhs2.toString());
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Farhan Hafidz", "36789101112", false, false, "215150707111035", 3.8);
        System.out.println("-------------------------------------------");
        System.out.println(mhs3.toString()); 
        System.out.println("");
        
        //pekerja
         System.out.println("-----------------Pekerja------------------");
        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        System.out.println(pekerja1.toString());
        Pekerja pekerja2 = new Pekerja(10, 20, "151234566786", "Rokiroki", "372635678", true, true);
        System.out.println("-------------------------------------------");
        System.out.println(pekerja2.toString());
        Pekerja pekerja3 = new Pekerja(8, 23, "121245667865", "Lilnus", "301232323", false, false);
        System.out.println("-------------------------------------------");
        System.out.println(pekerja3.toString());
        System.out.println("");

        //manajer
         System.out.println("-----------------Manajer-------------------");
        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        System.out.println(manajer1.toString());
        Manajer manajer2 = new Manajer(7, 30, "301901389401", "Arnold", "334293648324", true, true, 1300);
        System.out.println("-------------------------------------------");
        System.out.println(manajer2.toString());
        Manajer manajer3 = new Manajer(8, 25, "417802734928", "Juna", "3498275632038", false, false, 1400);
        System.out.println("-------------------------------------------");
        System.out.println(manajer3.toString());     
    }
}