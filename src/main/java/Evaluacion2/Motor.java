package Evaluacion2;

public class Motor {
    private int nMotor;
    private double cmCubicos;

    public Motor (int nMotor, double cmCubicos){
        this.nMotor = nMotor;
        this.cmCubicos = cmCubicos;
    }

    public int getnMotor() {
        return nMotor;
    }

    public double getCmCubicos() {
        return cmCubicos;
    }
}
