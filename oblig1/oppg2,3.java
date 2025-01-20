
public class Planet {
    private String name;
    private double radius;
    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}

# Oppgave2_3 Class

public class Oppgave2_3 {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 3389.5, 6.39E23);
        System.out.println("Planeten " + mars.getName() + " har en radius på " + mars.getRadius() + " km og en masse på " + mars.getMass() + " kg");
    }
}
