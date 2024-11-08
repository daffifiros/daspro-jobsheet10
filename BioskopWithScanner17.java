import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = scanner.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = scanner.nextInt();
            scanner.nextLine(); 
            penonton[baris - 1][kolom - 1] = nama;
            System.out.print("Input penonton lainnya? (y/n): ");
            String lanjut = scanner.nextLine();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}