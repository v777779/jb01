package ch21.ex26.exercise.rest2;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MealPack {
    public Meal meal;
    public MealStatus stat = MealStatus.EMPTY;

    synchronized void setMeal(Meal meal) {
        this.meal = meal;
    }

    synchronized void setStat(MealStatus stat) {
        this.stat = stat;
    }

    synchronized Meal getMeal() {
        return meal;
    }

    synchronized MealStatus getStat() {
        return stat;
    }



}
