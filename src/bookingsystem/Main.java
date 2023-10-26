package bookingsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;



public class Main {

    public static void main(String[] args) {

        new Main().run();
    }
    public void run() {
        Menu menu = new Menu();
        menu.toMakeButtons();

        Hairdresser Harry = new Hairdresser("123", "123");
        Hairdresser check = new Hairdresser("223", "123");
        System.out.println(Harry.Validate(check));

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

