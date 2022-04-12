package com.company;

import javax.xml.crypto.Data;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));
        DataMerchant.tampilData();
        System.out.println();

        //tambah data melalui input
        System.out.println("===Tambah Data Merchant Melalui Input===");
        System.out.print("Nama Merchant   : ");
        String nMerchant = input.nextLine();
        System.out.print("Nama Produk     : ");
        String nProduk = input.nextLine();
        System.out.print("Harga           : ");
        double harga = input.nextDouble();
        input.nextLine();

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(nMerchant, nProduk, harga));
        System.out.println();

        //data update
        DataMerchant.tampilData();
        System.out.println();

        System.out.println("==== Merchant UBFOOD====");

        System.out.print("Merchant        : ");
        String namamerchant = input.nextLine();
        System.out.print("Produk          : ");
        String produk = input.nextLine();
        System.out.print("Harga           : ");
        double hargabaru = input.nextDouble();

        DataMerchant.updateMerchant(DataMerchant.cariMerchant(namamerchant), namamerchant, produk, hargabaru);

        //menampilkan data merchant yang diupdate dengan metode pencarian
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"));
    }
}
