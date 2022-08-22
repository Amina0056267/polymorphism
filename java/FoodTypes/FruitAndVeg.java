package FoodTypes;

public class FruitAndVeg extends FoodType {

    private double sugarContent;

    public FruitAndVeg(String price, double sugarContent) {
        super(price);
        this.sugarContent = sugarContent;
    }


    // Needs an IF / else statement to print both Y and N
    @Override
    public String isFoodHealthy() {
        return "Yes!";
    }

    public String addSeedless(){
        return "No!";
    }

}
