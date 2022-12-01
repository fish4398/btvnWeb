package QLTuyenSinh;

import java.util.List;

public class ListStudent {
    private List<Student> studentList;

    public ListStudent(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "ListStudent{" +
                "studentList=" + studentList +
                '}';
    }
}
