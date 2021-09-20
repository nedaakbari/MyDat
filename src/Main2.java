import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a date\nEnter day :");
            int day = scanner.nextInt();
            System.out.println("Enter month:");
            int month = scanner.nextInt();
            System.out.println("Enter year:");
            int year = scanner.nextInt();
            MyDat myDat = new MyDat(day, month, year);
            if (myDat.isValidDate(day, month, year)) {
                System.out.println("your date is valid");
                System.out.println(myDat.toString());
            } else
                System.out.println("your date is not valid");
            myDat.getMonthLastDay(month);

        }
    }
}

