/*
 * KitchenModel.java
 * 24 Octubre 2012
 * Giovanni Rojas Mazariegos 12134
 * 
 */
package simulacroexamenkitchen;

/**
 *
 * @author Giovanni Rojas Mazariegos
 * 
 * Esta clase maneja todos los datos de KitchenModel
 */
public class KitchenModel {
    
    private double cupsOfWater; // las copas de agua que hay dentro de la olla 
    private FoodModel [] foodToCook = new FoodModel [4]; // este es el arreglo de la comidas que hay posibles 

    public KitchenModel(FoodModel [] food) {
        this.foodToCook =food;
        cupsOfWater = 0;
    }

    // get y set de las dos variables. 
    public double getCupsOfWater() {
        return cupsOfWater;
    }

    public void setCupsOfWater(double cupsOfWater) {
        this.cupsOfWater = cupsOfWater;
    }

    public FoodModel[] getFoodToCook() {
        return foodToCook;
    }

    public void setFoodToCook(FoodModel[] foodToCook) {
        this.foodToCook = foodToCook;
    }
    /*
     * Lo que hara este metodo es que verificara si se puede o no cocinar 
     * en base a todas las condiciones del programa tales como 
     * la del agua segun el tipo de comida, que solo sean cuatro cupas de agua etc. 
     */
    public boolean ableToCook(){
        return false;
    }
    
    
    
    
    
}
