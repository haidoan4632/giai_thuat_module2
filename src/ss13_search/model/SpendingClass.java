package ss13_search.model;

import java.io.Serializable;
import java.util.Comparator;

public class SpendingClass implements Comparable<SpendingClass>, Serializable {
    private String maChiTieu;
    private String tenChiTieu;
    private String ngayChiTieu;
    private String soTienChiTieu;
    private String moTaThem;

    public SpendingClass()  {
    }

    public SpendingClass(String maChiTieu, String tenChiTieu, String ngayChiTieu, String soTienChiTieu, String moTaThem) {
        this.maChiTieu = maChiTieu;
        this.tenChiTieu = tenChiTieu;
        this.ngayChiTieu = ngayChiTieu;
        this.soTienChiTieu = soTienChiTieu;
        this.moTaThem = moTaThem;
    }

    public String getMaChiTieu() {
        return maChiTieu;
    }

    public void setMaChiTieu(String maChiTieu) {
        this.maChiTieu = maChiTieu;
    }

    public String getTenChiTieu() {
        return tenChiTieu;
    }

    public void setTenChiTieu(String tenChiTieu) {
        this.tenChiTieu = tenChiTieu;
    }

    public String getNgayChiTieu() {
        return ngayChiTieu;
    }

    public void setNgayChiTieu(String ngayChiTieu) {
        this.ngayChiTieu = ngayChiTieu;
    }

    public String getSoTienChiTieu() {
        return soTienChiTieu;
    }

    public void setSoTienChiTieu(String soTienChiTieu) {
        this.soTienChiTieu = soTienChiTieu;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }

    @Override
    public String toString() {
        return "SpendingClass{" +
                "maChiTieu='" + maChiTieu + '\'' +
                ", tenChiTieu='" + tenChiTieu + '\'' +
                ", ngayChiTieu='" + ngayChiTieu + '\'' +
                ", soTienChiTieu='" + soTienChiTieu + '\'' +
                ", moTaThem='" + moTaThem + '\'' +
                '}';
    }


    @Override
    public int compareTo(SpendingClass o) {
        return this.getTenChiTieu().compareTo(o.getTenChiTieu());
    }

}
