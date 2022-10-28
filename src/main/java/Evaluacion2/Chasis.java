package Evaluacion2;

public class Chasis {
    private int nChasis;
    private String material;

    public Chasis (int nChasis, String material){
        this.nChasis = nChasis;
        this.material = material;
    }

    public int getnChasis() {
        return nChasis;
    }

    public String getMaterial() {
        return material;
    }
}
