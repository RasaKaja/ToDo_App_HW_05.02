package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    ArrayList<ToDo> toDos = new ArrayList<ToDo>();
    Scanner strScanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    int index;

    public void addToDo(){
        ToDo toDo = new ToDo();

        System.out.println("Please add a new ToDo description: ");
        toDo.description = strScanner.nextLine();

        System.out.println("Please input ToDo Id: ");
//        index = intScanner.nextInt();
//        ToDo toDo = this.toDos.get(index);
        toDo.setId(intScanner.nextInt());

        this.toDos.add(toDo);
        System.out.println("New ToDo added successfully.");

    }

    void viewAllToDo(){
        System.out.println("All Your ToDo List: \n");
        for (ToDo toDo : toDos) {
            System.out.println(toDo.description);
        }
    }

    void viewSingleToDo(){
        try {
            System.out.println("Please input the index of ToDo you want to see:");
            int index = intScanner.nextInt();

            ToDo toDo = this.toDos.get(index);
            System.out.println("ToDo is: " + toDo.description);
        } catch (Exception ex) {
            System.out.println("Unable to find this ToDo.");
        }
    }

    void markToDOAsDone (){
        ToDo toDo = new ToDo();
        try {
            System.out.println("Please input index of ToDo you want to mark as DONE");
            int index = intScanner.nextInt();
            toDo.done = true;
        } catch (Exception ex) {
            System.out.println("Unable to find this ToDo.");
        }
        System.out.println("Your task status 'done' is " + toDo.done);
    }

    void deleteToDo() {
        try {
            System.out.println("Please input index of ToDo you want to remove");
            int index = intScanner.nextInt();
            toDos.remove(index);
        } catch (Exception ex) {
            System.out.println("Unable to remove specified ToDo");
        }
    }

}
