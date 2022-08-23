package FoodTypes;

import Interfaces.ICarb;


public abstract class Carb implements ICarb {

    private String name;

    public Carb(String name){
        this.name = name;
    }

    public String carb(int fibre){
        return String.format( "My ",this.name , " has ", fibre, " amount of fibre");
    }
}
