package com.pluralsight;

import java.util.Scanner;
import java.util.SortedMap;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You will prompt the user to enter the parts of their name. You will then create a new string that holds the user’s full name.
        //The user will always have a first and last name;
        // they may also have a middle name and a suffix (ex. Jr, PhD). If a user does not enter a value for the middle name or suffix, the full name should not include that part of the name.
        // If the user has a suffix in their name, the full name should include a comma before the suffix.

        System.out.print("Please enter your first name: " );
        String userFirstName = scanner.nextLine();

        System.out.print("Please enter your last name: ");
        String userLastName = scanner.nextLine();

        String userFullName = userFirstName;

        System.out.println("Please enter your middle initial: ");
        String userMiddleInitial = scanner.nextLine();
        if (!userMiddleInitial.isEmpty()){
            userFullName = String.format("%s %s.", userFullName, userMiddleInitial);
        }
        userFullName = String.format("%s %s", userFullName, userLastName);

        System.out.println("Please enter suffix: ");
        String userSuffix = scanner.nextLine();
        if (!userSuffix.isEmpty()){
            userFullName = String.format("%s, %s", userFullName, userSuffix);
        }

        System.out.println(userFullName);


    }
}
