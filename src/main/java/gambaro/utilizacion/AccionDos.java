package gambaro.utilizacion;

import gambaro.framework.Accion;

public class AccionDos implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionDos desde el proyecto cliente...");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 2";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto trae las primeras diez personas de la BD";
    }
}
