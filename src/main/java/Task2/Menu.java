package Task2;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {

            List<Pizza> menu = new ArrayList<>();
            menu.add(new Pizza("Margherita", new Ingredient[] {Ingredient.MOZARELLA, Ingredient.CEBULA}, 200, true));
            menu.add(new Pizza("Salami", new Ingredient[] {Ingredient.MOZARELLA,Ingredient.CEBULA, Ingredient.SALAMI}, 100, false));
            menu.add(new Pizza("Vegetarian", new Ingredient[] {Ingredient.MOZARELLA,Ingredient.CEBULA, Ingredient.SELER, Ingredient.POMIDOR, Ingredient.PAPRYKA}, 450, true));

        System.out.println(PizzaFilter.findVegetarian(menu));
        System.out.println(PizzaFilter.findWithSeler(menu));
        System.out.println(PizzaFilter.findWithPomidorAndPapryka(menu));
        System.out.println(PizzaFilter.findWithMozarella(menu));
        System.out.println(PizzaFilter.findMaxCall(menu));
        System.out.println(PizzaFilter.findMinCall(menu));

        }
}
