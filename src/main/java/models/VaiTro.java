package models;

public class VaiTro {
    private String tenVaiTro;
    private String moTa;
    public String getTenVaiTro() {
        return tenVaiTro;
    }
    public void setTenVaiTro(String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public VaiTro(String tenVaiTro, String moTa) {
        super();
        this.tenVaiTro = tenVaiTro;
        this.moTa = moTa;
    }
    public VaiTro() {
        super();
    }
    
}
