package HinhHoc;
import java.util.Scanner;

public class HinhTru extends HinhTron{
    public float chieuCao;
    
    public HinhTru(){
        
    }
    
    public void nhapChieuCao(){
        nhapBanKinh();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao = ");
        chieuCao = sc.nextFloat();
    }
    
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}