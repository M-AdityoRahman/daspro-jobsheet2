import java.util.Scanner;
public class PemilihanPercobaan17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner (System.in);
        System.out.println("Masukkan angka: ");
        int angka = input17.nextInt();
        String message=angka%2==0 ? "genap" : "ganjil";
        System.out.println("Angka " +angka+ " bilangan " + message);
    }
}
