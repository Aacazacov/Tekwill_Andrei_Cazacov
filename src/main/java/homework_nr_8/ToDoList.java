package homework_nr_8;

import java.util.*;
public class ToDoList {
    public static void main(String[] args) {

        List<String> ToDoList = new ArrayList<>();
        ToDoList.add("Coffee Break with colleagues");
        ToDoList.add("Call to the client 1");
        ToDoList.add("Meeting with client 2");
        ToDoList.add("Coffee Break with colleagues");
        ToDoList.add("Meeting with client 3");
        ToDoList.add("Call to the client 4");
        ToDoList.add("Coffee Break with colleagues");

        System.out.println("List of tasks for day: ");
        for (String taskForDay : ToDoList) {
            System.out.println(taskForDay);
        }
        System.out.println("--------------------");

        Set<String> UniqueToDoList = getUniquelist(ToDoList);
        System.out.println("List of unique tasks for day: ");
        for (String UniqueTaskForDay : UniqueToDoList) {
            System.out.println(UniqueTaskForDay);
        }
    }
    public static Set<String> getUniquelist(List<String> ToDoList) {
        Set<String> UniqueList = new HashSet<>(ToDoList);
        return UniqueList;
    }

}

