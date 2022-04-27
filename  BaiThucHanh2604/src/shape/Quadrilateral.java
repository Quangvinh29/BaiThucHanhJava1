package shape;

public class Quadrilateral extends point {
    private int x1, y1, x2, y2, x3, y3, x4, y4;
    private int AB, BC, CD, DA;
    public Quadrilateral(){
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
  public void nhapToaDoD(){
    System.out.println("Hay nhap toa do diem thu 4:");
    super.nhapToaDo();
    this.x4=x;
    this.y4=y; 
}
  public void TinhDoDai(){
       AB=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
       BC=(int)Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
       DA=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
       CD=(int)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
  }
  public void InTuGiac(){
        if( AB==BC && BC==CD && CD == DA && DA == AB )
        System.out.println("Day la hinh vuong");
        else if(AB==CD && BC== DA && AB !=BC && CD !=DA)
        System.out.println("Day la hinh chu nhat");
        else if(AB==CD && BC != DA || AB !=CD && BC ==DA)
        System.out.println("Day la hinh thang");
        else
        System.out.println("Ba canh AB, BC, CD va DA chi tao ra 1 tu giac binh thuong");
    } 
}

