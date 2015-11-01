package com.turreta.mockito.mockobject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class StudentServiceTest_MockObjectWay1 {

    private StudentService service;
    private StudentDao dao;

    @Before
    public void setUp() throws Exception {
        // Creating a mock of dao
        dao = Mockito.mock(StudentDao.class);
        service = new StudentServiceImpl();
        ((StudentServiceImpl) (service)).setDao(dao);
    }

    @Test
    public void testFindStudents() {
        // Stub findStudents method
        Mockito.when(dao.findStudents(Matchers.anyString())).thenReturn(new ArrayList<String>());
        List<String> list = service.findStudents("1");
        Assert.assertTrue(list.isEmpty());
    }
}
