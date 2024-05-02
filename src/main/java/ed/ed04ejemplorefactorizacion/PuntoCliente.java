package ed.ed04ejemplorefactorizacion;
/*
   Programa cliente que utiliza la clase Punto definida en el fichero Punto.java
   Se debe compilar primero el fichero Punto.java y generar Punto.class
   para que el programa funcione
*/

/**
 *
 * @author Jabier Zurro Aduriz
 */
public class PuntoCliente {
   public static void main(String[] args) {
   
      ClasePunto p1 = crearPunto(); 
      
      modificarPunto(p1, 2, 6);
      
      // Punto 2
      ClasePunto p2 = crearPunto();
      
      modificarPunto(p2, 4, 9);
            
      visualizarPunto(p1, p2);
      
      p1.moverPunto(5, -7);
      visualizarPunto(p1, p2);
   }

    public static void modificarPunto(ClasePunto p1, int coordX, int coordY) {
        System.out.println("Modificamos las coordenadas de un punto");
        p1.setX(coordX);
        p1.setY(coordY);
    }

    public static ClasePunto crearPunto() {
        // Punto 1
        System.out.println(MENSAJE_CREAR);
        ClasePunto p1 = new ClasePunto();
        return p1;
    }
    public static final String MENSAJE_CREAR = "Creamos un punto";

    public static void visualizarPunto(ClasePunto p1, ClasePunto p2) {
        // Se ejecutan los mÃ©todos de la clase Punto y
        // se muestran los resultados obtenidos
        System.out.printf("Distancia del punto 1 al origen (0, 0): %.2f\n", p1.distancia());
        System.out.printf("Distancia del punto 2 al origen (0, 0): %.2f\n", p2.distancia());
        System.out.printf("Distancia entre los 2 puntos: %.2f\n", p1.distanciaPuntos(p2));
        System.out.println();
    }
}