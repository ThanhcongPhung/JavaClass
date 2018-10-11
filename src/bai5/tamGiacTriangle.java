package bai5;
import java.util.Scanner;
public class tamGiacTriangle {
    int a,b,c;
    tamGiacTriangle(){}
    tamGiacTriangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap A: ");
        a=sc.nextInt();
        System.out.println("Nhap B: ");
        b=sc.nextInt();
        System.out.println("Nhap C: ");
        c=sc.nextInt();
    }
    public void kieuTG(){
        int a=0,b=0,c=0;

        if((a==c)||(a==b)){
            System.out.println("Tam giac can");
        }else if((a==c)&&(a==b)){
            System.out.println("Tam giac deu");
        }else if(((a^2)==(b^2+c^2))||((b^2)==(a^2+c^2))||((c^2)==(b^2+c^2))){
            System.out.println("Tam giac vuong");
        }else if(!((a==c)&&(a==b))){
            System.out.println("Tam giac thuong");
        }
    }
    public void tinhToan(){
        float p;
        p=a+b+c;
        System.out.println("Chu vi tam giac la: " + p);
        float s;
        s=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich tam giac la: " + s);
    }

    public static void main(String[] args) {
        tamGiacTriangle tg = new tamGiacTriangle();
        tg.inputInfo();
        tg.kieuTG();
        tg.tinhToan();
    }
}
