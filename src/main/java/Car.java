
/**
 * Машина. Поля - id, марка, цвет, год выпуска, пробег(км).
 */
public class Car {
    private int id;
    private int year;
    private int mileage;
    private String brand;
    private String color;

    public Car(int id, String brand, String color, int year,  int mileage) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{"
                + "id=" + id
                + ", year=" + year
                + ", mileage=" + mileage
                + ", brand='" + brand + '\''
                + ", color='" + color + '\''
                + '}';
    }
}
