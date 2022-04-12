/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erigostore;
import java.util.Scanner;
/**
 *
 * @author kakaahan
 */
public class ErigoStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Baju baju = new Baju();
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = in.nextLine();
        baju.setJenis(jenis);
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int jumlah = in.nextInt();
        baju.setJumlah(jumlah);         
        baju.display();
    }
} 