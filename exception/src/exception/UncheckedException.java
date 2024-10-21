package exception;

import java.util.InputMismatchException;  // Tambahkan import ini
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Meminta input dari pengguna
            System.out.print("Masukkan pembilang: ");
            int pembilang = input.nextInt();  // Bisa memicu InputMismatchException (Unchecked)
            
            System.out.print("Masukkan penyebut: ");
            int penyebut = input.nextInt();  // Bisa memicu InputMismatchException (Unchecked)
            
            // Melakukan pembagian (Unchecked exception bisa terjadi)
            int hasil = pembilang / penyebut;  // Bisa memicu ArithmeticException (Unchecked)
            System.out.println("Hasil: " + hasil);
            
        } catch (ArithmeticException e) {
            // Menangani pembagian dengan nol
            System.out.println("Kesalahan aritmatika: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Menangani kesalahan input jika input bukan angka
            System.out.println("Input harus berupa angka.");
        } finally {
            System.out.println("Operasi aritmatika selesai.");
            input.close();
        }
    }
}
