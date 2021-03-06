package Lesson11.education.storage;

import Lesson11.education.util.ArrayUtil;
import Lesson11.education.model.Student;

import java.util.Arrays;

public class StudentStorage {


    private Student[] students = new Student[16];
    private int size;


    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }
    private void extend() {
        Student[] tmp = new Student[students.length + 10];

        for (int i = 0; i < students.length; i++) {
            tmp[i] = students[i];
        }
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void deleteStudentByEmail(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                ArrayUtil.deleteByIndex(students, i, size);
                size--;
                break;
            }
        }
    }

    public void printStudentByLesson(String name) {
        for (int i = 0; i < size; i++) {
            if (Arrays.toString(students[i].getLessons()).contains(name)) {
                System.out.println(students[i]);

            }

        }

    }


}



