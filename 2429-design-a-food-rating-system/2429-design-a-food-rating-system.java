class FoodRatings {

    Map<String, String> foodToCuisine = new HashMap<>();
    Map<String, Integer> foodToRating = new HashMap<>();
    Map<String, TreeSet<String>> cuisineToFood = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToFood.computeIfAbsent(cuisine, k -> new TreeSet<>(
                    (a, b) -> {
                        int compare = Integer.compare(foodToRating.get(b), foodToRating.get(a));
                        if (compare == 0)
                            return a.compareTo(b);
                        return compare;
                    }));
            cuisineToFood.get(cuisine).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);

        cuisineToFood.get(cuisine).remove(food);

        foodToRating.put(food, newRating);

        cuisineToFood.get(cuisine).add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineToFood.get(cuisine).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */