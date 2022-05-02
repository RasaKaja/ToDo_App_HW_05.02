package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to ToDo App.");
        System.out.println("Please choose from the menu your next step:");

        Scanner scanner = new Scanner(System.in);
        ToDoList tdl = new ToDoList();
        int menu;

        do {
            System.out.println("""
                    1. Add new ToDo
                    2. View All ToDO
                    3. View Single ToDo
                    4. Mark Todo as DONE
                    5. Delete ToDo
                    0. Quit
                    """);

            menu = scanner.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Exiting ToDo.");
                    break;
                case 1:
                    tdl.addToDo();
                    break;
                case 2:
                    tdl.viewAllToDo();
                    break;
                case 3:
                    tdl.viewSingleToDo();
                    break;
                case 4:
                    tdl.markToDOAsDone();
                    break;
                case 5:
                    tdl.deleteToDo();
                    break;
            }
        } while (!(menu == 0));
    }
}
