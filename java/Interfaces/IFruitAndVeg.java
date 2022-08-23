package Interfaces;

public interface IFruitAndVeg {


    public class FruitAndVeg implements IFruitAndVeg{

        private String name;

        private String fruitAndVeg(int price){
            return String.format( this.name, " - I cost ", price);
        }

    }







}
