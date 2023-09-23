public class Notebook {
    private String brand;
    private String model;
    private String color;
    private String operatingSystem;
    private int ram;
    private int storage;
    private double price;

    public Notebook(String brand, String model, String color, String operatingSystem, int ram, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    public String toString() {
        return "Notebook{" +
                "Производитель: '" + brand + '\'' +
                ", Модель: '" + model + '\'' +
                ", Цвет: '" + color + '\'' +
                ", OS: '" + operatingSystem + '\'' +
                ", Память: " + ram +
                ", Диск: " + storage +
                ", Цена: " + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }
}