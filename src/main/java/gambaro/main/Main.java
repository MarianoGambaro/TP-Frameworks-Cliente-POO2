package gambaro.main;

import gambaro.framework.Framework;

public class Main {
    static void main() {
        String pathConfig = "acciones"; //nombre del archivo en resources

        System.out.println("Cliente: Iniciando Framework empaquetado...");

        Framework framework = new Framework();
        framework.iniciar(pathConfig);
    }
}
