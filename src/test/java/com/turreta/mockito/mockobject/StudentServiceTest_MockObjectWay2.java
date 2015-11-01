package com.turreta.mockito.mockobject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class StudentServiceTest_MockObjectWay2 {

    private StudentService service;

    // Create a mock of dao
    @Mock
    private StudentDao dao;

    @Before
    public void setUp() throws Exception {

        // This has to be the first line
        MockitoAnnotations.initMocks(this);
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
