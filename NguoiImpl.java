/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.bich.person.model;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NguoiImpl implements IBasic, INguoi {

    private String idNV;
    private String tenNV;
    private String diaChi;
    private int SDT;
    protected float thuong;
    protected float phat;
    protected int soGioLam;

    public NguoiImpl() {
    }

    public NguoiImpl(String idNV, String tenNV, String diaChi, int SDT, float thuong, float phat, int soGioLam) {
        this.idNV = idNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.thuong = thuong;
        this.phat = phat;
        this.soGioLam = soGioLam;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    public float getPhat() {
        return phat;
    }

    public void setPhat(float phat) {
        this.phat = phat;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    @Override
    public void nhapTT() {
        do {
            System.out.print("nhap id NV: ");
            this.idNV = new Scanner(System.in).nextLine();
        }
        while (idNV == null);
        do {
            System.out.print("nhap Ten: ");
            this.tenNV = new Scanner(System.in).nextLine();
        }
        while (tenNV == null);
        do {
            System.out.print("nhap dia chi NV: ");
            this.diaChi = new Scanner(System.in).nextLine();
        }
        while (diaChi == null);
        do {
            System.out.print("nhap SDT: ");
            this.SDT = new Scanner(System.in).nextInt();
        }
        while (SDT < 0);
    }

    @Override
    public void hienTT() {
        System.out.println(" id NV:" + this.idNV);
        System.out.println("ten NV: " + this.tenNV);
        System.out.println("dia chi: " + this.diaChi);
        System.out.println("SDT: " + this.SDT);
    }

    @Override
    public void nhapluongNV() {
       do {
            System.out.print("so gio lam NV = ");
            this.soGioLam = new Scanner(System.in).nextInt();
        }
        while (soGioLam < 0);
        do {
            System.out.print("tien thuong = ");
            this.thuong = new Scanner(System.in).nextFloat();
        }
        while (thuong < 0);
        do {
            System.out.print("tien phat = ");
            this.phat = new Scanner(System.in).nextFloat();
        }
        while (phat < 0);
        
    }

}
