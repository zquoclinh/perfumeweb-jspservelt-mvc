package models;

public class TrangThaiDonHang {
    private String tenTrangThai;

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }

    public TrangThaiDonHang(String tenTrangThai) {
        super();
        this.tenTrangThai = tenTrangThai;
    }

    public TrangThaiDonHang() {
        super();
    }
    
}
