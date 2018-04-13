/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.bich.person.service;

import hust.bich.person.model.Menu;
import hust.bich.person.model.NguoiImpl;
import hust.bich.person.model.NhanVien;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MenuImpl implements IMenu {

    Scanner x = new Scanner(System.in);
    int n;
    float sumLuong = 0;
    // NhanVien nv[] = new NhanVien[n];
    NhanVien[] dsNV = null;

    public MenuImpl() {
    }

    public Scanner getX() {
        return x;
    }

    public void setX(Scanner x) {
        this.x = x;
    }

    public float getSumLuong() {
        return sumLuong;
    }

    public void setSumLuong(float sumLuong) {
        this.sumLuong = sumLuong;
    }

//    public NhanVien[] getNv() {
//        return nv;
//    }
//
//    public void setNv(NhanVien[] nv) {
//        this.nv = nv;
//    }
    public NhanVien[] getDsNV() {
        return dsNV;
    }

    public void setDsNV(NhanVien[] dsNV) {
        this.dsNV = dsNV;
    }

    @Override
    public void nhapNV() {

        System.out.println("========== NHAP TT NV ===========");
        do {
            System.out.println("so nhan vien nhap them:");
            n = x.nextInt();
        } while (n < 0);
        dsNV = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " .Nhan vien: ");
            dsNV[i] = new NhanVien();
            dsNV[i].nhapTT();
            System.out.println("Thong tin tinh luong:");
            dsNV[i].nhapluongNV();
        }

    }

    @Override
    public void suaNV() {
        System.out.println("======= SUA THONG TIN NV =========");
        System.out.println("nhap id cua NV can sua:");

        System.out.print("nhap id NV:");
        String id = x.nextLine();
        for (int i = 0; i < n; i++) {
            if (id.compareToIgnoreCase(dsNV[i].getIdNV()) == 0) {
                dsNV[i].nhapTT();
            }
        }
    }

    @Override
    public void xemNV() {
        System.out.println("======= DANH SACH NV =======");
        try {

            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ".");
                dsNV[i].hienTT();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void xoaNV() {
        System.out.println("======= XOA THONG TIN NV =======");
        System.out.println("nhap id cua NV can xoa:");
        System.out.print("nhap id NV:");
        String id = x.nextLine();
        for (int i = 0; i < n; i++) {
            if (id.compareToIgnoreCase(dsNV[i].getIdNV()) == 0) {
                dsNV[i] = dsNV[i + 1];
            }
        }
    }

    @Override
    public void thongKeNV() {
        System.out.println("======= BAN THONG KE NV =======");
        System.out.println("co:" + n + "nhan vien");
        for (int i = 0; i < n; i++) {
            sumLuong += dsNV[i].tinhluongNV();
        }
        System.out.println("tong tien luong nv nha hang =" + sumLuong);
    }

    @Override
    public void timKiemNV() {
        System.out.println("======== TIM KIEM NHAN VIEN =======");
        System.out.print("nhap id NV can tim:");
        String id = x.nextLine();
        for (int i = 0; i < dsNV.length; i++) {
            if (id.compareToIgnoreCase(dsNV[i].getIdNV()) == 0) {
                dsNV[i].hienTT();
            }
        }
    }

}
