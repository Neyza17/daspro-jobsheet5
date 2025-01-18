import java.util.Scanner;

public class PemilihanHariDenganIf17 {
    public static void main(String[] args) {
        int dayNumber;
        String dayType;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input day number (1-7): ");
        dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Weekday";
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }
        System.out.println("Day number " + dayNumber + " is a " + dayType);

        sc.close();
    }
}