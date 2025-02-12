import java.util.Scanner;

public class DeretanNIM19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = input19.nextLine();
        System.out.println("==================");

        String duaDigitTerakhir = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(duaDigitTerakhir);
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); 
            } else {
                System.out.print("* ");
            }
        }

        input19.close();
    }
}