package com.example.qlsinhvien.model;

public class GiangVien {
    private String Magv ;
    private String Tengv ;
    private String Diachigv ;
    private int Sodtgv ;

    public GiangVien() {
    }

    public GiangVien(String magv, String tengv, String diachigv, int sodtgv) {
        Magv = magv;
        Tengv = tengv;
        Diachigv = diachigv;
        Sodtgv = sodtgv;
    }

    public String getMagv() {
        return Magv;
    }

    public void setMagv(String magv) {
        Magv = magv;
    }

    public String getTengv() {
        return Tengv;
    }

    public void setTengv(String tengv) {
        Tengv = tengv;
    }

    public String getDiachigv() {
        return Diachigv;
    }

    public void setDiachigv(String diachigv) {
        Diachigv = diachigv;
    }

    public int getSodtgv() {
        return Sodtgv;
    }

    public void setSodtgv(int sodtgv) {
        Sodtgv = sodtgv;
    }
}
