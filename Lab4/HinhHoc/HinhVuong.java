package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    
    public HinhVuong(){
        
    }
    
    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh = ");
        dai = rong = sc.nextFloat();
    }
}