import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt(); 
        checker(angka);
    }
    public static int selde(int angka){       
        int selde = 0;        
        while(angka != 0){ 
            int sisa = angka % 10;
            selde = selde * 10 + sisa;
            angka = angka / 10;
        }
        return selde;
    }
    public static boolean checker(int angka){
        int checker = angka;
        if(checker == selde(angka))
            System.out.println(angka + " adalah selde.");
        else
            System.out.println(angka + " bukan selde.");
        return true;
    }
}