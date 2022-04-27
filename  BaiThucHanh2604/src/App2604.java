


import shape.Quadrilateral;
import shape.Triangle;
import shape.point;

public class App2604 {  
    public static void main(String[] args){
        point point=new point();
        point.nhapToaDo();
        point.nhapTenDiem();
        point.inToaDo();

       Triangle triangle=new Triangle();
       triangle.nhapToaDoA();
       triangle.nhapToaDoB();
       triangle.nhapToaDoC();
       triangle.TinhDoDai();
       triangle.InTamGiac();
    
       Quadrilateral quadrilateral=new Quadrilateral();
       quadrilateral.nhapToaDoA();
       quadrilateral.nhapToaDoB();
       quadrilateral.nhapToaDoC();
       quadrilateral.TinhDoDai();
       quadrilateral.InTuGiac();
    }
}
