package KiemTraJava.Bai03;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /*
    Xây dựng lớp Student với 03 thuộc tính "FirstName", "LastName", "EmailAddress", "GPA".
    Tạo 03 đối tượng và in ra thông tin
của đối tượng đó theo quy tắc sau "First: [Value] - Last: [Value] - Email: [Value]";
Tính toán GPA và đưa ra thang điểm xếp loại.
< 5: Trung Bình; <8 Khá; <10: Giỏi; 10 Xuất sắc;
     */
    public static void main(String[] args) {
        Student student1 = new Student("Hoai", "Nguyen", 8.2f);
        Student student2 = new Student("Fish", "Nguyen", 4.2f);
        Student student3 = new Student("Ca", "Nguyen", 9.2f);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("List danh sach hoc sinh la" + studentList);
        System.out.println("Xep loai sinh vien la");
        for (Student st:studentList) {
            System.out.printf("\n%s xep loai %s", st.toString(), st.xepLoai(st.getGpa()));
        }
    }
}
