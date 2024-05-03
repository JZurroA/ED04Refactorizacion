/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed.ed04refactorizacion;

/**
 *
 * @author Jabier Zurro Aduriz
 */
public class PuntoCliente {
    public static void main(String[] args) {
   
        ClasePunto p1 = new ClasePunto(2, 6); 
      
        // Punto 2
        ClasePunto p2 = new ClasePunto(4, 9);            
        visualizarPunto(p1, p2);
      
        p1.moverPunto(5, -7);
        visualizarPunto(p1, p2);
    }

    public static void visualizarPunto(ClasePunto p1, ClasePunto p2) {
        // Se ejecutan los mÃ©todos de la clase Punto y
        // se muestran los resultados obtenidos
        System.out.printf("Distancia del punto 1 al origen (0, 0): %.2f\n", p1.distancia());
        System.out.printf("Distancia del punto 2 al origen (0, 0): %.2f\n", p2.distancia());
        System.out.printf("Distancia entre los 2 puntos: %.2f\n", p1.distanciaPuntos(p2));
        System.out.println();
    }
}
