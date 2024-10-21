package exception;

// Mendefinisikan CustomException sebagai user-defined exception
class CustomException extends Exception {
    // Constructor default
    public CustomException() {
        super("Pembagian tidak valid!");  // Pesan default
    }
    
    // Constructor dengan pesan khusus
    public CustomException(String message) {
        super(message);
    }
}

public class Main {
    // Method yang akan melempar CustomException jika penyebut bernilai 0
    public static double divide(int numerator, int denominator) throws CustomException {
        if (denominator == 0) {
            throw new CustomException("Penyebut tidak boleh nol!");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            int pembilang = 10;
            int penyebut = 0;  // Ubah nilai ini untuk mencoba berbagai kasus
            
            double hasil = divide(pembilang, penyebut);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (CustomException e) {
            // Menangkap dan menampilkan pesan exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
