import java.io.*;
import java.util.*;

class Persegi{   
    void getLuas(int s){
        int luasPsegi = s * s;        
        System.out.print(luasPsegi);
    }
}

class Segitiga{
    void getLuas(int a, int t){
        int luasStiga = (a * t)/2;        
        System.out.print(luasStiga);
    }
}

class Lingkaran{
    void getLuas(int r)
    {
        if(r == 7 || r % 7 == 0){
            double hitungLuas = 22/7 * r * r ;
            int luasLingkaran = (int)hitungLuas;
            System.out.print((double)luasLingkaran);
        }else{
            double hitungLuas = 3.14* r * r;
            int luasLingkaran = (int)hitungLuas;
            System.out.print((double)luasLingkaran);
        }      
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        
        int menu = input.nextInt();
        switch(menu){
            case 1:
                int s = input.nextInt();               
                persegi.getLuas(s);
                break;
            case 2:
                int a = input.nextInt();
                int t = input.nextInt();               
                segitiga.getLuas(a,t);
                break;
            case 3:
                int r = input.nextInt();               
                lingkaran.getLuas(r);
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}    