import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return isPrimeRecursive(number, 2);
    }

    static boolean isPrimeRecursive(int number, int divisor) {
        if (divisor == number) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(number, divisor + 1);
    }
}
