/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasejpa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author siriya_s
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert student
        Student stud1 = new Student(1, "Droid", BigDecimal.valueOf(3.76));
        Student stud2 = new Student(2, "Alien", BigDecimal.valueOf(3.56));
        Student stud3 = new Student(3, "Stormtrooper", BigDecimal.valueOf(3.86));
        
        StudentTable.insertStudent(stud1);
        StudentTable.insertStudent(stud2);
        StudentTable.insertStudent(stud3);

        // update student
        // StudentTable.updateStudentName(6, "Captain");
        // StudentTable.updateStudentGPA(7, BigDecimal.valueOf(3.89));

        // remove student
        // StudentTable.removeStudent(4);
        // StudentTable.removeStudent(5);

        // find all student
        List<Student> studList = StudentTable.findAllStudent();
        printAllStudent(studList);
    }
    
    public static void printAllStudent(List<Student> studentList) {
        for(Student stud : studentList) {
            System.out.print(stud.getID() + " ");
            System.out.print(stud.getName() + " ");
            System.out.println(stud.getGPA() + " ");
        }
    }
}
