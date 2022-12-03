package Bai02;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private int personTotal;
    private String address;
    private int homeNumber;
    private List<Person> personList;

    /**
     * khoi tao doi tuong
     * @param address
     * @param people
     */

    // khong cho nguoi dung nhap so luong thanh vien trong gia dinh
    public Family(String address, int homeNumber, List<Person> people) {
        this.personList = new ArrayList<>();
        this.personList.addAll(people);

        this.personTotal = this.personList.size();
        this.address = address;
        this.homeNumber = homeNumber;
    }

    // khởi tạo đối tượng không có param
    public Family(){
        this.personList = new ArrayList<>();
        this.personTotal = 0;
    }

    // get tong so luong nguoi trong nha
    // khong co nguoi dung set so luong thanh vien trong gia dinh => sẽ lam loi logic
    public int getPersonTotal() {
        return personTotal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    // tuong tu khong co nguoi dung set PersionList
    public List<Person> getPersonList() {
        return personList;
    }

    public List<Person> getPersionByName(String name){
        List<Person> result = new ArrayList<>();
        for (Person person:this.getPersonList()) {
            if(person.getFullName().equals(name)) result.add(person);
        }
        return result;
    }

}
