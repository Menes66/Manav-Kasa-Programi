import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double el, ar, dom, muz, pat;
        double tutar, e = 3.67, a =2.14, d = 1.11, m= 0.95, p = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo     : ");
        e = input.nextDouble();

        System.out.print("Armut Kaç Kilo    : ");
        a = input.nextDouble();

        System.out.print("Domates Kaç Kilo  : ");
        d = input.nextDouble();

        System.out.print("Muz Kaç Kilo      : ");
        m = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo :");
        p = input.nextDouble();

        tutar =(el * e) + (ar * a) + (dom * d) + (muz * m) + (pat * p);

        System.out.print("Toplam Tutar : " + tutar);


    }
}