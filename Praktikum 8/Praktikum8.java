/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author kakaahan
 */
public class Praktikum8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        System.out.println("Selamat datang di Game Filkom Defend");
        System.out.print("Masukkan nama player : ");
        String nama = scan.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan : ");
        System.out.println("1. Magician");
        System.out.println("2. Healer");
        System.out.println("3. Warrior");
        System.out.print("Masukkan pilihan: ");
        int pilih = 0;
        try {
            pilih = scan.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Masukkan angka yang sesuai");
            scan.nextLine();
            pilih = scan.nextInt();
        }
        scan.nextLine();

        if (pilih != 1 && pilih != 2 && pilih != 3){
            System.out.println("Masukkan angka yang sesuai");
            try {
                pilih = scan.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Masukkan angka yang sesuai");
                scan.nextLine();
                pilih = scan.nextInt();
            }
            scan.nextLine();
        }

        ArrayList<Character> hero = new ArrayList<>();

        switch (pilih) {
            case 1:
                hero.add(new Magician());
                break;
            case 2:
                hero.add(new Healer());
                break;
            case 3:
                hero.add(new Warrior());
                break;
            default:
                break;
        }

        hero.add(new Titan());

        System.out.println("Selamat datang " + nama);
        Class role = hero.get(0).getClass();
        System.out.println("Anda akan bermain sebagai " + role.getSimpleName());

        System.out.println("=== STATUS PLAYER ===");
        info(hero.get(0));
        System.out.println("=== STATUS MUSUH ===");
        info(hero.get(1));

        System.out.println();

        int i = 1;
        do {
            System.out.println("=== Turn " + i + " ===");
            if (hero.get(0).attack()) {
                hero.get(1).receiveDamage(hero.get(0).getAttack());
            }
            i++;
            System.out.println(nama + "'s HP \t:" + hero.get(0).getHP());
            System.out.println("Enemy's HP \t:" + hero.get(1).getHP());
            if (hero.get(1).getHP() == 0)
                break;

            System.out.println("=== Turn " + i + " ===");
            if (hero.get(0) instanceof Healer) {
                System.out.println("Hero mendapatkan heal!");
                ((Healer) hero.get(0)).heal();
            }

            if (hero.get(1).attack()) {
                hero.get(0).receiveDamage(hero.get(1).getAttack());
            }
            System.out.println(nama + "'s HP \t:" + hero.get(0).getHP());
            System.out.println("Enemy's HP \t:" + hero.get(1).getHP());
            i++;
        }
        while(hero.get(0).getHP() != 0 && hero.get(1).getHP() != 0);
        System.out.println("----------------------------------------");
        if (hero.get(0).getHP() == 0)
            System.out.println(nama + " Kalah");
        else
            System.out.println(nama + " Menang");

        System.out.println("=== STATUS PLAYER ===");
        info(hero.get(0));
        System.out.println("=== STATUS MUSUH ===");
        info(hero.get(1));
    }

    static void info(Character hero){
        Class role = hero.getClass();
        System.out.println("Role \t:" + role.getSimpleName() );
        hero.info();
    }
}