/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;

public class KTSoChinhPhuong {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Nhap mot so: ");
        n = sc.nextInt();
        }while (n <= 0);
        int a = (int)Math.sqrt(n);
        if (a*a == n){
            System.out.println(n + " La so chinh phuong");
        }else{
            System.out.println(n + " Khong la so chinh phuong");
        }
    }
    
}