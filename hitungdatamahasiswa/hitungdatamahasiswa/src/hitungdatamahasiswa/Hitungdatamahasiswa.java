/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungdatamahasiswa;

/**
 *
 * @author          Maria Indra Fani(2201010220)
 */
  

    /**
     * @param args the command line arguments
     */
     import java.util.Scanner;

public class HitungDataMahasiswa.java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Deklarasi array untuk menyimpan data mahasiswa
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        int[] umurMahasiswa = new int[jumlahMahasiswa];

        // Memasukkan data mahasiswa ke dalam array
        for (int i = 0; i < jumlahMahasiswa; i++) {
            scanner.nextLine(); // membersihkan newline
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            System.out.print("Masukkan umur mahasiswa ke-" + (i + 1) + ": ");
            umurMahasiswa[i] = scanner.nextInt();
        }

        // Menampilkan data mahasiswa yang telah dimasukkan
        System.out.println("\nData mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ":");
            System.out.println("Nama: " + namaMahasiswa[i]);
            System.out.println("Umur: " + umurMahasiswa[i]);
            System.out.println(); // untuk pemisah antar data mahasiswa
        }

        // Menghitung jumlah data mahasiswa
        System.out.println("Jumlah mahasiswa: " + jumlahMahasiswa);

        // Menghitung rata-rata umur mahasiswa
        int totalUmur = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            totalUmur += umurMahasiswa[i];
        }
        double rataUmur = (double) totalUmur / jumlahMahasiswa;
        System.out.printf("Rata-rata umur mahasiswa: %.2f\n", rataUmur);

        scanner.close();
    }
}
