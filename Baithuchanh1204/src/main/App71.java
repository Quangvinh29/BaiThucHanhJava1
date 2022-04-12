package main;

import slide71.Hinhtron;

public class App71 {
    public static void main(String[] args){
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.setBankinh(10);
        float chuvi = hinhtron.tinhChuvi();
        float dientich = hinhtron.tinhdientich();
        System.out.println("chu vi hinh tron =" +chuvi+ "va dien tich = " +dientich);
    }
}
