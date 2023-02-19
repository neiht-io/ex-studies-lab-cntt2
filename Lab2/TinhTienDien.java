/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;

public class TinhTienDien {

    public static void main(String[] args) {
        int soDien, tienDien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        soDien = sc.nextInt();
        if (soDien < 50){
            tienDien = soDien * 1000;
        }else{
            tienDien = 50*1000 + (soDien - 50) * 1200;
        }
        System.out.println("Tien dien la: "+ tienDien);
    }
    
}