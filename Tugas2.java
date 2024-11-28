public class Tugas2 {
        public static void main(String[] args) {
            int n = 10;
            int hasil = jumlahRekursif(n);
            System.out.println("Hasil penjumlahan dari 1 sampai " + n + " adalah: " + hasil);
        }
    
        static int jumlahRekursif(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n + jumlahRekursif(n - 1);
            }
        }
    }