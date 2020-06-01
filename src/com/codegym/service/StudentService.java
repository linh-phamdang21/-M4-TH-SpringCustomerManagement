package com.codegym.service;

import com.codegym.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements IStudentService {

    private static Map<Integer, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "Binh", " Binh Dinh"));
        studentMap.put(2, new Student(2, "Huynh", "Hai Duong"));
        studentMap.put(3, new Student(3, "Linh", "Ha Noi"));
        studentMap.put(4, new Student(4, "Dat", "Hung Yen"));
        studentMap.put(5, new Student(5, "Thinh", "Hai Phong"));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public void update(int id, Student student) {
        studentMap.put(id, student);
    }

    @Override
    public void remove(int id) {
        studentMap.remove(id);
    }
}
