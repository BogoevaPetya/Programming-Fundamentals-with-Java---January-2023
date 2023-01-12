package Fundamentals.ObjectAndClasses.Exercise.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", getType().toUpperCase().charAt(0) + getType().substring(1), getModel(), getColor(), getHorsepower());
    }

    //getType().toUpperCase().charAt(0) + getType().substring(1) - така правим първата буква да се отпечатва главна
    // и после до нея да се конкатенира всичко останало (от индекс 1 до края на думата)
}
