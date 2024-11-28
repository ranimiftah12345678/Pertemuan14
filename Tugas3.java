import java.util.Scanner;

public class Tugas3 {
    
    static boolean cekPrimaRekursif(int n, int pembagi) {
        if (pembagi == n) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        }
        return cekPrimaRekursif(n, pembagi + 1);
    }
    static boolean cekPrima(int n) {
        if (n <= 1) {
            return false;
        }
        return cekPrimaRekursif(n, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan yang akan diperiksa: ");
        int n = sc.nextInt();
        
        if (cekPrima(n)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
