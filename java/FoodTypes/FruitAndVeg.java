package FoodTypes;


public class FruitAndVeg extends FoodType {

    private double sugarContent;

    public FruitAndVeg(double price, double sugarContent) {
        super(2, "300");
        this.sugarContent = sugarContent;
    }



    @Override
    public String isFoodHealthy() {
        return "Yes!";
    }

    public String addSeedless(){
        return "No!";
    }


}
