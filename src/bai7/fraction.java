package bai7;

import java.util.Scanner;

public class fraction {
    private int tuSo;
    private int mauSo;

    fraction() {
    }

    fraction(int a, int b) {
        this.tuSo = a;
        this.mauSo = b;
    }

    public fraction inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tuSo = sc.nextInt();
        System.out.println("Nhap mau so: ");
        mauSo = sc.nextInt();
        fraction A = new fraction(tuSo, mauSo);
        return A;
    }

    public void printInfo() {
        System.out.println("Phan so: " + tuSo + "/" + mauSo);
    }

    public int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void rutGon() {
        int uc = UCLN(tuSo, mauSo);
        tuSo = tuSo / uc;
        mauSo = mauSo / uc;
        System.out.println("Phan so: " + tuSo + "/" + mauSo);
    }
    public fraction congPS(fraction A, fraction B) {
        fraction C = new fraction();
        C.tuSo=B.mauSo*A.tuSo+A.mauSo*B.tuSo;
        C.mauSo=A.mauSo*B.mauSo;
        return C;
    }
    public fraction truPS(fraction A, fraction B) {
        fraction C = new fraction();
        C.tuSo=B.mauSo*A.tuSo-A.mauSo*B.tuSo;
        C.mauSo=A.mauSo*B.mauSo;
        return C;
    }
    public fraction nhanPS(fraction A, fraction B) {
        fraction C = new fraction();
        C.tuSo=A.tuSo*B.tuSo;
        C.mauSo=A.mauSo*B.mauSo;
        return C;
    }
    public fraction chiaPS(fraction A, fraction B) {
        fraction C = new fraction();
        C.tuSo=A.tuSo*B.mauSo;
        C.mauSo=A.mauSo*B.tuSo;
        return C;
    }
    public static void main(String[] args) {
        fraction fc = new fraction();
        fc.inputInfo();
        fc.printInfo();
        fc.rutGon();
        System.out.println("So phuc A: ");
        fraction A = new fraction();
        A = A.inputInfo();
        System.out.println("So phuc B: ");
        fraction B = new fraction();
        B = B.inputInfo();
        fraction Sum = new fraction();
        Sum = Sum.congPS(A, B);
        System.out.println("Tong 2 phan so = " + Sum.tuSo + "/" + Sum.mauSo);
        fraction Sub = new fraction();
        Sub = Sub.truPS(A, B);
        System.out.println("Hieu 2 phan so = " + Sub.tuSo + "/" + Sub.mauSo);
        fraction Mul = new fraction();
        Mul = Mul.nhanPS(A, B);
        System.out.println("Tich 2 phan so = " + Mul.tuSo + "/" + Mul.mauSo);
        fraction Div = new fraction();
        Div = Div.chiaPS(A, B);
        System.out.println("Thuong 2 phan so = " + Div.tuSo + "/" + Div.mauSo);
    }

}
