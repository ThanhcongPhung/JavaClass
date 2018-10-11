package bai17;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop{
    private ArrayList ProductList;

    public void addProduct() {
        ArrayList a1 = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        String name = sc.nextLine();
        a1.add(name);
        System.out.println("Nhap");

    }
}
