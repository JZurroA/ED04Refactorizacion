/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.ed04refactorizacion;

/**
 *
 * @author Jabier Zurro Aduriz
 */
public class ClasePunto {
    
    // Atributos, estado o variables miembro
    // Se declaran a nivel de clase y se puede trabajar con ellas
    // desde cualquier mÃ©todo de la clase sin pasarlos como parÃ¡metros
    private int x;
    private int y;

    public ClasePunto(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

   // Comportamiento, interfaz o mÃ©todos miembro
   // Se declaran public para ser accesibles desde fuera de la clase
   // Se elimina el modificador static
   // Trabajan con los atributos directamente

   // Calcula la distancia desde el origen (0, 0) a las coordenadas del punto
   public double distancia() {
      return Math.sqrt(x * x + y * y);
   }
   
   // Calcula la distancia entre el punto p2 y las coordenadas del punto
   public double distanciaPuntos(ClasePunto p2) {
      return Math.sqrt(Math.pow(x - p2.x, 2) + Math.pow(y - p2.y, 2));
   }
   
   // Mueve la coordenada x del punto una distancia dx y la coordenada y otra dy
   public void moverPunto(int dx, int dy) {
      x += dx;
      y += dy;
   }
}
