package mx.iteso.javaproyect;

public class Vector implements Operators{
    private double[] vect = new double[3];

   public Vector(double[] vect){
        this.vect = vect;
   }

    public void setVect(double[] vect) {
        this.vect = vect;
    }

    public double[] getVect() {
        return vect;
    }

   
    

    @Override
    public double[][] suma(double[][] x, double[][] y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double[][] resta(double[][] x, double[][] y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double[][] producto(double[][] x, double[][] y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double[][] productoxEscalar(double[][] x, int y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString(){

        String msg = " ";
        if(this.vect[2] == 0 ){
            msg = String.format("Vector: [%.2f], [%.2f]", this.vect[0],this.vect[1]);

        }else{
            msg = String.format("Vector: [%.2f], [%.2f], [%.2f]", this.vect[0],this.vect[1],this.vect[2]);

        }
        return msg;
    }
    
}
