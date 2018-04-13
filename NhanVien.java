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
public class NhanVien extends NguoiImpl {

    private int heSoLuong;

    public NhanVien() {
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public void nhapluongNV() {
      
        do {System.out.println("he so luong NV=");
        this.heSoLuong = new Scanner(System.in).nextInt();
        }
        while (heSoLuong<0);
    }
    
     public float tinhluongNV() {
         return this.soGioLam * this.heSoLuong + this.thuong - this.phat;
     } 

}
