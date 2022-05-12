package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        double[] lala = {1,2,3};

        Vector lolo = new Vector(lala);

        lolo.suma(lala);

        System.out.println(lolo.toString());
    }
}
