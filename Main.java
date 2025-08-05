import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj dlzku strany trojuholnika A: ");
        Double A = scanner.nextDouble();

        System.out.println("Zadaj dlzku strany trojuholnika B: ");
        Double B = scanner.nextDouble();

        System.out.println("Zadaj dlzku strany trojuholnika C: ");
        Double C = scanner.nextDouble();

        Double obvod = A + B +C;
        System.out.println("Obvod trojuholnika je: " + obvod);
    }
}