/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Perhitungan Lingkaran
 */ 

package Pertemuan6; 
import java.util.Scanner; 

public class Latihan22 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double diameter = 0;
        boolean inputValid = false; //Penjelasan (1)

        System.out.println("=============Perhitungan Lingkaran============");
        while (!inputValid) { //Penjelasan (2)
            System.out.print("Masukkan nilai diameter lingkaran: ");
            if (scanner.hasNextDouble()) { //Penjelasan (3)
                diameter = scanner.nextDouble();

                if (diameter > 0) { //Penjelasan (4)
                    inputValid = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai. Masukkan angka lebih besar dari 0\n");
                } 
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai.\n"); 
                scanner.next(); //Penjelasan (5)
            }
        }

        //Penjelasan (6)
        double jariJari = diameter / 2;
        double luas = Math.PI* jariJari * jariJari; //Penjelasan (7)
        double keliling = Math.PI* diameter;

        System.out.println("\n==========Hasil Perhitungan Lingkaran=========");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm^2 %n", luas);  
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);  
    }}

/*PENJELASAN 
  (1) Variabel inputValid diisi nilai false sebagai penanda apakah input yang telah
      dimasukkan user sudah valid atau belum.  
  (2) Kondisi (!inputValid) berarti inputValid harus bernilai true untuk menghentikan looping,
      jika nilainya masih false maka program akan terus menerus looping dan meminta user
      memasukkan diameter lingkaran yang benar atau valid. 
  (3) Syarat input diameter dikatakan valid itu ada dua, yang pertama input harus bernilai angka, lebih tepatnya
      input yang dimasukkan harus bertipe data double (nantinya dicek dalam method .hasNextDouble()
  (4) Syarat input valid yang ke-2 adalah angka yang dimasukkan user harus lebih besar daripada 0
      karena diameter lingkaran tidak boleh bernilai 0 atau negatif (dicek dalam if (diameter > 0)). 
  (5) scanner.next()akan membersihkan input yang tidak valid sehingga perulangan berikutnya dapat
      menerima input baru tanpa terganggu oleh nilai sebelumnya.
  (6) Jika nilai inputValid ssudah bernilai true maka looping yang meminta user memasukkan diameter akan terhenti
      lalu program akan otomatis membaca baris kode selanjutnya yang berisi perhitungan jari-jari, luas, dsb.
  (6) Math.PI digunakan untuk mendapatkan nilai konstanta phi yang lebih akurat 
*/


