/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;


/**
 *
 * @author sang
 */
public class GiaiPTBac2 {
    
    public static void main(String[] args) {
        double  a, b, c, x1, x2, delta;
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi nhap a: ");
        a = sc.nextDouble();
        System.out.println("Moi nhap b: ");
        b = sc.nextDouble();
        System.out.println("Moi nhap c: ");
        c = sc.nextDouble();
        if (a==0){
            if(b==0){
                if(c==0){
                System.out.println("Phuong trinh vo so nghiem");
                }
                else{
                System.out.println("Phuong trinh vo nghiem");
                }
            }
            else{
            x1 = -c/b;
            System.out.printf("Phuong trinh co nghiem x =%.2f ",x1);
            }   
        }
        else{
            delta = b*b - 4*a*c;
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if (delta == 0){
                x1 = -b/(2*a);
                System.out.printf("Phuong trinh co nghiem kep x1 = %.2f", x1);
            }
            else{
                x1 = (-b+Math.sqrt(delta))/(2*a);
                x2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.println("Nghiem thu nhat x1 = " + x1);
                System.out.println("Nghiem thu nhat x2 = " + x2);
            }
        }
    }    
}