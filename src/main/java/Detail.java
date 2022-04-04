/**
 * Деталь. Поля - id, стоимость(руб), наименование, страна производитель, гарантия(мес)
 */
public class Detail {
    private int id;
    private int price;
    private int warranty;
    private String name;
    private String madeIn;

    public Detail(int id, String name, String madeIn, int price, int warranty) {
        this.id = id;
        this.name = name;
        this.madeIn = madeIn;
        this.price = price;
        this.warranty = warranty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "Detail{"
                + "id=" + id
                + ", price=" + price
                + ", warranty=" + warranty
                + ", name='" + name + '\''
                + ", madeIn='" + madeIn + '\''
                + '}';
    }
}
