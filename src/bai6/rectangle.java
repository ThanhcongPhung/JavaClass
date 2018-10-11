package bai6;

import java.util.Scanner;

public class rectangle {
    double cDai;
    double cRong;
    rectangle(){}
    rectangle(double cDai,double cRong){}

    public double getcDai() {
        return cDai;
    }

    public double getcRong() {
        return cRong;
    }

    public void setcDai(double cDai) {
        this.cDai = cDai;
    }

    public void setcRong(double cRong) {
        this.cRong = cRong;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        cDai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        cRong = sc.nextDouble();
    }
    public double dTich(double dienTich){
        dienTich = cDai*cRong;
        return dienTich;
    }
    public double cVi(double chuVi){
        chuVi = (cDai+cRong)*2;
        return chuVi;
    }
    public static void main(String[] args) {
        double dienTich=0;
        double chuVi=0;
        rectangle rc = new rectangle();
        rc.inputInfo();


        System.out.println("Dien tich la: " + rc.dTich(dienTich));
        System.out.println("Chu vi la: " + rc.cVi(chuVi));
    }
}
