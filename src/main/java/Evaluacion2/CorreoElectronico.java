package Evaluacion2;

public class CorreoElectronico {

    private String direccionCorreo, proveedor;

    public CorreoElectronico(String direccionCorreo, String proveedor, Persona persona){
        this.direccionCorreo = direccionCorreo;
        this.proveedor = proveedor;
        Persona persona1 = persona;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString(){
        return "Correo: "+this.direccionCorreo+", proveedor: "+this.proveedor;
    }

}
