/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasfaridsi5a;

/**
 *
 * @author Farid_muslim
 */
public class UasfaridSI5A {
     public int UasfaridSI5A(int n1) {
         int x = Integer.valueOf(n1);
         String hitung = Integer.toBinaryString(x);
         int test = Integer.valueOf(hitung);
        return test;
    }
    
    public String Rumus(String n1) {
        int angka = Integer.parseInt(n1);
        String hex = Integer.toHexString(angka);
        return hex;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
