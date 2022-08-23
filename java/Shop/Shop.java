package Shop;

import Interfaces.ICarb;
import Interfaces.IDairy;
import Interfaces.IFruitAndVeg;


public class Shop implements ICarb, IDairy, IFruitAndVeg {

    private String name;

    public Shop(String name){
        this.name = name;

    }

    public String carb(int fibre){
        return String.format( "I now have both fruits and veg with ", fibre, " % of fibre");
    }

    public String dairy(String matured){
        return String.format(" I now have both carbs and cheese that is ", matured);

    }

    public String fruitAndVeg(double sugarContent){
        return String.format(" I now have both dairy with ", sugarContent , " % of sugar.");
    }


    @Override
    public String Carb(int fiber) {
        return null;
    }
}
