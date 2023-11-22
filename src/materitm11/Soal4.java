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
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris (n): ");
        int n = input.nextInt();
        System.out.print("Masukkan jumlah kolom (m): ");
        int m = input.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Masukkan elemen-elemen matriks:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Masukkan elemen pada baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                matrix[i][j] = input.nextInt();
            }
        }

        int minValue = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }

        // Output nilai minimum
        System.out.println("Nilai minimum dari matriks adalah: " + minValue);
    }
}
