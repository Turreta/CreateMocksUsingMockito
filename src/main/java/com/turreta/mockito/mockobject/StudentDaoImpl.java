package com.turreta.mockito.mockobject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private List<String> students = new ArrayList<>();

    public StudentDaoImpl() {
        students.add("01");
        students.add("02");
        students.add("03");
        students.add("04");
        students.add("05");
    }

    @Override
    public List<String> findStudents(String studentId) {

        List<String> list = new ArrayList<>();
        if (students.contains(studentId)) {
            list.add(studentId);
        }
        return list;
    }
}
