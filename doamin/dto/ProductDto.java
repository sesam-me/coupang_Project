package doamin.dto;

public class ProductDto {
    private int product_seq;
    private String product_name;
    private String product_detail;
    private int product_price;
    private int product_quantity;

    public ProductDto(int product_seq, String product_name, String product_detail, int product_price, int product_quantity) {
        this.product_seq = product_seq;
        this.product_name = product_name;
        this.product_detail = product_detail;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
    }

    public int getProduct_seq() {
        return product_seq;
    }

    public void setProduct_seq(int product_seq) {
        this.product_seq = product_seq;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_detail() {
        return product_detail;
    }

    public void setProduct_detail(String product_detail) {
        this.product_detail = product_detail;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }
}
