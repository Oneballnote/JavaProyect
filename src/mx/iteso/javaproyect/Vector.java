package mx.iteso.javaproyect;

public class Vector {
    private double valorX, valorY, valorZ;

    public Vector(double valorX, double valorY){
        setValorX(valorX);
        setValorY(valorY);
    } 
    public Vector(double valorX, double valorY, double valorZ){
        setValorX(valorX);
        setValorY(valorY);
        setValorZ(valorZ);
    }

    public void setValorX(double valorX) {
        this.valorX = valorX;
    }
    public void setValorY(double valorY) {
        this.valorY = valorY;
    }
    public void setValorZ(double valorZ) {
        this.valorZ = valorZ;
    }
    public double getValorX() {
        return valorX;
    }
    public double getValorY() {
        return valorY;
    }
    public double getValorZ() {
        return valorZ;
    }

    public void multiplicacionPorEscalar(int escalar){
        this.valorX = this.valorX*escalar;
        this.valorY = this.valorY*escalar;
        this.valorZ = this.valorZ*escalar;
    }

    
}
