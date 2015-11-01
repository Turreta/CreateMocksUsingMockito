package com.turreta.mockito.mockobject;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao;

    /**
     * @return the dao
     */
    public StudentDao getDao() {
        return dao;
    }

    /**
     * @param dao
     *            the dao to set
     */
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<String> findStudents(String studentId) {
        return dao.findStudents(studentId);
    }

}
