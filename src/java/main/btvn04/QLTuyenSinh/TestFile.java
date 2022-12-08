package btvn04.QLTuyenSinh;


import java.io.File;

public class TestFile {
    ListStudent listStudent;
    public static void main(String[] args) {
        ListStudent listStudent1 = new ListStudent();
        File file = new File("src/java/main/btvn04/QLTuyenSinh/Data.txt");
        Student student = new GoodStudent("Nguyen thi Hoai", "04/03/1998", "Female", "0389600121", "DH Mo HN", "Kha", 8.6f, "Nothing");
        Student student1 = new Student("Nguyen thi Hoai", "04/03/1998", "Female", "0389600121", "DH Mo HN", "Kha");
        listStudent1.addStudent(student);
        listStudent1.addStudent(student1);
        listStudent1.writeDataInFile(file);
        // check write file return "GoodStudent[fullName= " + getFullName() + ", doB=" + getDoB() + ", sex=" + getSex() + ", phoneNumber=" + getPhoneNumber() + ", universityName=" + getUniversityName() + ", gradeLevel=" + getGradeLevel() + "gpa=" + gpa + ", bestRewardName=" + bestRewardName + ']';
        listStudent1.readDataFromFile(file);

    }


}
