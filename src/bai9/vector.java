package bai9;

import java.util.Scanner;

public class vector {
    double hddau, hdcuoi, tddau, tdcuoi;

    public vector() {
    }

    public vector(double x1, double y1, double x2, double y2) {
        this.hddau = x1;
        this.tddau = y1;
        this.hdcuoi = x2;
        this.tdcuoi = y2;
    }

    public void isValues(vector h, vector g) {
        if (((h.hdcuoi - h.hddau) == (g.hdcuoi - g.hddau) && ((h.tdcuoi - h.tddau) == (g.tdcuoi - g.tddau)))) {
            System.out.println("Hai vecto bang nhau");

        } else {
            System.out.println("Khong bang nhau");
        }
    }

    public double nhapX() {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        return x;
    }

    public vector inputInfo() {
        System.out.print("Phan hoanh do dau = ");
        double x1 = nhapX();
        System.out.print("Phan tung do dau = ");
        double y1 = nhapX();
        System.out.print("Phan hoanh do cuoi = ");
        double x2 = nhapX();
        System.out.print("Phan tung do cuoi = ");
        double y2 = nhapX();
        vector A = new vector(x1, y1, x2, y2);
        return A;
    }

    public void vecto(vector g) {
        double hd, td;
        hd = g.hdcuoi - g.hddau;
        td = g.tdcuoi - g.tddau;
        System.out.println("Vector: (" + hd + "," + td + ")");
    }


    public double khoangCach() {
        return Math.sqrt((hdcuoi - hddau) * (hdcuoi - hddau) + (tdcuoi - tddau) * (tdcuoi - tddau));
    }

    public double goc2Vecto(vector g, vector h) {
        double temp1 = (g.hdcuoi - g.hddau) * (h.tdcuoi - h.tddau) + (g.tdcuoi - g.tddau) * (h.hdcuoi - h.hddau);
        return Math.acos(temp1 / (g.khoangCach() * h.khoangCach()));
    }

    public void congVecto(vector g, vector h) {
        System.out.println("Tong 2 vecto: (" + ((g.hdcuoi - g.hddau) + (h.hdcuoi - h.hddau)) + "," + ((g.tdcuoi - g.tddau) + (h.tdcuoi - h.tddau)) + ")");
    }

    public void truVecto(vector g, vector h) {
        System.out.println("Tong 2 vecto: (" + ((g.hdcuoi - g.hddau) - (h.hdcuoi - h.hddau)) + "," + ((g.tdcuoi - g.tddau) - (h.tdcuoi - h.tddau)) + ")");
    }

    public void nhanVecto(vector g, vector h) {
        System.out.println("Tong 2 vecto: (" + ((g.hdcuoi - g.hddau) * (h.hdcuoi - h.hddau)) + "," + ((g.tdcuoi - g.tddau) * (h.tdcuoi - h.tddau)) + ")");
    }

    public static void main(String[] args) {

        vector A = new vector();
        System.out.println("Nhap vector A : ");
        A = A.inputInfo();
        A.vecto(A);
        vector B = new vector();
        System.out.println("Nhap vector : ");
        B = B.inputInfo();
        B.vecto(B);
        vector C = new vector();
        C.isValues(A, B);
        System.out.println("Goc cua 2 vec to la: " + C.goc2Vecto(A, B));
        C.congVecto(A, B);
        C.truVecto(A, B);
        C.nhanVecto(A, B);

    }
}

