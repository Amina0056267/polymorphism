package Interfaces;

public interface IDairy {


    public class Dairy implements IDairy{

        private String name;

        public Dairy(String name){

            this.name = name;
        }

        public String dairy(String matured) {
            return String.format(matured, this.name);
        }


    }






}
