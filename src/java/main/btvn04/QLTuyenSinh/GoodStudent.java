package btvn04.QLTuyenSinh;

public class GoodStudent extends Student{
    private float gpa;
    private String bestRewardName;
    private Student student;

    public GoodStudent(String fullName, String doB, String sex, int phoneNumber, String universityName, String gradeLevel, float gpa, String bestRewardName, Student student) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
        this.student = student;
    }

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
        return "GoodStudent[fullName= " + getFullName() + ", doB='" + getDoB() + ", sex='" + getSex() + ", phoneNumber=" + getPhoneNumber() + ", universityName='" + getUniversityName() + ", gradeLevel='" + getGradeLevel() + "gpa=" + gpa + ", bestRewardName='" + bestRewardName + ", student=" + student + ']';
    }
}
