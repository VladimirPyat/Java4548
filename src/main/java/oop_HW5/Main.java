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


public class Main {

    private static AllUserRepository studentRepository;
    private static StudentService studentService;
    private static TeacherService teacherService;


    private static StudentController studentController;
    private static TeacherController teacherController;

    public static void main(String[] args) {
        AllUsersView studentView = getStudentController();
        AllUsersView teacherView = getTeacherController();
        GroupView groupView = getGroupView();

//        -------------------------------------------------------------------------
//      Вводим данные по некоторым студентам и преподавателям

        studentView.create("Ivan Morozov", 18, "02234", "11Б");
        studentView.create("Ivan Morozov", 18, "03452", "11Б");
        studentView.create("Petr Vorobev", 19, "04683", "10А");
        studentView.create("Sidor Sidorov", 20, "11782", "10А");
        studentView.create("Elena Ivanova", 19, "91871", "10А");
        studentView.create("Anna Morozova", 17, "06491", "11А");
        teacherView.create("Piotr Petrovich", 38, "32223", "11Б");
        teacherView.create("Anna Andreevna", 33, "34623", "10А");
//        -------------------------------------------------------------------------

        groupView.printAllFromGroup("11Б");
        groupView.printAllFromGroup("10А");
        teacherView.sendOnConsole();
        teacherView.sendOnConsole(SortType.NAME);
        studentView.sendOnConsole(SortType.ID);

        studentView.removeUser("Ivan Morozov");

        studentView.sendOnConsole();

    }

    private static AllUsersView<Student> getStudentController() {
        AllUserRepository <Student> studentRepository  = new AllUserRepository ();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new AllUsersView(studentController);
    }

    private static AllUsersView<Teacher> getTeacherController() {
        AllUserRepository <Teacher> teacherRepository  = new AllUserRepository ();
        teacherService = new TeacherService(teacherRepository);
        teacherController = new TeacherController(teacherService);
        return new AllUsersView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService,teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }


}
