package Chap2_GenerateObjectAndDestory.item2.hierarchicalbuilder;

public class PizzaClient {

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.ONION)
                .sauceInside()
                .build();
    }
}
