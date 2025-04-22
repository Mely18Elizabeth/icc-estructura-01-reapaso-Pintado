package Controllers;

import Models.Persona;

public class PersonaController {

    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona aux = personas[i];
            int j = i;
            while (j > 0 && aux.getEdad() < personas[j - 1].getEdad()) {
                personas[j] = personas[j - 1];
                j--;
            }
            personas[j] = aux;
        }
    }

    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            int edadCentral = personas[central].getEdad();

            if (edadCentral == edad) {
                return personas[central];
            } else if (edadCentral < edad) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }

        return null;
    }
}
