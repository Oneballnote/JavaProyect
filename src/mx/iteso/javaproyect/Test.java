package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        // int[] primerVector = {2,3,4};
        // int[] segundoVector = {9,4,5};

        // Vector objetoVector = new Vector(primerVector);
        // Vector objetoSegundoVector = new Vector(segundoVector);

        // System.out.println(objetoVector.baseCanonica(segundoVector));

        // System.out.println(objetoVector.toString());
        // objetoVector.suma(segundoVector);
        // System.out.println(objetoVector.toString());
        // objetoVector.resta(segundoVector);
        // System.out.println(objetoVector.toString());


        // objetoVector.productoxEscalar(2);
        // System.out.println(objetoVector.toString());

        // objetoVector.equals(objetoSegundoVector);
        // objetoVector.equals(objetoVector);

        // objetoSegundoVector = (Vector) objetoVector.clone();   
        // System.out.println(objetoSegundoVector.toString());   

        int[][] matriz1 = {{2,5,61},{4,4,6}};

        Matriznxn lolo = new Matriznxn(matriz1);

        System.out.println(lolo.toString());
    }
}
