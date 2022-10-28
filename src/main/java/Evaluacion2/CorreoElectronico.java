package Evaluacion2;

public class CorreoElectronico {

    private String direccionCorreo, proveedor;

    public CorreoElectronico(String direccionCorreo, String proveedor){
        this.direccionCorreo = direccionCorreo;
        this.proveedor = proveedor;
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
