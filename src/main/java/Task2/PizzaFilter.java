package Task2;

import java.util.List;
import java.util.stream.Collectors;

public class PizzaFilter {

    public static List<Pizza> findVegetarian(List<Pizza> menu) {
        return menu
                .stream()
                .filter(Pizza::isVegetarian)
                .collect(Collectors.toList());
    }

    public static List<Pizza> findWithSeler(List<Pizza> menu) {
        return menu
                .stream()
                .filter(pizza -> pizza.getIngredients().contains(Ingredient.SELER))
                .collect(Collectors.toList());
    }

    public static List<Pizza> findWithPomidorAndPapryka(List<Pizza> menu) {
        return menu
                .stream()
                .filter(Pizza::isVegetarian)
                .filter(pizza -> pizza.getIngredients().contains(Ingredient.POMIDOR) || pizza.getIngredients().contains(Ingredient.PAPRYKA))
                .collect(Collectors.toList());
    }

    public static String findWithMozarella(List<Pizza> menu) {
        return menu
                .stream()
                .allMatch(pizza -> pizza.getIngredients().contains(Ingredient.MOZARELLA))
                ? "Wszystkie zawierają mozarellę" : "Nie wszystkie zawierają mozarellę";
    }

    public static Pizza findMaxCall(List<Pizza> menu) {
        return menu
                .stream()
                .max((pizza1, pizza2) -> Integer.compare(pizza1.getCalories(), pizza2.getCalories()))
                .get();
    }

    public static Pizza findMinCall(List<Pizza> menu) {
        return menu
                .stream()
                .min((pizza1, pizza2) -> Integer.compare(pizza1.getCalories(), pizza2.getCalories()))
                .get();
    }
}
