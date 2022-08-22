package FoodTypes;

public abstract class FoodType {

    private String name;
    private double price;
    private String colour;
    private String origin;
    private String KeptInKitchen;
    private String isFoodHealthy;
    private int calories;


// Constructor
    public FoodType(String price){
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
        return ("I'm a " + this.name + "lets see if i'm healthy!");
    }

    public int calories(){
        return calories;
    }

    public String addSeedless() {
        return addSeedless();
    }
}
