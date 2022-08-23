package FoodTypes;

import Interfaces.ICarb;
import Interfaces.IDairy;
import Interfaces.IFruitAndVeg;


import java.util.ArrayList;

public abstract class FoodType {

    private ArrayList<ICarb> carbs;
    private ArrayList<IDairy> dairies;
    private ArrayList<IFruitAndVeg> fruitAndVeg;

    public FoodType(String name){
        this.name = name;
        this.carbs = new ArrayList<>();
        this.dairies = new ArrayList<>();
        this.fruitAndVeg = new ArrayList<>();

    }

    private String name;
    private double price;
    private String colour;
    private String origin;
    private String KeptInKitchen;
    private String isFoodHealthy;
    private int calories;


// Constructor
    public FoodType(int i, String price){
        this.price = 2;
    }

    public FoodType(int i) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }



    public double getPrice(){
        return price = 2;
    }

    public int setPrice(int price){
        this.price = 2;
        return price;
    }



    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }



    public String getOrigin(){
        return origin;
    }

    public void setOrigin(String origin){
        this.origin = origin;

    }



    public String getKeptInKitchen(){
        return KeptInKitchen;
    }

    public void setKeptInKitchen(String keptInKitchen){
        this.KeptInKitchen = keptInKitchen;
    }



    public String isFoodHealthy(){
        return ("Yes!");
    }

    public int calories(){
        return calories;
    }

    public String addSeedless() {
        return ("No!");
    }

    public String colour(){
        return ("Im " + colour + "!");
    }

    public String origin(){
        return ("Im from " + origin + "!");
    }
    public String organic(){
        return "Is this organic?";
    }


}
