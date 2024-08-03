package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    private List<Sinhvien> danhSachSinhVien = new ArrayList<>();
    public void themSinhVien(Sinhvien sv) {
        if (sv.getTenlop().matches(".*[^a-zA-Z0-9 ].*")) {
            throw new IllegalArgumentException("Tên lớp chứa ký tự đặc biệt");
        }
        if (sv.getTenlop().length() > 255) {
            throw new IllegalArgumentException("Tên lớp quá dài");
        }
        if (sv.getHoten().length() > 255) {
            throw new IllegalArgumentException("Họ tên quá dài");
        }
        danhSachSinhVien.add(sv);
    }

    public List<Sinhvien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public List<Sinhvien> timKiemTheoTen(String ten) {
        List<Sinhvien> ketQua = new ArrayList<>();
        for (Sinhvien sv : danhSachSinhVien) {
            if (sv.getHoten().toLowerCase().contains(ten.toLowerCase())) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }

    public List<Sinhvien> timKiemTheoMaLop(String maLop) {
        List<Sinhvien> ketQua = new ArrayList<>();
        for (Sinhvien sv : danhSachSinhVien) {
            if (sv.getMalop().equalsIgnoreCase(maLop)) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }
}
