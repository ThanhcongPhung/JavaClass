package bai2;

import java.util.Scanner;

public class student {
    private String maSo;
    private double diemTB;
    private int tuoi;
    private String lop;

    student() {
    }

    student(String maSo, double diemTB, int tuoi, String lop) {
    }

    public String getMaSo(String maSo) {
        return maSo;
    }

    public double getDiemTB(double diemTB) {
        return diemTB;
    }

    public int getTuoi(int tuoi) {
        return tuoi;
    }

    public String getLop(String lop) {
        return lop;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setStudent(String lop) {
        this.lop = lop;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap MSSV: ");
        maSo = sc.nextLine();
        do {
            System.out.println("Nhap diem TB: ");
            diemTB = sc.nextDouble();
        } while (!(diemTB <= 10.0 && diemTB >= 0.0));
        do {
            System.out.println("Nhap tuoi: ");
            tuoi = sc.nextInt();
            sc.nextLine();
        } while (!(tuoi >= 18));
        System.out.println("Nhap lop: ");
        lop = sc.nextLine();
    }

    public void printInfo() {
        System.out.println("Thong tin sinh vien");
        System.out.println("MSSV: " + maSo);
        System.out.println("Diem TB: " + diemTB);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Lop: " + lop);
    }

    public void xetHB() {
        if (diemTB >= 8.0) {
            System.out.println("Sinh vien duoc hoc bong");
        } else {
            System.out.println("Sinh vien khong duoc hoc bong");
        }
    }

    public static void main(String[] args) {
        student st = new student();
        st.inputInfo();
        st.printInfo();
        st.xetHB();
    }
}
