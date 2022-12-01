package QLHoDanCu;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    //Số thành viên trong gia đình, Số nhà, thông tin mỗi cá nhân trong gia đình.
    private List<Nguoi> danhsachThanhVien;
    private int soThanhVien;
    private String soNha;

    public HoGiaDinh(List<Nguoi> danhsachThanhVien, int soThanhVien, String soNha) {
        this.danhsachThanhVien = danhsachThanhVien;
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
    }

    public HoGiaDinh(){
        this.danhsachThanhVien = new ArrayList<>();
    }

    public List<Nguoi> getdanhsachThanhVien() {
        return danhsachThanhVien;
    }

    public void setdanhsachThanhVien(List<Nguoi> danhsachThanhVien) {
        this.danhsachThanhVien = danhsachThanhVien;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "QLHoDanCu.HoGiaDinh{" +
                "danhsachThanhVien=" + danhsachThanhVien +
                ", soThanhVien=" + soThanhVien +
                ", soNha='" + soNha + '\'' +
                '}';
    }

    public void themThanhVienVaoHo(Nguoi nguoi){
        this.danhsachThanhVien.add(nguoi);
    }

    public int soThanhVienCuaHo(){
        return this.danhsachThanhVien.size();
    }
}
