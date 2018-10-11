package bai9;
import java.util.Scanner;

public class vector {
    private int hddau,hdcuoi,tddau,tdcuoi;
    public vector(){}
    public vector(int x1,int x2,int y1,int y2){
        this.hddau=x1;
        this.tddau=y1;
        this.hdcuoi=x2;
        this.tdcuoi=y2;
    }
    public int nhapX(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }
    public vector inputInfo(){
        System.out.print("Phan hoanh do dau = ");
        int x1=nhapX();
        System.out.print("Phan tung do dau = ");
        int y1=nhapX();
        System.out.print("Phan hoanh do cuoi = ");
        int x2=nhapX();
        System.out.print("Phan tung do cuoi = ");
        int y2=nhapX();
        vector A= new vector(x1,y1,x2,y2);
        return A;
    }

    public static void main(String[] args) {
        System.out.println("Nhap vector A: ");
        vector A = new vector();
        A = A.inputInfo();
        System.out.println("Nhap vector B: ");
        vector B=new vector();
        B=B.inputInfo();


    }
}
