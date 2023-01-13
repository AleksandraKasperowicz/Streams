package Task2;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {

            List<Pizza> menu = new ArrayList<>();
            menu.add(new Pizza("Margherita", new Ingredient[] {Ingredient.MOZARELLA, Ingredient.CEBULA}, 200, true));
            menu.add(new Pizza("Salami", new Ingredient[] {Ingredient.MOZARELLA,Ingredient.CEBULA, Ingredient.SALAMI}, 100, false));
            menu.add(new Pizza("Vegetarian", new Ingredient[] {Ingredient.MOZARELLA,Ingredient.CEBULA, Ingredient.SELER, Ingredient.POMIDOR, Ingredient.PAPRYKA}, 450, true));

            menu.stream()
                    .filter(Pizza::isVegetarian)
                    .forEach(System.out::println);

            System.out.println();
            menu.stream()
                    .filter(pizza -> pizza.getIngredients().contains(Ingredient.SELER))
                    .forEach(System.out::println);

            System.out.println();
            menu.stream()
                    .filter(Pizza::isVegetarian)
                    .filter(pizza -> pizza.getIngredients().contains(Ingredient.POMIDOR) || pizza.getIngredients().contains(Ingredient.PAPRYKA) )
                    .forEach(System.out::println);

            System.out.println();
            System.out.println(menu.stream()
                    .allMatch(pizza -> pizza.getIngredients().contains(Ingredient.MOZARELLA))
                    ? "Wszystkie zawierają mozarellę" : "Nie wszystkie zawierają mozarellę");

            System.out.println("Max calories:");
            System.out.println(menu.stream()
                    .max((pizza1, pizza2) -> Integer.compare(pizza1.getCalories(), pizza2.getCalories())).get());

            System.out.println();
            System.out.println("Min calories:");
            System.out.println(menu.stream()
                    .min((pizza1, pizza2) -> Integer.compare(pizza1.getCalories(), pizza2.getCalories())).get());

        }
}
