package models;

import java.io.Serializable;

public class ThuongHieu implements Serializable{
    private String tenThuongHieu;
    private String hinhAnh;
    public String getTenThuongHieu() {
        return tenThuongHieu;
    }
    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }
    public String getHinhAnh() {
        return hinhAnh;
    }
    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    public ThuongHieu(String tenThuongHieu, String hinhAnh) {
        super();
        this.tenThuongHieu = tenThuongHieu;
        this.hinhAnh = hinhAnh;
    }
    public ThuongHieu() {
        super();
    }
    
}
