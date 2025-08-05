import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj dlzku strany A: ");
        Double A = scanner.nextDouble();

        System.out.println("Zadaj dlzku strany B: ");
        Double B = scanner.nextDouble();

        Double obvod = 2 * (A + B);
        System.out.println("Obvod obdlznika je: " + obvod);
    }
}