package QLThuVien;

public class TaiLieu {
    private String tenNXB;
    private String soPhatHanh;
    private String maTL;

    public TaiLieu(String tenNXB, String soPhatHanh, String maTL) {
        this.tenNXB = tenNXB;
        this.soPhatHanh = soPhatHanh;
        this.maTL = maTL;
    }

    public TaiLieu(){}

    public String getTenNXB() {
        return this.tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public String getSoPhatHanh() {
        return this.soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getMaTL() {
        return this.maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }
}
