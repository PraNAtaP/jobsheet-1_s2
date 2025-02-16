import java.util.Scanner;

public class TugasNo2_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== KALKULATOR KUBUS =====");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4) : ");
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisinya : ");
                double sisi = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.printf("Volume Kubus : %.2f\n", menghitungVol(sisi));
                        break;
                    case 2:
                        System.out.printf("Luas Permukaan Kubus : %.2f\n", menghitungLuas(sisi));
                        break;
                    case 3:
                        System.out.printf("Keliling Kubus : %.2f\n", menghitungkeliling(sisi));
                        break;
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak ada! silahkan masukkan lagi");
            }

        } while (pilihan != 4);

        scanner.close();
    }

    public static double menghitungVol(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double menghitungLuas(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double menghitungkeliling(double sisi) {
        return 12 * sisi;
    }
}