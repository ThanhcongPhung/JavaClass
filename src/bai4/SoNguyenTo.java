package bai4;

import java.util.Scanner;

public class SoNguyenTo {
    int a;

    public SoNguyenTo() {
        a = 0;
    }

    public SoNguyenTo(int x) {
        if (isSoNguyenTo(x) == true) {
            this.a = x;
            System.out.printf("%d la so nguyen to\n", x);
            System.out.println("So nguyen to tiep theo: " + soNguyenToTiep());
        } else {
            System.out.printf("%d khong la so nguyen to\n", x);
        }
    }

    public boolean isSoNguyenTo(int x) {
        boolean flag = true;
        if (x < 2) {
            flag = false;
        } else {
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public int soNguyenToTiep() {
        int songuyentotiep;
        int i = 0;
        while (true) {
            if (isSoNguyenTo(this.a + ++i)) {
                return this.a + i;
            }
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        x = sc.nextInt();
        SoNguyenTo snt = new SoNguyenTo(x);
    }

}
