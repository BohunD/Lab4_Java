/**
 * The Cosmetics class represents a cosmetic product with various attributes.
 */
public class Cosmetics {

    /**
     * The name of the cosmetic product.
     */
    private String name;

    /**
     * The brand of the cosmetic product.
     */
    private String brand;

    /**
     * The price of the cosmetic product.
     */
    private double price;

    /**
     * The country where the cosmetic product is manufactured.
     */
    private String manufacturerCountry;

    /**
     * The weight of the cosmetic product.
     */
    private int weight;

    /**
     * The category to which the cosmetic product belongs.
     */
    private String category;

    /**
     * Constructs a new Cosmetics object with the specified attributes.
     * @param name                The name of the cosmetic product.
     * @param brand               The brand of the cosmetic product.
     * @param price               The price of the cosmetic product.
     * @param manufacturerCountry The country where the cosmetic product is manufactured.
     * @param weight              The weight of the cosmetic product.
     * @param category            The category to which the cosmetic product belongs.
     */
    public Cosmetics(String name, String brand, double price, String manufacturerCountry, int weight, String category) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.manufacturerCountry = manufacturerCountry;
        this.weight = weight;
        this.category = category;
    }

    /**
     * Gets the name of the cosmetic product.
     * @return The name of the cosmetic product.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the cosmetic product.
     * @param name The new name of the cosmetic product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the brand of the cosmetic product.
     * @return The brand of the cosmetic product.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the cosmetic product.
     * @param brand The new brand of the cosmetic product.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets the price of the cosmetic product.
     * @return The price of the cosmetic product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the cosmetic product.
     * @param price The new price of the cosmetic product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the country where the cosmetic product is manufactured.
     * @return The country where the cosmetic product is manufactured.
     */
    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    /**
     * Sets the country where the cosmetic product is manufactured.
     * @param manufacturerCountry The new manufacturing country of the cosmetic product.
     */
    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    /**
     * Gets the weight of the cosmetic product.
     * @return The weight of the cosmetic product.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the cosmetic product.
     * @param weight The new weight of the cosmetic product.
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets the category of the cosmetic product.
     * @return The category of the cosmetic product.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the cosmetic product.
     * @param category The new category of the cosmetic product.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Provides a string representation of the Cosmetics object.
     * @return A string representation of the Cosmetics object.
     */
    @Override
    public String toString() {
        return "Cosmetics{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", weight=" + weight +
                ", category='" + category + '\'' +
                '}';
    }
}
