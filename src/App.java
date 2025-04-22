import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };

        PersonaController controller = new PersonaController();
        ViewConsole vista = new ViewConsole();

        vista.showMessage("--- Personas ---");
        vista.mostrarPersonas(personas);

        controller.ordenarPorEdad(personas);
        vista.showMessage("\n--- Personas ordenadas por edad ---");
        vista.mostrarPersonas(personas);

        Persona p1 = controller.buscarPorEdad(personas, 40);
        vista.showMessage("\n--- Buscar edad 40 ---");
        vista.mostrarResultadoBusqueda(p1, 40);

        Persona p2 = controller.buscarPorEdad(personas, 99);
        vista.showMessage("\n--- Buscar edad 99 ---");
        vista.mostrarResultadoBusqueda(p2, 99);
    }
}
