package btvn04.QLThuVien;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String tenNXB, String soPhatHanh, String maTL, String tenTacGia, int soTrang) {
        super(tenNXB, soPhatHanh, maTL);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(){super();}

    public String getTenTacGia() {
        return this.tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return this.soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach: Ma tai lieu=" + getMaTL() +"; NXB=" + getTenNXB() + "; So phat hanh=" + getSoPhatHanh() + "; Ten tac gia=" + this.tenTacGia + "; So trang=" + this.soTrang;
    }
}
