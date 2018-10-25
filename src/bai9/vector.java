package bai10;


public class DaThuc {
    private int[] heSo;
    private int bac;

    public DaThuc(int a, int b) {
        heSo = new int[b + 1];
        heSo[b] = a;
        bac = degree();
    }

    public DaThuc(DaThuc p) {
        heSo = new int[p.heSo.length];
        for (int i = 0; i < p.heSo.length; i++) {
            heSo[i] = p.heSo[i];
        }
        bac = p.degree();
    }

    public int degree() {
        int d = 0;
        for (int i = 0; i < heSo.length; i++) {
            if (heSo[i] != 0) d = i;
        }
        return d;
    }

    public DaThuc cong(DaThuc b) {
        DaThuc a = this;
        DaThuc c = new DaThuc(0, Math.max(a.bac, b.bac));
        for (int i = 0; i <= a.bac; i++) c.heSo[i] += a.heSo[i];
        for (int i = 0; i <= b.bac; i++) c.heSo[i] += b.heSo[i];
        c.bac = c.degree();
        return c;
    }

    public DaThuc nhan(DaThuc b) {
        DaThuc a = this;
        DaThuc c = new DaThuc(0, a.bac + b.bac);
        for (int i = 0; i <= a.bac; i++)
            for (int j = 0; j <= b.bac; j++)
                c.heSo[i + j] += (a.heSo[i] * b.heSo[j]);
        c.bac = c.degree();
        return c;
    }

    public int coeff() {
        return coeff(degree());
    }


    // get the coefficient for degree d
    public int coeff(int degree) {
        if (degree > this.degree()) throw new RuntimeException("bad degree");
        return heSo[degree];
    }

    public String toString() {
        if (bac == 0) return "" + heSo[0];
        if (bac == 1) return heSo[1] + "x + " + heSo[0];
        String s = heSo[bac] + "x^" + bac;
        for (int i = bac - 1; i >= 0; i--) {
            if (heSo[i] == 0) {
                continue;
            } else if (heSo[i] > 0) {
                s = s + " + " + (heSo[i]);
            } else if (heSo[i] < 0) s = s + " - " + (-heSo[i]);
            if (i == 1) {
                s = s + "x";
            } else if (i > 1) s = s + "x^" + i;
        }
        return s;
    }

    public static void main(String[] args) {
        DaThuc zero = new DaThuc(0, 0);

        DaThuc p1 = new DaThuc(1, 3);
        DaThuc p2 = new DaThuc(2, 2);
        DaThuc p3 = new DaThuc(4, 0);
        DaThuc p4 = new DaThuc(0, 1);
        DaThuc p = p1.cong(p2).cong(p3).cong(p4);   // 4x^3 + 3x^2 + 1

        DaThuc q1 = new DaThuc(1, 1);
        DaThuc q2 = new DaThuc(3, 0);
        DaThuc q = q1.cong(q2);                     // 3x^2 + 5


        DaThuc r = p.cong(q);
        DaThuc s = p.nhan(q);

        System.out.println("zero(x) =     " + zero);
        System.out.println("p(x) =        " + p);
        System.out.println("q(x) =        " + q);
        System.out.println("p(x) + q(x) = " + r);
        System.out.println("p(x) * q(x) = " + s);


    }
}
