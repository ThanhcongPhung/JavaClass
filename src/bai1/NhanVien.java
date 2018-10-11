package bai1;

import java.util.Scanner;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int gioLam;

    NhanVien() {
    }

    NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int gioLam) {
    }

    public String getTen(String ten) {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi(int tuoi) {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi(String diaChi) {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong(double tienLuong) {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getGioLam() {
        return gioLam;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap tien luong: ");
        tienLuong = sc.nextInt();
        System.out.println("Nhap gio lam: ");
        gioLam = sc.nextInt();
    }

    public void printInfo() {
        System.out.println("Thong tin nhan vien");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tien luong: " + tienLuong);
        System.out.println("Gio lam: " + gioLam);
    }

    public double tinhThuong() {
        double thuong = 0;
        if (gioLam >= 200) {
            thuong = tienLuong + tienLuong * 0.2;
        } else if (gioLam < 200 && gioLam >= 100) {
            thuong = tienLuong + tienLuong * 0.1;
        } else if (gioLam < 100) {
            thuong = 0;
        }
        return thuong;
    }

}

class Main {

    public static void main(String[] args) {

        NhanVien nv = new NhanVien();
        nv.inputInfo();
        nv.printInfo();
        System.out.println("Tien thuong: " + nv.tinhThuong());
    }
}

