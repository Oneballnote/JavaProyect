package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        int[] lala = {1,2,3};
        int[] Ester = {1,2,3};

        Vector lolo = new Vector(lala);
        System.out.println(lolo.baseCanonica(Ester));

        lolo.productoCruz(Ester);
        
        System.out.println(lolo.toString());

    }
}
