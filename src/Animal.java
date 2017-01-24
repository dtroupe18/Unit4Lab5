/**
 * Created by Dave on 1/24/17.
 */
public class Animal {
    private String name;
    private int topSpeed;

    public String getName() {
        return name;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTopSpeed(int topSpeed) throws IndexOutOfBoundsException {
        if (topSpeed < 0 || topSpeed > 70) {
            throw new IndexOutOfBoundsException();
        }
        this.topSpeed = topSpeed;
    }
    public Animal(String name, int topSpeed) {
        setName(name);
        setTopSpeed(topSpeed);
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        Animal other = (Animal) obj;
        if (-2 <= (getTopSpeed() - other.getTopSpeed()) && 2 >= (getTopSpeed() - other.getTopSpeed())) {
            equals = true;
        }
        return equals;
    }
    public String toString() {
        return "Name: " + getName() + "\t\t" + "Top Speed: " + getTopSpeed();
    }
}
