package btvn04.QLTuyenSinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String fullName;
    private String doB;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;
    private static final Scanner sc = new Scanner(System.in);
    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public Student(){}

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return this.doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return this.universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return this.gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Student{fullName= " + fullName + ", doB='" + doB + ", sex='" + sex + ", phoneNumber=" + phoneNumber + ", universityName='" + universityName + ", gradeLevel='" + gradeLevel +'}';
    }

    public boolean checkInputName(){
        String fullName = "";
        boolean check = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap ten hoc sinh (dieu kien co chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự. Nếu sai cho phép nhập tổng 3 lần): ");
            fullName = sc.nextLine().trim();
            if(fullName.length() >= 10 && fullName.length() <= 50) {
                this.setFullName(fullName);
                check = true;
                break;
            }
            if(i == 2) {
                System.out.printf("Ban da nhap sai %s lan. ban da mat 1 lan nhap hoc sinh vao list hoc sinh.", i + 1);
                break;
            }
            System.out.printf("\nBan da nhap sai %s lan. Xin moi ban nhap lai ho va ten sinh vien.", i + 1);
        }
        return check;
    }

    public boolean checkPhoneNumber(){
        System.out.println("SDT gom 10 so va bat dau bang 1 trong cac so o list {\"090\", \"098\", \"091\", \"031\", \"035\", \"038\"}. Nhap so DT: ");
        String number = sc.nextLine().trim();
        String[] startNumber = {"090", "098", "091", "031", "035", "038"};
        try {
            Integer.parseInt(number);
            if((number.length() == 10) && Arrays.stream(startNumber).anyMatch(n -> number.startsWith(n))) {
                this.setPhoneNumber(number);
                return true;
            }else {
                System.out.println("Ban nhap sai dinh dang SDT");
                return false;
            }
        }catch (NumberFormatException e){
            System.out.println("Throw InvalidPhoneNumberException");
            return false;
        }
    }

    public boolean checkBirth(){
        System.out.println("Ngay sinh nhap theo dinh dang dd/MM/yyyy.");
        System.out.println("Nhap ngay sinh: ");
        String birth = sc.nextLine().trim();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        try {
            Date dateBirth = simpleDateFormat.parse(birth);
            this.setDoB(birth);
        }catch (ParseException e){
            System.out.println("Throw InvalidDOBException");
            return false;
        }
        return true;
    }

    public void inputSex(){
        System.out.println("Gioi tinh gom: M (male), F (female), O (other). Neu ban nhap ky tu khac M hoac F he thong se tu dong hieu gioi tinh cua ban la O (other). Please chu y!");
        System.out.println("Nhap gioi tinh: ");
        String sex = sc.nextLine().trim().toUpperCase();
        if(sex.equals("M")) this.setSex("Male");
        else if(sex.equals("F")) this.setSex("Female");
        else this.setSex("Other");
    }

    public void inputUniversity(){
        System.out.println("Nhap ten truong dai hoc cua ban: ");
        String name = sc.nextLine().trim();
        this.setUniversityName(name);
    }

    public void inputGradeLevel(){
        String[] list = {"Yeu", "Trung Binh", "Kha", "Gioi", "Xuat Sac"};
        System.out.println("Xep loai tot nghiep: Yeu, Trung Binh, Kha, Gioi, Xuat Sac. Please chu y nhap sai se tu dong xep ban thanh loai yeu.");
        System.out.println("Nhap xep loai: ");
        String level = sc.nextLine().trim().toUpperCase();
        Arrays.stream(list).forEach(v->{
            if(v.toUpperCase().equals(level)) this.setGradeLevel(v);
            else this.setGradeLevel(list[0]);
        });
    }

}
