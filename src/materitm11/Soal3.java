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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, data[], large, x, i;
        System.out.println("Inputkan Banyak Bilangan Array = ");
        n = input.nextInt();
        
        data = new int[n];
        
        for(i = 0; i < n; i++){
            System.out.println("inputkan data array ke-"+(i+1));
            data[i] = input.nextInt();
        }
        
        large = data[0];
        x = 1;
        
        while(x < i){
            if(data[x] > large){
                large = data[x];
            }else {
                x += 1;
            }
        }
        
        System.out.println("Nilai Maksimum dari data array yang diberikan adalah "+large);
    }
}
