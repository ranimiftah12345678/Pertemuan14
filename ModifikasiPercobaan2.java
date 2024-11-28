import java.util.Scanner;
 
public class ModifikasiPercobaan2 {
    static int hitungPangkat(int x, int y, String deret) {
        if (y== 0) {
            System.out.println(deret + "1 = " + 1);
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1, deret + x + "x"));
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int bilangan, pangkat;

    System.out.print("Bilangan yang dihitung: " );
    bilangan =sc.nextInt();

    System.out.print("Pangkat: ");
    pangkat = sc.nextInt();

    System.out.println(hitungPangkat(bilangan, pangkat, ""));
}
}
