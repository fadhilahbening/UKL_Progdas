/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsedangg3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Uklsedangg3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] operators = { "*", "/", "%" };
        while (true) {
        int bilangan1 = random.nextInt(10) + 1; 
        int bilangan2 = random.nextInt(10) + 1; 
        String operator = operators[random.nextInt(3)];
        System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
        double jawabanPengguna = scanner.nextDouble();
        double hasil = 0;
            switch (operator) {
                case "*":
                    hasil = bilangan1 * bilangan2;
                    break;
                case "/":
                    hasil = (double) bilangan1 / bilangan2;
                    break;
                case "%":
                    hasil = bilangan1 % bilangan2;
                    break;
           
            
            }

           
            if (jawabanPengguna == hasil) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Hasil yang benar adalah: " + hasil);
            }

            
            System.out.print("Apakah Anda ingin melanjutkan kuis? (y/n): ");
            String lanjut = scanner.next();
            
            
            if (lanjut.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih telah mengikuti kuis!");
                break; 
            } else if (lanjut.equalsIgnoreCase("y")) {
                continue; 
            } else {
                System.out.println("Pilihan tidak valid. Kuis akan berhenti.");
                break; 
            }
        }
    }    
    }
    

