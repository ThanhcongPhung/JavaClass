package bai3;

import java.util.Scanner;

public class HocBong {
    String hoTen;
    String khoaHoc;
    double diemTB;
    int viPham;
    int lanThi;

    public HocBong() {
    }

    public HocBong(String hoTen, String khoaHoc, double diemTB, int viPham, int lanThi) {
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ten khoa hoc: ");
        khoaHoc = sc.nextLine();
        System.out.print("Nhap diem TB: ");
        diemTB = sc.nextDouble();
        System.out.print("So lan vi pham: ");
        viPham = sc.nextInt();
        System.out.print("Nhap so lan thi: ");
        lanThi = sc.nextInt();
    }

    public void kiemTra() {
        String s1 = "HDSE";
        if ((khoaHoc.equals(s1)) && (diemTB >= 7.5) && (viPham == 0) && (lanThi == 1)) {
            System.out.println("Sinh vien duoc hoc bong");
        } else {
            System.out.println("Sinh vien khong duoc hoc bong");
        }
    }

    public static void main(String[] args) {
        HocBong hb = new HocBong();
        hb.inputInfo();
        hb.kiemTra();
    }

}
