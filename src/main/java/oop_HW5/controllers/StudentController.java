package oop_HW5.controllers;

import oop_HW5.models.Student;
import oop_HW5.services.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    private final UserService<Student> userService;

    public StudentController(UserService<Student> userService) {
        this.userService = userService;
    }

    //@PostMethod("/students")
    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        userService.create(fullName, age, phoneNumber, groupTitle);
    }

    //@GetMethod("/students")
    @Override
    public List<Student> getAll() {
        return userService.getAll();
    }

    //@DeleteMethod("/students")
    @Override
    public int remove(String fullName) {
        return userService.remove(fullName);
    }

    @Override
    public List<Student> getAllSortByFullName() {
        return userService.getAllSortByFullName();
    }

    @Override
    public List<Student> getAllSortById() {
        return userService.getAllSortById();

    }
}
