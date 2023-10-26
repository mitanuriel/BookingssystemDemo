package bookingsystem;
import java.time.LocalTime;
import java.util.Scanner;
public class Menu {


    public void printMenu(){
        System.out.println("Select:" +
                "1. Add new time " +
                "2. Change time " +
                "3. Remove time ");
    }

    public int nextChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validchoice = true;
        while (validchoice) {
            if (choice == 0) {
                choice = scanner.nextInt();
                validchoice = false;
            } else {
                scanner.nextInt();
            }
        }
        return choice;

    }
}
