package btvn04.QLHoGiaDinh;

public class Person {
    private String fullName;
    private int age;
    private long identity;
    private String jobTitle;

    public Person(String fullName, int age, String jobTitle, long identity) {
        this.fullName = fullName;
        this.age = age;
        this.identity = identity;
        this.jobTitle = jobTitle;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdentity() {
        return identity;
    }

    public void setIdentity(long identity) {
        this.identity = identity;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
