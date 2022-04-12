/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erigostore;
public class Baju {
    private String jenis;
    private int harga;
    private int jumlah;
    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    void hargaA() {
        if (jumlah > 100) {
            harga = 95000;
        } else {
            harga = bajuA;
        }
    }

    void hargaB() {
        if (jumlah > 100) {
            harga = 120000;
        } else {
            harga = bajuB;
        }
    }

    void hargaC() {
        if (jumlah > 100) {
            harga = 160000;          
        } else {
            harga = bajuC;            
        }
    }

    void display() {        
        if (jenis.equalsIgnoreCase("a")) {
            hargaA();
        } else if (jenis.equalsIgnoreCase("b")) {
            hargaB();
        } else if (jenis.equalsIgnoreCase("c")) {
            hargaC();
        }
          System.out.println("Jenis yang anda beli : " + jenis);
          System.out.println("harga Per buah       : " + harga);
          System.out.println("Total harga          : " + harga * jumlah);
    }

}
