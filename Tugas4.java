public class Tugas4 {

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        public static void main(String[] args) {
            int bulan = 12;
            System.out.println("Bulan ke-\tTotal Pasangan");
    
            for (int i = 0; i <= bulan; i++) {
                System.out.println(i + "\t\t" + fibonacci(i));
            }
        }
    }