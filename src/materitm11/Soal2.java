/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materitm11;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan (n): ");
        int n = input.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Masukkan " + n + " bilangan:");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        
        double mean = (double) sum / n;

        double variance = 0;
        for (int i = 0; i < n; i++) {
            variance += Math.pow(numbers[i] - mean, 2);
        }
        variance /= (n - 1);
        
        System.out.println("Nilai varians dari bilangan-bilangan yang dimasukkan adalah: " + variance);
    }
}
