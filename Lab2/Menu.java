/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int numBer;
        do{
        Scanner sc = new Scanner (System.in);
        System.out.println("+------------------------+");
        System.out.println("1. Giai Phuong Trinh Bac 1.");
        System.out.println("2. Giai Phuong Trinh Bac 2 ");
        System.out.println("3. Tinh Tien Dien.");
        System.out.println("4. Ket Thuc.");
        System.out.println("+------------------------+");
        System.out.println("Chon Chuc Nang: ");
        numBer = sc.nextInt();
        }while (numBer < 1 || numBer > 4);
        switch (numBer){
            case 1:
                System.out.println("Giai Phuong Trinh Bac 1.");
                giaiPTB1(); 
                break;
            case 2:
                System.out.println("Giai Phuong Trinh Bac 2.");
                giaiPTB2();
                break;
            case 3:
                System.out.println("Tinh Tien Dien.");
                tinhTienDien();
                break;  
            case 4:
                System.out.println("Ket Thuc.");
                break;    
            }
    }
    
    public static void giaiPTB1() {
        float a, b, x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi nhap a: ");
        a = sc.nextInt();
        System.out.println("Moi nhap b: ");
        b = sc.nextInt();
        if (a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
                x = -b/a;
                System.out.println("Phuong trinh co nghiem x ="+x);
        }
    }
    
    public static void giaiPTB2(){
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
    
    public static void tinhTienDien(){
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