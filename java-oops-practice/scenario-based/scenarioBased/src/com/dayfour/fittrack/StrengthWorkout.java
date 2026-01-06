package com.dayfour.fittrack;

class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    // polymorphic calorie calculation
    public void calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.05;
    }
}
