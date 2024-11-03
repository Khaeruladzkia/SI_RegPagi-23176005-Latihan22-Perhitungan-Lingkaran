/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 21 - Perhitungan Lingkaran
 * Deskripsi Program    : Menghitung jari-jari, luas, dan keliling lingkaran berdasarkan 
                          nilai diameter yang dimasukkan oleh pengguna.
 * @author
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        double diameter = 0;

        System.out.println("====== Perhitungan Lingkaran ======");
        while (!validInput) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            if (scanner.hasNextDouble()) {
                diameter = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.next(); // clear invalid input
            }
        }

        double radius = diameter / 2;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", radius);
        System.out.printf("Luas Lingkaran = %.2f cm²%n", area);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", circumference);
    }
}

