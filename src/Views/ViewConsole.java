package Views;

import Models.Persona;

public class ViewConsole {

    public void showMessage(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarPersonas(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println(p.getNombre() + " - " + p.getEdad());
        }
    }

    public void mostrarResultadoBusqueda(Persona persona, int edadBuscada) {
        if (persona != null) {
            System.out.println("Persona encontrada con edad " + edadBuscada + ": " + persona.getNombre() + ", Edad: " + persona.getEdad());
        } else {
            System.out.println("No se encontró una persona con la edad " + edadBuscada + ".");
        }
    }
}
