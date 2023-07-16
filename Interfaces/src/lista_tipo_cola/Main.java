package lista_tipo_cola;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int opcion = 0, nodoInfo = 0;
        Cola cola = new Cola();

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opercaciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar condenido de la Cola\n"
                        + "4. Salir\n\n"));

                switch (opcion) {
                    case 1:
                        nodoInfo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor ingrese el valor a guardar en el nodo"));
                        cola.Insertar(nodoInfo);
                        break;
                    case 2:
                        if (!cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                    + cola.Extraer());
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                        }

                        break;
                    case 3:

                        cola.MostrarContenido();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Esta opcion no es valida");
                        break;
                }

            } catch (NumberFormatException e) {
            }

        } while (opcion != 4);
    }
}
