package QLThuVien;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao(String tenNXB, String soPhatHanh, String maTL, int ngayPhatHanh) {
        super(tenNXB, soPhatHanh, maTL);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(){super();}

    public int getNgayPhatHanh() {
        return this.ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao : Ma Tai Lieu=" + getMaTL() + "; NXB=" + getTenNXB() + "; So Phat Hanh=" + getSoPhatHanh() + "; Ngay Phat hanh=" + this.ngayPhatHanh;
    }
}
