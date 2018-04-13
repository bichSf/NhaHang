/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.bich.person.controller;

import hust.bich.person.service.MenuImpl;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NguoiController {

    public static void main(String[] args) {
        LuaChon();
        Menu();

    }

    public static void LuaChon() {
        System.out.println("ban muon: 1. nhap thong tin");
        System.out.println("          2. sua thong tin");
        System.out.println("          3. xoa thong tin");
        System.out.println("          4. xem ds NV");
        System.out.println("          5. ban thong ke luong");
        System.out.println("          6. tim kiem nv");
        System.out.println("          7. Thoat");
    }

    public static void Menu() {
        MenuImpl menu = new MenuImpl();
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        switch (a) {
            case 1: {
                menu.nhapNV();
                LuaChon();
                Menu();
                break;
            }
            case 2: {
                menu.suaNV();
                LuaChon();
                Menu();
                break;
            }
            case 3: {
                menu.xoaNV();
                LuaChon();
                Menu();
                break;
            }
            case 4: {
                menu.xemNV();
                LuaChon();
                Menu();
                break;
            }
            case 5: {
                menu.thongKeNV();
                LuaChon();
                Menu();
                break;
            }
            case 6: {
                menu.timKiemNV();
                LuaChon();
                Menu();
                break;
            }

            default: {

                System.out.println("muon thuc hien tiep(Y/N)");
                Scanner c = new Scanner(System.in);
                char ch = c.nextLine().charAt(0);
                if (ch == 'y' || ch == 'Y') {
                    return;
                } else {
                    LuaChon();
                    Menu();
                }
            }
        }
    }
}
