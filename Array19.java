import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        String[] mataKuliah = {
            "Agama",
            "Bahasa Indonesia",
            "Bahasa Inggris Dasar",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Pengantar Akuntansi, Manajemen, dan Bisnis",
            "Matematika Dasar",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
        };

        int[] sks = {2, 2, 2, 2, 2, 2, 2, 2, 3};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("==========================================================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==========================================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input19.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobot / totalSKS;

        System.out.println("==========================================================================");
        System.out.println("Hasil Konversi Nilai dan IP Semester:");
        System.out.println("==========================================================================");
        System.out.printf("%-45s %-5s %-12s %-10s\n", "Mata Kuliah", "SKS", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-45s %-5d %-12s %-10.2f\n", mataKuliah[i], sks[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("==========================================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        input19.close();
    }
}
