package QLTuyenSinh;

public class Student {
    private String fullName;
    private String doB;
    private String sex;
    private int phoneNumber;
    private String universityName;
    private String gradeLevel;
    private GoodStudent goodStudent;
    private NormalStudent normalStudent;

    public Student(String fullName, String doB, String sex, int phoneNumber, String universityName, String gradeLevel, GoodStudent goodStudent) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
        this.goodStudent = goodStudent;
    }

    public Student(String fullName, String doB, String sex, int phoneNumber, String universityName, String gradeLevel, NormalStudent normalStudent) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
        this.normalStudent = normalStudent;
    }

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

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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

    public GoodStudent getGoodStudent() {
        return this.goodStudent;
    }

    public void setGoodStudent(GoodStudent goodStudent) {
        this.goodStudent = goodStudent;
    }

    public NormalStudent getNormalStudent() {
        return this.normalStudent;
    }

    public void setNormalStudent(NormalStudent normalStudent) {
        this.normalStudent = normalStudent;
    }


}
