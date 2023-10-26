import java.util.Scanner;
public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlMahasiswa, mhsLulus = 0, mhsTdkLulus = 0;
        double total = 0, totalTdklulus = 0;
        double rata2, rataTdkLulus;

        System.out.println("Masukkan jumlah mahasiswa : ");
        jmlMahasiswa = sc.nextInt();
        int [] nilaiMhs = new int [jmlMahasiswa] ;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                total += nilaiMhs [i];
            } else {
                mhsTdkLulus++;
                totalTdklulus += nilaiMhs[i];
            }
        }
        
        rata2 = total/mhsLulus;
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rata2);
        rataTdkLulus = totalTdklulus/mhsTdkLulus;
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataTdkLulus);
        
        
    }
}
