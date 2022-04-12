import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        int angka = input.nextInt();
        methodkaisar(kata,angka);
        }
    public static boolean methodkaisar(String kata, int angka){
        String suratkaisar = "";
        char alpabet;
        
        for(int i=0; i<kata.length(); i++){
            alpabet = kata.charAt(i);
            
            if(alpabet >= 'a' && alpabet <= 'z'){
                alpabet = (char)(alpabet + angka);
                
                if(alpabet>'z'){
                    alpabet = (char)(alpabet + 'a' - 'z' - 1);
                } suratkaisar = suratkaisar + alpabet;               
            }else if (alpabet >= 'A' && alpabet <= 'Z'){
                alpabet = (char)(alpabet + angka);
                
                if(alpabet>'Z'){
                    alpabet = (char)(alpabet + 'A' - 'Z' - 1);
                }suratkaisar = suratkaisar + alpabet;
            }else{
                suratkaisar = suratkaisar + alpabet;
            }
        }
        System.out.println(suratkaisar);
        return true;
    }
}