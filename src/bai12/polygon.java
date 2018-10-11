package bai12;

import java.util.Scanner;

public class polygon {
    protected int cDai;
    protected  int cRong;
    public polygon(){}
    public polygon(int a,int b){
        this.cDai=a;
        this.cRong=b;
    }

    public interface TinhToan {
        int chuVi();
        int dienTich();

    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        cDai=sc.nextInt();
        System.out.println("Nhap chieu dai: ");
        cRong=sc.nextInt();
    }

}

