package com.redolf.models

class Student {
    private UUID id;
    private String name;

    Student(UUID id, String name) {
        this.id = id
        this.name = name
    }



    UUID getId() {
        return id
    }

    void setId(UUID id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
