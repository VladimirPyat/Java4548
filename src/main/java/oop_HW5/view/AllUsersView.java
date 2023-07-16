package oop_HW5.view;

import oop_HW5.controllers.UserController;
import oop_HW5.models.Student;
import oop_HW5.models.User;
import org.w3c.dom.ls.LSOutput;

import java.util.List;


public class AllUsersView  <T extends User> implements UserView {

    private final UserController<T> controller;

    public AllUsersView(UserController<T> controller) {
        this.controller = controller;
    }

    public void sendOnConsole() {
        sendOnConsole(SortType.NONE);
    }

    @Override
    public void sendOnConsole(SortType sortType) {


        List<T> users = switch (sortType) {
            case NONE -> controller.getAll();
            case NAME -> controller.getAllSortByFullName();
            case ID -> controller.getAllSortById();
        };

        if (users == null || users.size() == 0) {
            System.out.println("Отсутствуют персоны для вывода");
            return;
        }

        System.out.println("===================================");
        System.out.println("Для вывода использована " + sortType);
//        for (Student student : students) {
//            System.out.println(student);
//        }
//        students.forEach((student) -> System.out.println(student));
        users.forEach(System.out::println);
        System.out.println("===================================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        controller.create(fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public void removeUser(String fullName) {
        int removeCount = controller.remove(fullName);

        if (removeCount == 0) {
            System.out.println("Удаление не получилось.");
        } else {
            System.out.println("Удалено персон: " + removeCount);
        }

    }
}
