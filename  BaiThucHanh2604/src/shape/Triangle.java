package shape;

public class Triangle extends point{
  private int x1, y1, x2, y2, x3, y3;
  private int AB, BC, CA;
  public Triangle(){
  }

  public void nhapToaDoA(){
      System.out.println("Hay nhap toa do diem thu 1:");
      super.nhapToaDo();
      this.x1=x;
      this.y1=y; 
  }
  public void nhapToaDoB(){
    System.out.println("Hay nhap toa do diem thu 2:");
    super.nhapToaDo();
    this.x2=x;
    this.y2=y; 
}
  public void nhapToaDoC(){
    System.out.println("Hay nhap toa do diem thu 3:");
    super.nhapToaDo();
    this.x3=x;
    this.y3=y;
}
public void TinhDoDai(){
     AB=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
     BC=(int)Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
     CA=(int)Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
}
public void InTamGiac(){
    if( AB<BC+ CA && BC<AB+ CA &&  CA<AB+BC ){
        if( AB*AB==BC*BC+ CA* CA || BC*BC==AB*AB+ CA* CA ||  CA* CA== AB*AB+BC*BC)
        System.out.println("Day la tam giac vuong");
        else if(AB==BC && BC== CA)
        System.out.println("Day la tam giac deu");
        else if(AB==BC || AB== CA || AB== CA)
        System.out.println("Day la tam giac can");
        else if(AB*AB > BC*BC+ CA* CA || BC*BC > AB*AB+ CA* CA ||  CA* CA > AB*AB+BC*BC)    
        System.out.println("Day la tam giac tu");
        else
        System.out.println("Day la tam giac nhon");
    }
    else
    System.out.println("Ba canh AB, BC, CA khong tao ra tam giac");
}
}