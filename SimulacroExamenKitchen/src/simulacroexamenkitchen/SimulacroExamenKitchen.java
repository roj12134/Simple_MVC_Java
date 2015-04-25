/*
 * SimulacroExamenKitchen.java
 * 24 Octubre 2012
 * Giovanni Rojas Mazariegos 12134
 * 
 */
package simulacroexamenkitchen;

import javax.swing.JFrame;

/**
 *
 * @author Giovanni Rojas Mazariegos 
 * Esta es la clase del main y configura los valores iniciales de 
 * la comida como cuanta agua necesita para que sea posible cocinar 
 */
public class SimulacroExamenKitchen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
      JFrame frame = new JFrame ("Cook");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // se cierra 
      
      
      // en este momento hare como un mi mini configuracioncita 
      
      FoodModel [] food = new FoodModel [4]; // las cuatro comidas 
      food[0] = new FoodModel ("White Rice",2);
      food[1] = new FoodModel ("Integral Rice",2.5);
      food[2] = new FoodModel ("Oats",1);
      food[3] = new FoodModel ("Spaguetti",3); 
      
      // he terminado de configurar mi comida y se lo mando a mi modelo 
      
      
      //MVC
      
      KitchenView view = new KitchenView ();
      KitchenModel model = new KitchenModel (food);
      KitchenController controlador = new KitchenController (view,model); 
      
      
      frame.getContentPane().add(view); // agrego la vista al panel 
      frame.setResizable(false);
      frame.pack();
      frame.setVisible(true); // muestro la pantalla 
      
    }
}
