package btvn04.QLTuyenSinh;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
   List<Student> studentList;

    public ListStudent() {
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

}
