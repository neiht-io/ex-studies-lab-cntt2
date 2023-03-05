package HinhHoc;

public class Main {
    public static void main(String[] args) {
        HinhTron HT = new HinhTron();
        HT.nhapBanKinh();
        HT.tinhChuVi();
        HT.inChuVi();
        HT.tinhDienTich();
        HT.inDienTich();
        
        HinhTru HTru = new HinhTru();
        HTru.nhapChieuCao();
        HTru.tinhTheTich();
        HTru.inTheTich();
        
        HinhChuNhat HCN = new HinhChuNhat();
        HCN.nhapChieuDai();
        HCN.nhapChieuRong();
        HCN.tinhChuVi();
        HCN.inChuVi();
        HCN.tinhDienTich();
        HCN.inDienTich();
        
        HinhVuong HV = new HinhVuong();
        HV.nhapCanh();
        HV.tinhChuVi();
        HV.inChuVi();
        HV.tinhDienTich();
        HV.inDienTich();
    }
}