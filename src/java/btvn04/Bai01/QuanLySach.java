package Bai01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySach {
    List<TaiLieu> taiLieuList;

    public QuanLySach() {
        this.taiLieuList = new ArrayList<>();
    }

    public void addTaiLieu(TaiLieu taiLieu){
        taiLieuList.add(taiLieu);
    }

    public void xoaTaiLieu(String taiLieuID){
        TaiLieu taiLieu = taiLieuList.stream().filter(v->v.getMaTL().equals(taiLieuID)).findFirst().orElse(null);
        if(taiLieu == null) return;
        taiLieuList.remove(taiLieu);
        System.out.printf("\nXoa tai lieu co ma tai lieu %s thanh cong\n", taiLieu.getMaTL());
    }

    public void hienThiThongTinTaiLieu(TaiLieu taiLieu){
        System.out.println(taiLieu.toString());
    }

    public List<TaiLieu> timKiemSach(){
        List<TaiLieu> result = new ArrayList<>();
        for (TaiLieu taiLieu:taiLieuList) {
            if(taiLieu instanceof Sach) result.add(taiLieu);
        }
        return result;
    }

    public List<TaiLieu> timKiemBao(){
        List<TaiLieu> result = new ArrayList<>();
        result = this.taiLieuList.stream().filter(t -> t instanceof Bao).collect(Collectors.toList());
        System.out.println("Danh sach bao: ");
        result.forEach(t-> System.out.println(t.toString()));
        return result;
    }

    public void timKiemTapChi(){
        List<TaiLieu> result = new ArrayList<>();
        System.out.println("Danh sach tap chi: ");
        this.taiLieuList.stream().filter(t-> t instanceof TapChi).forEach(t-> System.out.println(t.toString()));
    }
}
