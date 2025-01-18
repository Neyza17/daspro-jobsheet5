import java.util.Scanner;

public class PemilihanOperator17 {
    public static void main(String[] args) {
        double angka1, angka2, hasil = 0;
        char operator;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();

        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();

        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                return; 
            }
        } else {
            System.out.println("Operator tidak valid!");
            return; 
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}