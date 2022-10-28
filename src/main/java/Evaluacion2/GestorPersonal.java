package Evaluacion2;

import java.util.ArrayList;
import java.util.List;

public class GestorPersonal {

    private List<Persona> personas;
    private List<Automovil> autos;
    private List<CorreoElectronico> correos;

    public GestorPersonal() {
        this.personas = new ArrayList<>();
        this.autos = new ArrayList<>();
        this.correos = new ArrayList<>();
    }

    public Persona buscarPersona(String nombre, String rut) {
        for (Persona persona : this.personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre) && persona.getRut().equals(rut)) {
                return persona;
            }
        }
        return null;
    }

    public boolean agregarPersona(String rut, String nombre, String apellido) {
        if (buscarPersona(nombre, rut) == null) {
            Persona persona = new Persona(rut, nombre, apellido);
            this.personas.add(persona);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarPersona(String nombre, String apellido) {
        Persona persona = this.buscarPersona(nombre, apellido);
        if (persona != null) {
            this.personas.remove(persona);
            return true;
        } else {
            return false;
        }
    }

    public void buscarPersonaNombre(String nombre) {
        for (Persona persona : this.personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Persona encontrada: "+persona.toString());
            }
        }
    }

    public void buscarPersonaRUT(String rut) {
        for (Persona persona : this.personas) {
            if (persona.getRut().equals(rut)) {
                System.out.println("Persona encontrada: "+persona.toString());
            }
        }
    }

    public void mostrarPersonas() {
        for (Persona persona : this.personas) {
            System.out.println(persona.toString());
        }
    }









    public boolean agregarCorreo(String nombre, String apellido, String direccionCorreo, String proveedor) {
        if (buscarPersona(nombre,apellido) != null) {
            CorreoElectronico correo = new CorreoElectronico(direccionCorreo, proveedor, buscarPersona(nombre,apellido));
            this.correos.add(correo);
            return true;
        }
        else {
            return false;
        }
    }

    public void mostrarCorreos() {
        for (CorreoElectronico correo : this.correos) {
            System.out.println(correo.toString());
        }
    }



}










