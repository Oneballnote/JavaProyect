package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        double[] lala = {1,2,3};
        double[] Ester = {1,1,1};


        Vector lolo = new Vector(lala);
        System.out.println(lolo.toString());

        lolo.suma(Ester);
        System.out.println(lolo.toString());

    }
}
