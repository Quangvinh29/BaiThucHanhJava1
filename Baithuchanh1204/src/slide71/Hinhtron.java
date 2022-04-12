package slide71;

public class Hinhtron {
    private final float PI = 3.14f;
    private float bankinh;

    public float getBankinh(){
        return bankinh;
    }
    public void setBankinh(float bankinh){
        this.bankinh = bankinh;
    }
    public float tinhChuvi(){
        return 2 * PI * bankinh;
    }
    public float tinhdientich(){
    return PI * bankinh * bankinh;
    }
}
