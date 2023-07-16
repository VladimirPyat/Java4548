package oop_HW5.services;

import oop_HW5.models.Student;
import oop_HW5.models.Teacher;
import oop_HW5.repositories.AllUserRepository;

import java.util.List;

public class TeacherService implements UserService<Teacher> {
    
    private final AllUserRepository<Teacher> teacherRepository;
    private SortExecutor sortExecutor;


    public TeacherService(AllUserRepository<Teacher> teacherRepository) {
        this.teacherRepository = teacherRepository;
        sortExecutor = new SortExecutor();
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {

        teacherRepository.create(new Teacher(fullName, age, phoneNumber, groupTitle));
    }

    @Override
    public List<Teacher> getAll() {
        return sortExecutor.sort(teacherRepository.getAll());
    }

    @Override
    public List<Teacher> getAllSortByFullName() {
        return sortExecutor.sortByFullName(teacherRepository.getAll());
    }

    @Override
    public List<Teacher> getAllSortById() {
        return sortExecutor.sortById(teacherRepository.getAll());
    }


    @Override
    public int remove(String fullName) {
        return teacherRepository.remove(fullName);
    }

    @Override
    public List<Teacher> getAllByTitile(String groupTitle) {
        return teacherRepository.getAllByGroupTitle(groupTitle);
    }
    
    
}
