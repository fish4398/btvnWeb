package btvn04.QLTuyenSinh;

import java.io.*;
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

    public void writeDataInFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for(Student student : studentList){
                oos.writeObject(student);
            }
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readDataFromFile(File file){
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois =new ObjectInputStream(is);
            Student student = null;
            while(true) {
                Object oj = ois.readObject();
                if(oj==null) {
                    break;
                }
                if(oj!=null) {
                    student = (Student) oj;
                    this.studentList.add(student);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
