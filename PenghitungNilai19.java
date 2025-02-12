import java.util.Scanner;

public class PenghitungNilai19 {

    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        
        System.out.println("Program Penghitung Nilai Akhir");
        System.out.println("=================================");
        System.out.print("Masukkan nilai Tugas : ");
        int nilaiTugas = input19.nextInt();
        System.out.print("Masukkan nilai Kuis : ");
        int nilaiKuis = input19.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        int nilaiUTS = input19.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int nilaiUAS = input19.nextInt();

        if (nilaiTugas < 0 || nilaiTugas > 100 || 
            nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || 
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
        String nilaiHuruf;
        String keterangan;

        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 75) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }


        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || 
            nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "SELAMAT ANDA LULUSSS";
        } else {
            keterangan = "MAAF ANDA TIDAK LULUS";
        }

        System.out.println("=================================");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("=================================");
        System.out.println(keterangan);

        input19.close();
    }
}