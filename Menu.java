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
public class Menu implements IBasic {

    private int option;
    private String decs;

    public Menu() {
    }

    public Menu(int option, String decs) {
        this.option = option;
        this.decs = decs;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    @Override
    public void hienTT() {
        System.out.println("show menu");
    }

}
