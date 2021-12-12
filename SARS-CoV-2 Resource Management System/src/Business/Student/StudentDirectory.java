/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Student;

import java.util.ArrayList;

/**
 *
 * @author SHRISHTI
 */
public class StudentDirectory {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getPatients() {
        return students;
    }

    public void setPatients(ArrayList<Student> stuents) {
        this.students = students;
    }
}
