package com.redolf.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.UUID;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    @BeforeEach
    void setUp() {
        student = new Student(UUID.randomUUID(),"Redolf");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
        UUID id = student.getId();
        assertEquals(id.getClass(),UUID.class);
    }

    @Test
    void setId() {
    }

    @Test
    void getName() {
        String name = student.getName();
        assertEquals(name,"Redolf");
    }

    public static Stream<Arguments> setName() {
        return Stream.of(Arguments.of("Hello","Hello"),
                Arguments.of("Redolf","Redolf"),
                Arguments.of("Asamaning","Asamaning"));
    }

    @MethodSource
    @ParameterizedTest
    void setName(String name1,String name) {
        student.setName(name1);
        assertEquals(student.getName(),name);
    }
}