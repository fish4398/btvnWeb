package btvn04.QLTuyenSinh;

import java.security.spec.ECField;
import java.util.Scanner;

public class NormalStudent extends Student{
    private float englishScore;
    private float entryTestScore;

    private static final Scanner sc = new Scanner(System.in);
    private Student student;

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, float englishScore, float entryTestScore, Student student) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
        this.student = student;
    }

    public NormalStudent(){super();}

    public float getEnglishScore() {
        return this.englishScore;
    }

    public void setEnglishScore(float englishScore) {
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return this.entryTestScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "NormalStudent[fullName= " + getFullName() + ", doB=" + getDoB() + ", sex=" + getSex() + ", phoneNumber=" + getPhoneNumber() + ", universityName=" + getUniversityName() + ", gradeLevel='" + getGradeLevel() + "englishScore=" + englishScore + ", entryTestScore=" + entryTestScore +']';
    }

    public boolean checkEnglishScore(){
        boolean check = false;
        System.out.println("Diem tieng anh thuoc dang float va thang diem tu 0 -> 10");
        System.out.println("Moi ban nhap diem tieng anh: ");
        try {
            float score = sc.nextFloat();
            if(score >= 0 && score <= 10){
                this.setEnglishScore(score);
                return true;
            }else return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }

    public boolean checkEntryTestScore(){
        boolean check = false;
        System.out.println("Diem thi dau vao thuoc dang float va thang diem tu 0 -> 10");
        System.out.println("Moi ban nhap diem dau vao: ");
        try {
            float score = sc.nextFloat();
            if(score >= 0 && score <= 10){
                this.setEntryTestScore(score);
                return true;
            }else return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
}
