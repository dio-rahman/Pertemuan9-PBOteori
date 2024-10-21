package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Meminta input dari pengguna
            System.out.print("Masukkan pembilang: ");
            int pembilang = input.nextInt();  // Bisa menimbulkan InputMismatchException
            
            System.out.print("Masukkan penyebut: ");
            int penyebut = input.nextInt();  // Bisa menimbulkan InputMismatchException
            
            // Memastikan penyebut tidak nol (arithmetic check)
            if (penyebut == 0) {
                throw new ArithmeticException("Penyebut tidak boleh nol.");  // Unchecked Exception
            }
            
            // Melakukan pembagian
            int hasil = pembilang / penyebut;
            System.out.println("Hasil: " + hasil);
            
        } catch (InputMismatchException e) {
            // Menangani kesalahan input jika input bukan angka
            System.out.println("Input harus berupa angka.");
        } catch (ArithmeticException e) {
            // Menangani pembagian dengan nol
            System.out.println("Kesalahan aritmatika: " + e.getMessage());
        } finally {
            System.out.println("Operasi aritmatika selesai.");
            input.close();
        }
    }
}
