package com.turreta.mockito.mockobject;

import java.util.List;

public interface StudentDao {
    List<String> findStudents(String studentId);
}
