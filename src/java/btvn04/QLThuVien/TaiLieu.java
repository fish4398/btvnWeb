package QLThuVien;

public class TaiLieu {
    private Sach sach;
    private Bao bao;
    private TapChi tapChi;

    private String maTaiLieu;
    private String tenNhaXuatBan;
    private String soPhatHanh;

    public TaiLieu(Sach sach, String maTaiLieu, String tenNhaXuatBan, String soPhatHanh) {
        this.sach = sach;
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public TaiLieu(Bao bao, String maTaiLieu, String tenNhaXuatBan, String soPhatHanh) {
        this.bao = bao;
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public TaiLieu(TapChi tapChi, String maTaiLieu, String tenNhaXuatBan, String soPhatHanh) {
        this.tapChi = tapChi;
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public TaiLieu(){}

    public Sach getSach() {
        return this.sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public Bao getBao() {
        return this.bao;
    }

    public void setBao(Bao bao) {
        this.bao = bao;
    }

    public TapChi getTapChi() {
        return this.tapChi;
    }

    public void setTapChi(TapChi tapChi) {
        this.tapChi = tapChi;
    }

    public String getMaTaiLieu() {
        return this.maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return this.tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getSoPhatHanh() {
        return this.soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "sach=" + sach +
                ", bao=" + bao +
                ", tapChi=" + tapChi +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soPhatHanh='" + soPhatHanh + '\'' +
                '}';
    }
}
