package com.redolf

import com.redolf.models.Student

static void main(String[] args) {
    println "Hello world!"
    List<Integer> v = new ArrayList<>();
    println 'A'
    Student student = new Student(UUID.randomUUID(),"Redolf");
    println(student.toString())
}