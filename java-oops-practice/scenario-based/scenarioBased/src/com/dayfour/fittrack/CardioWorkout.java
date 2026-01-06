package com.dayfour.fittrack;

class CardioWorkout extends Workout {

    CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    // polymorphic calorie calculation
    public void calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.08;
    }
}
