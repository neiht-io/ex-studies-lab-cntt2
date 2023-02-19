/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;

public class MaTranDX {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        rows = sc.nextInt();
        System.out.println("Nhap so cot: ");
        cols = sc.nextInt();
        int mt [][] = new int [rows][cols];
        System.out.println("Nhap vao so phan tu: ");
        for ( int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("mt[" + i + "," + j + "] = ");
                mt[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma tran sau khi nhap la: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print( mt[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}