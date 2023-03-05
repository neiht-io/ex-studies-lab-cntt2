
package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    
    public HinhChuNhat(){
        
    }
    
    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai = ");
        dai = sc.nextFloat();
    }
    
    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong = ");
        rong = sc.nextFloat();
    }
    
    public void tinhChuVi(){
        chuVi = (dai + rong) * 2;
    }
    
    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}