/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package materitm11;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i < n; i += 2) {
                sum += i;
            }
        } else {
            System.out.println("Nilai n harus lebih dari 0");
            return;
        }

        System.out.println("Jumlah bilangan ganjil kurang dari " + n + " adalah: " + sum);
    }
}
