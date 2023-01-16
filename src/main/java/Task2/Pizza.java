package Task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pizza {
        private final String name;
        private final Set<Ingredient> ingredients;
        private final int calories;
        private final boolean vegetarian;

        public  Pizza(String name, Ingredient[] ingredients, int calories, boolean vegetarian) {
            this.name = name;
            this.ingredients = new HashSet<>(Arrays.stream(ingredients).collect(Collectors.toSet()));
            this.calories = calories;
            this.vegetarian     = vegetarian;
        }

        public String getName() {
            return name;
        }

        public Set<Ingredient> getIngredients() {
            return ingredients;
        }

        public int getCalories() {
            return calories;
        }

        public boolean isVegetarian() {
            return vegetarian;
        }

        @Override
        public String toString() {
            return this.getName() + " " + this.getCalories() + " " + (this.isVegetarian() ? "Vegetarian" : "No Vegetarian");
        }
    }
