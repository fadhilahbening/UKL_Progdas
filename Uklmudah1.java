 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklmudah1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Uklmudah1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan total belanja: Rp. ");
        double total = scanner.nextDouble();
        double diskon = 0;
        if (total <= 100000) {
            diskon = 0;
        } else if (total >= 100000 && total <= 200000) {
            diskon = 0.1;  
        } else {
            diskon = 0.2; 
        }
        double jumlahDiskon = total * diskon;
        double totalBayar = total - jumlahDiskon;
        System.out.println("Total belanja: Rp " + total);
        System.out.println("Diskon: Rp " + jumlahDiskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
    
}