package QLThuVien;

import java.util.List;

public class QuanLySach {
    private List<TaiLieu> taiLieuList;

    public QuanLySach(List<TaiLieu> taiLieuList) {
        this.taiLieuList = taiLieuList;
    }

    public List<TaiLieu> getTaiLieuList() {
        return taiLieuList;
    }

    public void setTaiLieuList(List<TaiLieu> taiLieuList) {
        this.taiLieuList = taiLieuList;
    }

    @Override
    public String toString() {
        return "QuanLySach{" +
                "taiLieuList=" + taiLieuList +
                '}';
    }

    // Xoá tài liệu theo mã tài liệu.
    public boolean deleteTaiLieu(String maTaiLieuXoa){
        return taiLieuList.removeIf(v->v.getMaTaiLieu().equalsIgnoreCase(maTaiLieuXoa));
    }

    public void printTaiLieu(){
        System.out.println(taiLieuList);
    }

    public void searchTaiLieu(Sach sach){
        this.taiLieuList.forEach(v->{
            if(v.getSach() == (sach)) System.out.println(v);
        });
    }

    public void searchTaiLieu(Bao bao){
        this.taiLieuList.forEach(v->{
            if(v.getBao() == (bao)) System.out.println(v);
        });
    }

    public void searchTaiLieu(TapChi tapChi){
        this.taiLieuList.forEach(v->{
            if(v.getTapChi() == (tapChi)) System.out.println(v);
        });
    }
}
