package Evaluacion2;

public class Launcher {
    public static void main(String[] args) {
        Evaluacion2.Launcher launcher = new Evaluacion2.Launcher();
        launcher.inicializar();
    }

    public void inicializar(){
        GestorPersonal gestorPersonal = new GestorPersonal();
        gestorPersonal.agregarPersona("211934875","Leo","Roa");
        gestorPersonal.agregarPersona("210000001","Rodrigo","Perez");
        gestorPersonal.agregarPersona("210000002","Maria","Jimenez");
        gestorPersonal.agregarPersona("210000003","Leo","Messi");
        //No deberia agregarse
        gestorPersonal.agregarPersona("210000003","Juan","Dominguez");

        System.out.println("Personas agregadas: ");
        gestorPersonal.mostrarPersonas();

        System.out.println("=========== BUSCAR POR NOMBRE ===============");
        gestorPersonal.buscarPersonaNombre("leo");
        System.out.println("=========== BUSCAR POR RUT ===============");
        gestorPersonal.buscarPersonaRUT("210000002");
        System.out.println("=========== CORREOS ===============");
        gestorPersonal.agregarCorreo("Leo","roa","leo@gmail.com","Gmail");
        gestorPersonal.agregarCorreo("Leo","roa","hola@yahoo.com","Yahoo");
        gestorPersonal.agregarCorreo("leo","messi","leomessi@gmail.com","Gmail");
        gestorPersonal.mostrarCorreos();
    }
}
