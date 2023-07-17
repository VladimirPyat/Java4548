package oop_HW5;

import oop_HW5.controllers.GroupController;
import oop_HW5.controllers.StudentController;
import oop_HW5.controllers.TeacherController;
import oop_HW5.models.Student;
import oop_HW5.models.Teacher;
import oop_HW5.repositories.AllUserRepository;

import oop_HW5.services.GroupService;
import oop_HW5.services.StudentService;
import oop_HW5.services.TeacherService;
import oop_HW5.view.AllUsersView;
import oop_HW5.view.GroupView;
import oop_HW5.view.SortType;

import static oop_HW5.UniversityApp.*;


public class Main {



    public static void main(String[] args) {

        UniversityApp app = new UniversityApp();
        app.run();

    }


}
