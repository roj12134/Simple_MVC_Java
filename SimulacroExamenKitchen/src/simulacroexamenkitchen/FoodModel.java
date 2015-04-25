/*
 * FoodModel.java
 * 24 Octubre 2012
 * Giovanni Rojas Mazariegos 12134
 * 
 */
package simulacroexamenkitchen;

/**
 *
 * @author Esta clase es el modelo de la comida que tiene cada atributo de la misma comida. 
 */
public class FoodModel {
    
    private String name;
    private double waterPerCup;
    
    // esto no estaba en el uml pero es nesesario 
    
    private double cups; // la cantidad de copas que tiene de esta comida 

    public FoodModel(String name, double waterPerCup) {
        this.name = name;
        this.waterPerCup = waterPerCup;
        //inicialmente la cantidad de cupas que tiene este material es 0
        cups = 0;
    }

    
    // set y gets 
    
    public double getCups() {
        return cups;
    }

    public void setCups(double cups) {
        this.cups = cups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWaterPerCup() {
        return waterPerCup;
    }

    public void setWaterPerCup(double waterPerCup) {
        this.waterPerCup = waterPerCup;
    }
    
    
    // este metodo tampoco se encontraba en el uml pero era sumamente necesario para ver si se puede o no 
    
    public double copasDeAguaIdeales (){
        return cups*waterPerCup;
    }
    
    
    
    
}
