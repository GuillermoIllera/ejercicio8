package Main;

import Model.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(24);
        persona.setNombre("Guillermo");
        persona.setTelefono("648937009");

        System.out.println("La persona creada es: " + persona.getNombre() + ", tiene " + persona.getEdad() + "años y su número de teléfono es " + persona.getTelefono() );

    }
}
