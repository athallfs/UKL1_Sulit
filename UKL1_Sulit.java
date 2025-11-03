import java.util.Scanner;

public class UKL1_Sulit  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM REKAP NILAI PRODUKTIF RPL ===");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        // Memasukkan nilai untuk setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // Menghitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n=== HASIL REKAP NILAI ===");
        System.out.println("Jumlah siswa : " + jumlahSiswa);
        System.out.println("Total nilai  : " + totalNilai);
        System.out.println("Rata-rata    : " + rataRata);

        input.close();
    }
}

