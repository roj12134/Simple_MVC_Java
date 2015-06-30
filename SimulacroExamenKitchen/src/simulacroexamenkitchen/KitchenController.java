 /*
 * KitchenController.java
 * 24 Octubre 2012
 * Giovanni Rojas Mazariegos 12134
 * 
 */
package simulacroexamenkitchen;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovanni Rojas 
 * 
 * Esta clase es la intermediaria entre la vista y el controlador. 
 */
public class KitchenController implements ActionListener, MouseListener,MouseMotionListener{
    
    private KitchenView view;
    private KitchenModel model;
    private String foodSelected; // es la comida que esta siendo seleccionada. 
    private boolean wannaCook; // esta variable es que si quiero cocinar
    private boolean confirm;

    public KitchenController(KitchenView vista, KitchenModel model) {
        this.view = vista;
        this.model = model;
        foodSelected = ""; // inicialmente no hay comida seleccionada 
        wannaCook = false;
        confirm = false;
        
        
        view.getLabelOlla().addMouseListener(this); // agrego listener de mouselistener de la olla 
        view.getLabelOlla().addMouseMotionListener(this);
        
        
        view.getWhiteRiceLabel().addMouseListener(this);
        view.getWaterLabel().addMouseMotionListener(this);
        view.getWaterLabel().addMouseListener(this); // media copa de agua 
        view.getWhiteRiceLabel().addMouseMotionListener(this);
        view.getCupWaterLabel().addMouseListener(this); // copa entera de agua 
        view.getCupWaterLabel().addMouseMotionListener(this);
        view.getIntegraRiceLabel().addMouseListener(this);
        view.getIntegraRiceLabel().addMouseMotionListener(this);
        view.getSpaguettiLabel().addMouseListener(this);
        view.getSpaguettiLabel().addMouseMotionListener(this);
        view.getOatsLabel().addMouseListener(this);
        view.getOatsLabel().addMouseMotionListener(this);
        
        view.getCookButton().addActionListener(this); // accion del boton 
        view.getRestarButton().addActionListener(this);
        
       
    }

   
    
    
    
    
    // los siguientes metodos sirven para controlar la interfaz, y son abstractos de la interfaz ActionListener,MouseListener,MouseMotioListener
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == view.getRestarButton()){
           // si estoy en el restarButton 
          // reinicion todos los valores 
           
            model.setCupsOfWater(0);
               for (FoodModel f: model.getFoodToCook()){
               f.setCups(0);
               }
               
            view.getCantidadAgua().setText(""+model.getCupsOfWater());
           
       }
       else if (ae.getSource() == view.getCookButton()){
           double cantidadAgua = 0 ;
           
           for (FoodModel f: model.getFoodToCook()){
               cantidadAgua += f.copasDeAguaIdeales();
           }
           
           // ya tengo las copas de agua ideales las verifico con las que tengo aqui y hago algo 
           
           if (cantidadAgua == model.getCupsOfWater()){
               JOptionPane.showMessageDialog(view, "Se ha cocinado con exito ");
               model.setCupsOfWater(0);
               for (FoodModel f: model.getFoodToCook()){
               f.setCups(0);
               
           }
               view.getCantidadAgua().setText(""+model.getCupsOfWater());
           }
               
           else {
               JOptionPane.showMessageDialog(view, "No coincide el agua exactamente ");
           }
               
               
           
       }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
         if (!(me.getSource() == view.getLabelOlla())){ // si no es la olla voy a poner que si quiere cocinar la comida  
       
        wannaCook = true;
          }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       view.setCursor(null); // esto lo hago siempre 
       JLabel labelReleased = null;
         if (!(me.getSource() == view.getLabelOlla())){ //
        
    
        
                labelReleased = (JLabel) me.getSource();
        if (confirm == true && wannaCook == true)
           
            JOptionPane.showMessageDialog(view, "Ingreso una porcion de "+labelReleased.getText(), "Ingrediente Agregado ",1, labelReleased.getIcon());
       
        // si son las aguas 
        if (labelReleased == view.getCupWaterLabel())
            model.setCupsOfWater(model.getCupsOfWater()+1);
        else if (labelReleased == view.getWaterLabel())
            model.setCupsOfWater(model.getCupsOfWater()+0.5);
        else {
            // si son los demas label que serian los demas ingredientes 
            // primero voy a obtener el index de la comida seleccionada en base al titulo del label 
            
            int index = 0;
             for (index = 0; index < model.getFoodToCook().length;index++){
           
             if (labelReleased.getText().equalsIgnoreCase(model.getFoodToCook()[index].getName()))
                 break;
        }
             
            model.getFoodToCook()[index].setCups(model.getFoodToCook()[index].getCups()+1);
        
        
           
        
        }   
        
        
        
        
      
        
         }
       // al final las dos variables se reinician 
        wannaCook = false;
        confirm = false;
        view.getCantidadAgua().setText(""+model.getCupsOfWater());
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == view.getLabelOlla()){
            confirm = true; // quiere decir que confirma cocinar la comida 
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseDragged(MouseEvent me) {
         if (!(me.getSource() == view.getLabelOlla())){ // si no es la olla cambio el icono 
                JLabel labelDragged = (JLabel) me.getSource(); // el label donde estoy 
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                ImageIcon ii = (ImageIcon) labelDragged.getIcon();
                Image imagen = ii.getImage();
                
              
                Point hotSpot = new Point(0,0);  
                Cursor cursor = tk.createCustomCursor(imagen, hotSpot, "Food");
                view.setCursor(cursor); // cambio el cursor 
           }        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }
    
   
    
    
}
