package bai8;

import java.util.Scanner;

public class sophuc {
    int phanThuc;
    int phanAo;

    public sophuc() {
    }

    public sophuc(int a, int b) {
        this.phanThuc = a;
        this.phanAo = b;
    }

    public int nhapX() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }

    public sophuc inputInfo() {
        System.out.print("Phan thuc = ");
        int a = nhapX();
        System.out.print("Phan ao = ");
        int b = nhapX();
        sophuc A = new sophuc(a, b);
        return A;
    }

    public sophuc congSp(sophuc A, sophuc B) {
        sophuc C = new sophuc();
        C.phanThuc = A.phanThuc + B.phanThuc;
        C.phanAo = A.phanAo + B.phanAo;
        return C;
    }

    public sophuc truSp(sophuc A, sophuc B) {
        sophuc C = new sophuc();
        C.phanThuc = A.phanThuc - B.phanThuc;
        C.phanAo = A.phanAo - B.phanThuc;
        return C;
    }

    public sophuc tichSP(sophuc A, sophuc B) {
        sophuc C = new sophuc();
        C.phanThuc = A.phanThuc * B.phanThuc - A.phanAo * B.phanAo;
        C.phanAo = A.phanThuc * B.phanAo + A.phanAo * B.phanThuc;
        return C;
    }

    public sophuc chiaSP(sophuc A, sophuc B) {
        sophuc C = new sophuc();
        C.phanThuc = (A.phanThuc * B.phanThuc + A.phanAo * B.phanAo) / ((B.phanThuc ^ 2 + B.phanAo ^ 2));
        C.phanAo = (A.phanAo * B.phanThuc - A.phanThuc * B.phanAo) / ((B.phanThuc ^ 2 + B.phanAo ^ 2));
        return C;
    }

    public static void main(String[] args) {
        System.out.println("So phuc A: ");
        sophuc A = new sophuc();
        A = A.inputInfo();
        System.out.println("So phuc B: ");
        sophuc B = new sophuc();
        B = B.inputInfo();

        sophuc Sum = new sophuc();
        Sum = Sum.congSp(A, B);
        System.out.println("Tong 2 so phuc = " + Sum.phanThuc + "+ i*" + Sum.phanAo);
        sophuc Sub = new sophuc();
        Sub = Sub.truSp(A, B);
        System.out.println("Hieu 2 so phuc = " + Sub.phanThuc + "+ i*" + Sub.phanAo);
        sophuc Mul = new sophuc();
        Mul = Mul.tichSP(A, B);
        System.out.println("Nhan 2 so phuc = " + Mul.phanThuc + "+ i*" + Mul.phanAo);
        sophuc Div = new sophuc();
        Div = Div.chiaSP(A, B);
        System.out.println("Chia 2 so phuc = " + Div.phanThuc + "+ i*" + Div.phanAo);
    }

}
