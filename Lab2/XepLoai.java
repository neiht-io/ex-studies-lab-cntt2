/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;

public class XepLoai {
    public static void main(String[] args) {
        float diemTB;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Nhap diem trung binh: ");
        diemTB = sc.nextFloat();
        if (diemTB < 5.0 && diemTB >=0 ){
            System.out.println("Xep loai yeu");
        }else if (diemTB >= 5.0 && diemTB < 7.0){
            System.out.println("Xep loai trung binh");
        }else if (diemTB >= 7.0 && diemTB < 8.0){
            System.out.println("Xep loai kha");
        }else if (diemTB >= 8.0 && diemTB <= 10){
            System.out.println("Xep loai gioi");
        }else{
            System.out.println("Null");
        }
    }
}