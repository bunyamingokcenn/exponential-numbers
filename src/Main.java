import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int base, up, total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Üslü sayı hesaplayan programa hoş geldiniz");

        System.out.print("Lütfen taban sayısını giriniz: ");
        base = input.nextInt();

        System.out.print("Lütfen kuvvet sayısını giriniz: ");
        up = input.nextInt();

        for (int i=1; i <= up; i++){
            total *= base;
        }

        System.out.println("Sonuç: " + total);

    }
}