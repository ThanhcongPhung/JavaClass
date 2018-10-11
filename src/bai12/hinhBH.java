package bai12;

import java.util.Scanner;

public class hinhBH extends polygon implements polygon.TinhToan {
    private int cCao;
    @Override
    public int chuVi() {
        return 2*(cDai+cRong);
    }

    @Override
    public int dienTich() {
        return cDai*cCao;
    }
    @Override
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        cDai=sc.nextInt();
    }

}
