class TwoGates
{
    protected  int e1 , e2;
    protected int s;
    TwoGates(){
        e1=0;
        e2=0;
    }
    TwoGates(int u,int v){
        e1=u;
        e2=v;
    }
    void show(){

    }
    void change(int u,int v){
        e1=u;
        e2=v;

    }
    public int getOutput(){
        return s;

    }
    public  String toString(){
        String str="\t|"+e2+"|"+e1+"|"+s+"|\n";
        return str;
    }
}
class AndGate extends TwoGates{
    AndGate(){
        super();
        s=0;
    }
    AndGate(int u,int v){
        super(u,v);
        s=e1 & e2;
    }

    @Override
    void show() {
        System.out.println("Gate AND");
    }
    void change(int u,int v){
        super.change(u,v);
        s=e1 &e2;
    }
}
class OrGate extends TwoGates{
    OrGate(){
        super();
        s=0;
    }
    OrGate(int u,int v){
        super(u,v);
        s=e1 | e2;
    }

    @Override
    void show() {
        System.out.println("Gate OR");
    }
    void change(int u,int v){
        super.change(u,v);
        s=e1 | e2;
    }
}
public class Application {
    public static void main(String [] args){
        int e1[]={0,1,0,1};
        int e2[]={0,0,1,1};
        TwoGates porte[]= new TwoGates[2];
        porte[0]=new AndGate();
        porte[1]= new OrGate();
        for (int i=0;i<2;i++){
            porte[i].show();
            for (int j=0;j<4;j++){

                porte[i].change(e1[j],e2[j]);
                System.out.println(porte[i]);
            }
            System.out.println("\n");
        }
    }
}
