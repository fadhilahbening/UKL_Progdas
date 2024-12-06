/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsulit2;

/**
 *
 * @author LENOVO
 */
public class Uklsulit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {5, -3, 7, 9, -1};
        String result = cariElemenNegatif(array);
        System.out.println("Hasilnya adalah: " + result);
    }

    public static String cariElemenNegatif(int[] array) {
        StringBuilder negatif = new StringBuilder();

        for (int num : array) {
            if (num < 0) {
                if (negatif.length() > 0) {
                    negatif.append(", ");
                }
                negatif.append(num);
            }
        }

        if (negatif.length() > 0) {
            return "Array mengandung elemen negatif: " + negatif.toString();
        } else {
            return "Array tidak mengandung elemen negatif.";
        }
       
        }
        public static void nama(){
            String nama[]={"Bella","Gisel"};
        }
    }
    
    

