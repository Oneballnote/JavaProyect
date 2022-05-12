package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        double[] lala = {1,0};
        double[] Ester = {0,1};


        Vector lolo = new Vector(lala);
        System.out.println(lolo.baseCanonica(Ester));

        
        System.out.println(lolo.toString());

    }
}
