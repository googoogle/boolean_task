
public class boolean_task {

    boolean a, b;
    boolean c = true, d = true;
    boolean e;

    public boolean isTrueA (boolean a, boolean b){
        return !a && b;
    }
    public boolean isTrueB (boolean b, boolean c ){
        return b || c;
    }
    public boolean isTrueC (boolean a, boolean b, boolean c){
        return a && b != c ;
    }
    public boolean isTrueD (boolean b, boolean c, boolean e){
        return  b || c || e;
    }
    public boolean isTrueE (boolean a, boolean c, boolean e){
        return a||c && e;
    }


    public static void main(String[] args) {
        boolean_task ob = new boolean_task();

        System.out.println(ob.isTrueA(ob.a,ob.b));
        System.out.println(ob.isTrueB(ob.b,ob.c));
        System.out.println(ob.isTrueC(ob.a,ob.b, ob.c));
        System.out.println(ob.isTrueD(ob.b, ob.c, ob.e));
        System.out.println(ob.isTrueE(ob.a, ob.a, ob.e));

    }
}

