package QLHoDanCu;

import QLHoDanCu.HoGiaDinh;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    private List<HoGiaDinh> danhSachHoGiaDinh;

    public KhuPho(List<HoGiaDinh> danhSachHoGiaDinh) {
        this.danhSachHoGiaDinh = danhSachHoGiaDinh;
    }

    public KhuPho() {
        this.danhSachHoGiaDinh = new ArrayList<>();
    }

    public List<HoGiaDinh> getDanhSachHoGiaDinh() {
        return danhSachHoGiaDinh;
    }

    public void setDanhSachHoGiaDinh(List<HoGiaDinh> danhSachHoGiaDinh) {
        this.danhSachHoGiaDinh = danhSachHoGiaDinh;
    }

    public void themHoGD(HoGiaDinh hoGiaDinh){
        this.danhSachHoGiaDinh.add(hoGiaDinh);
    }

    public void inThongTinHGD(int n){
        if(n > danhSachHoGiaDinh.size()) return;
        for (int i = 0; i < n; i++) {
            System.out.println(danhSachHoGiaDinh.get(i));
        }
    }
}
