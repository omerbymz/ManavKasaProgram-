import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.97;
        double patlican = 5.00;

        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç kilo? :");
        armut = input.nextDouble();

        System.out.print("Elma Kaç kilo? :");
        elma = input.nextDouble();

        System.out.print("Domates Kaç kilo? :");
        domates = input.nextDouble();

        System.out.print("Muz Kaç kilo? :");
        muz = input.nextDouble();

        System.out.print("Patlican Kaç kilo? :");
        patlican = input.nextDouble();

        toplam = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
        System.out.print("Toplam tutar: " + toplam);

    }
}
