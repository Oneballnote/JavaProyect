package mx.iteso.javaproyect;

public class Vector implements OperatorsVect{
        private Estados E1 =  Estados.CORRECTO;
        private int[] vect = new int[3];

   public Vector(int[] vect){
        setVect(vect);
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    public int[] getVect() {
        return vect;
    }

    public int[] suma(int[] x) {

        for(int i = 0; i < this.vect.length;i++){
            this.vect[i] +=  x[i];
        } 
        System.out.println(E1.toString());
        return this.vect;
    }

 
    public int[] resta(int[] x) {
        for(int i = 0; i < this.vect.length; i++){
            this.vect[i] -= x[i];
        }
        return this.vect;
    }

 
    public int[] productoxEscalar(int y) {
        for(int i = 0; i < this.vect.length;i++){
            this.vect[i] *= y;
        }
        return this.vect;
    }

    @Override
    public String toString(){
        String msg = " ";

        try{
            if(this.vect[2] == 0 ){
                msg = String.format("Vector: [%.2f], [%.2f]", this.vect[0],this.vect[1]);
    
            }else{
                msg = String.format("Vector: [%.2f], [%.2f], [%.2f]", this.vect[0],this.vect[1],this.vect[2]);
                
            }
        }catch(ArrayIndexOutOfBoundsException e){
           
            msg = String.format("Vector: [%.2f], [%.2f]", this.vect[0],this.vect[1]);

        }
            return msg;
    }
    public int[] productoCruz(int[] segundaMatriz){
        try {
            int[] terceraMatriz = {0,0,0};
            if((segundaMatriz.length != 3) && (this.vect.length !=3)){
           
                throw new ManejoDeExcepciones(); 
            }else{
                terceraMatriz[0] = (this.vect[1]*segundaMatriz[2])-(this.vect[2]*segundaMatriz[1]); 
                terceraMatriz[1] = (this.vect[2]*segundaMatriz[0])-(this.vect[0]*segundaMatriz[2]);
                terceraMatriz[2] = (this.vect[0]*segundaMatriz[1])-(this.vect[1]*segundaMatriz[0]);
                this.vect = terceraMatriz;
                return this.vect;
            }
        } catch (ManejoDeExcepciones e) {
            System.out.println("Este metodo funciona solo con vectores en R3");
        }
       
        return this.vect;
    }

   @Override
    public boolean baseCanonica(int[] lolo){
        
        if(((lolo[0] == 1)&&(lolo[1] == 0)||(lolo[0] == 0) && (lolo[1] == 1))&&((this.vect[0] == 1)&&(this.vect[1] == 0)||(this.vect[0] == 0) && (this.vect[1] == 1))){
            return true;
        }
        return false;
    }
    
    public boolean equals(Vector o){
        int[] lolo = o.getVect();

        for (int i = 0; i < 3; i++) {
            if(this.vect[i] != lolo[i]){
                return false;
            }
        }
        return true;
    }

    public Object clone(){
        Vector vectorClone = new Vector(this.vect);
        return vectorClone;
    }

    
}
