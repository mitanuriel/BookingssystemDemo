package bookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;



public class Main {

    public static void main(String[] args) {

        new Main().run();
    }
    public void run() {
        Menu menu = new Menu();


        Scanner scanner = new Scanner(System.in);

        Hairdresser Harry = new Hairdresser("Harry", "123");
        Hairdresser check = new Hairdresser("223", "123");
        List<Hairdresser> hairdressers = new ArrayList<>();
        hairdressers.add(Harry);

        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String getUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String getPassword = scanner.nextLine();
            if ( getUsername.equals(Harry) ) {
                return;

        }

        menu.toMakeButtons();
        menu.printMenu();


        TimeManager timeManager = new TimeManager();
        Customer customer = new Customer(LocalTime.of(12, 30),"A","b",889,0);
        Customer customer2 = new Customer(LocalTime.of(13, 30),"V","C",5757,2);
        timeManager.AddCustomer(customer);
        timeManager.AddCustomer(customer2);
        timeManager.changeTime(customer, LocalTime.of(14, 30));

        ArrayList<Customer> test = timeManager.getTimes();
        for (Customer user : test){
            System.out.println(user);


        }
    }



}
}

