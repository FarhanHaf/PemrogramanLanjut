package com.company;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant merchant){
        Merchant[] merch = new Merchant[DataMerchant.merc.length + 1];

        for (int i = 0; i < DataMerchant.merc.length; i++){
            merch[i] = merc[i];
        }

        merch[DataMerchant.merc.length] = merchant;
        return merch;
    }

    public static void tampilData(){
        for (Merchant mrc1 : DataMerchant.merc) {
            System.out.println("=== Tampilan Data Merchant UBFOOD ===");
            System.out.println("Nama Merchant   : " + mrc1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mrc1.getNamaProduk());
            System.out.println("Harga           : " + (int) mrc1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant (String nama){
        int index = 0;
        for (int i = 0; i < DataMerchant.merc.length; i++){
            if (DataMerchant.merc[i].getNamaMerchant() == nama){
                index = i;
                break;
            }
        }
        return merc[index];
    }

    public static void tampilMerchant (Merchant merchant){
        System.out.println("=== Tampilan Data Merchant UBFOOD ===");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
    }

    public static void updateMerchant (Merchant merchant, String nMerchant, String nProduk, double harga){
        merchant.setNamaMerchant(nMerchant);
        merchant.setNamaProduk(nProduk);
        merchant.setHargaMakanan(harga);
    }
}

