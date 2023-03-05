package HinhHoc;
import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float banKinh;
    
    public HinhTron(){
        
    }
    
    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh = ");
        banKinh = sc.nextFloat();
    }
    
    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;
    }
    
    public void tinhDienTich(){
        dienTich = PI * banKinh * banKinh;
    }
}