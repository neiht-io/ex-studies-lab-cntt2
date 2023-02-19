/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;

public class GiaiPTBac1 {

    
    public static void main(String[] args) {
        float a, b, x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi nhap a: ");
        a = sc.nextInt();
        System.out.println("Moi nhap b: ");
        b = sc.nextInt();
        if (a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            x = -b/a;
            System.out.println("Phuong trinh co nghiem x ="+x);
        }
    }
    
    
}