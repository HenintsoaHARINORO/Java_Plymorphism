class DeuxPortes
{
    protected  int e1 , e2;
    protected int s;
    DeuxPortes(){
        e1=0;
        e2=0;
    }
    DeuxPortes(int u,int v){
        e1=u;
        e2=v;
    }
    void afficher(){

    }
    void modifier(int u,int v){
        e1=u;
        e2=v;

    }
    public int getSortie(){
        return s;

    }
    public  String toString(){
        String str="\t|"+e2+"|"+e1+"|"+s+"|\n";
        return str;
    }
}
class PorteEt extends DeuxPortes{
    PorteEt(){
        super();
        s=0;
    }
    PorteEt(int u,int v){
        super(u,v);
        s=e1 & e2;
    }

    @Override
    void afficher() {
        System.out.println("Porte ET\t e2="+e2+"e1="+e1+"s="+s);
    }
    void modifier(int u,int v){
        super.modifier(u,v);
        s=e1 &e2;
    }
}
class PorteOu extends DeuxPortes{
    PorteOu(){
        super();
        s=0;
    }
    PorteOu(int u,int v){
        super(u,v);
        s=e1 | e2;
    }

    @Override
    void afficher() {
        System.out.println("Porte OU"+" e2="+e2+"e1="+e1+"s="+s);
    }
    void modifier(int u,int v){
        super.modifier(u,v);
        s=e1 | e2;
    }
}
public class Application {
    public static void main(String [] args){
        int e1[]={0,1,0,1};
        int e2[]={0,0,1,1};
        DeuxPortes porte[]= new DeuxPortes[2];
        porte[0]=new PorteEt();
        porte[1]= new PorteOu();
        for (int i=0;i<2;i++){
            porte[i].afficher();
            for (int j=0;j<4;j++){

                porte[i].modifier(e1[j],e2[j]);
                System.out.println(porte[i]);
            }
            System.out.println("\n");
        }
    }
}
