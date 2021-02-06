
class MultiCalcul{

    protected float a;
    protected float b;
    protected float result;
    MultiCalcul(){
        a=0;
        b=0;
    }
    MultiCalcul(float u, float v){
        a=u;
        b=v;
    }
float compute(float u,float v)
{

    return result;
}
    void  show(){

    }

}
class DerivProduct extends MultiCalcul{
    float res;
    DerivProduct()
    {
        super();
    }
    DerivProduct(float u,float v){
        super(u,v);

    }
 float compute(float u,float v){
        super.compute(u,v);
        float res;
        res= u*v;
        return res;
    }
    void afficher(){
        System.out.print(a+"*"+b+"=");
    }
}
class DerivSomme extends MultiCalcul{
    float res;
    DerivSomme(){
        super();
    }
    DerivSomme(float u,float v){
        super(u,v);

    }
    float compute(float u,float v){
        super.compute(u,v);
        float res;
        res= u+v;
        return res;
    }
    void afficher(){
        System.out.print(a+"+"+b+"=");
    }
}
public class Res {
    public static void main(String[] args) {
        float res=0;
        MultiCalcul point[] = new MultiCalcul[2];
        point[0] = new DerivProduit(4,3);
        point[1]= new DerivSomme(4,3);
    for(int i=0 ;i<2;i++) {
    res = point[i].calculer(4,3);
    point[i].afficher();
    System.out.println(res);
     }


    }
}
