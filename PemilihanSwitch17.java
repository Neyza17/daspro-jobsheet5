import java.util.Scanner;

public class PemilihanSwitch17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();

        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();

        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }
        System.out.println(angka1 + operator + angka2 + " = " + hasil);
    }
}