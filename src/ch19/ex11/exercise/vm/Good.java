package ch19.ex11.exercise.vm;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class Good {
    private String name;
    private int cost;
    private Category cat;

    public Good(String name, String cost, String cat) {
        this.name = name;
        this.cost = Integer.valueOf(cost);
        this.cat = Category.valueOf(cat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return name + " : "+ cost;
    }
}
