package main;

import slide73.ToaDo;

public class App73 {
    public static void main(String[] args){
        ToaDo toando1 = new ToaDo();
        toando1.x = 10;
        toando1.y = 20;

        ToaDo toando2 = new ToaDo();
        toando2.x = 5;
        toando2.y = 6;

        ToaDo.thongtin = "Luu toa do cac hinh hoc";
    }
}
