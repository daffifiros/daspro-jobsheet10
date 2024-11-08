import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];

//         while (true) {
//             System.out.print("Masukkan nama: ");
//             String nama = scanner.nextLine();
//             System.out.print("Masukkan baris: ");
//             int baris = scanner.nextInt();
//             System.out.print("Masukkan kolom: ");
//             int kolom = scanner.nextInt();
//             scanner.nextLine(); 
//             penonton[baris - 1][kolom - 1] = nama;
//             System.out.print("Input penonton lainnya? (y/n): ");
//             String lanjut = scanner.nextLine();
//             if (lanjut.equalsIgnoreCase("n")) {
//                 break;
//             }
//         }
//     }
// }
        // Modifikasi memberikan opsi menu
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
        
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
                    break;
                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }
}