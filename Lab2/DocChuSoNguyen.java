/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;

public class DocChuSoNguyen {
    public static void main(String[] args) {
        int a, b, c, n;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        }while (n<100 || n>999);
        a = n % 10;
        b = (n/10) % 10;
        c = n / 100;
        
        switch (c){
            case 1:
                System.out.print("Mot tram ");
                break;
            case 2:
                System.out.print("Hai tram ");
                break;
            case 3:
                System.out.print("Ba tram ");
                break;
            case 4:
                System.out.print("Bon tram ");
                break;
            case 5:
                System.out.print("Nam tram ");
                break;
            case 6:
                System.out.print("Sau tram ");
                break;
            case 7:
                System.out.print("Bay tram ");
                break;
            case 8:
                System.out.print("Tam tram ");
                break;
            case 9:
                System.out.print("Chin tram ");
                break;    
        }
        switch (b){
            case 1:
                System.out.print("muoi ");
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon muoi ");
                break;
            case 5:
                System.out.print("nam muoi ");
                break;
            case 6:
                System.out.print("sau muoi ");
                break;
            case 7:
                System.out.print("bay muoi ");
                break;
            case 8:
                System.out.print("tam muoi ");
                break;
            case 9:
                System.out.print("chin muoi ");
                break;    
        }
        switch (a){
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bon");
                break;
            case 5:
                System.out.println("nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            case 9:
                System.out.println("chin");
                break;    
        }
    }
}