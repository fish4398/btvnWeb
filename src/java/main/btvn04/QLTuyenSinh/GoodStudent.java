package btvn04.QLTuyenSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GoodStudent extends Student{
    private float gpa;
    private String bestRewardName;
    private Student student;

    private static final Scanner sc = new Scanner(System.in);
    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, float gpa, String bestRewardName, Student student) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
        this.student = student;
    }

    public GoodStudent(){super();}

    public float getGpa() {
        return this.gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return this.bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "GoodStudent[fullName= " + getFullName() + ", doB=" + getDoB() + ", sex=" + getSex() + ", phoneNumber=" + getPhoneNumber() + ", universityName=" + getUniversityName() + ", gradeLevel=" + getGradeLevel() + "gpa=" + gpa + ", bestRewardName=" + bestRewardName + ']';
    }

    public boolean checkGPA(){
        boolean check = false;
        System.out.println("Diem tieng anh thuoc dang float va thang diem tu 0 -> 10");
        System.out.println("Moi ban nhap diem GPA: ");
        try {
            float score = sc.nextFloat();
            if(score >= 0 && score <= 10){
                this.setGpa(score);
                return true;
            }else return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }

    public void inputBestReward(){
        System.out.println("Nhap ten Best Reward cua ban: ");
        String name = sc.nextLine().trim();
        System.out.println("Ten bang: " + name);
        this.setBestRewardName(name);
    }

    List<GoodStudent> listStudent = new ArrayList<>();
    public List<GoodStudent> compareGoodStudent(){
        return listStudent.stream().sorted((o1, o2)->{
                if(o1.getGpa() == o2.getGpa())
                    return o1.getFullName().compareTo(o2.getFullName());
                else if(o1.getGpa() > o2.getGpa()) return 1;
                else return -1;
    }).collect(Collectors.toList());
    }

}
