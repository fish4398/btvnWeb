package QLTuyenSinh;

import java.util.List;

public class ListStudent {
    private List<GoodStudent> goodStudentList;
    private List<NormalStudent> normalStudentList;

    public ListStudent(List<GoodStudent> goodStudentList, List<NormalStudent> normalStudentList) {
        this.goodStudentList = goodStudentList;
        this.normalStudentList = normalStudentList;
    }

    public List<GoodStudent> getGoodStudentList() {
        return goodStudentList;
    }

    public void setGoodStudentList(List<GoodStudent> goodStudentList) {
        this.goodStudentList = goodStudentList;
    }

    public List<NormalStudent> getNormalStudentList() {
        return normalStudentList;
    }

    public void setNormalStudentList(List<NormalStudent> normalStudentList) {
        this.normalStudentList = normalStudentList;
    }

    @Override
    public String toString() {
        return "ListStudent{" +
                "goodStudentList=" + goodStudentList +
                ", normalStudentList=" + normalStudentList +
                '}';
    }
}
