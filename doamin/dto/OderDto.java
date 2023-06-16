package doamin.dto;

import java.time.LocalDate;

public class OderDto {
    private int order_seq;
    private LocalDate order_date;
    private int total_price;
    private int user_seq;
    private int product_seq;

    public OderDto(int order_seq, LocalDate order_date, int total_price, int user_seq, int product_seq) {
        this.order_seq = order_seq;
        this.order_date = order_date;
        this.total_price = total_price;
        this.user_seq = user_seq;
        this.product_seq = product_seq;
    }

    public int getOrder_seq() {
        return order_seq;
    }

    public void setOrder_seq(int order_seq) {
        this.order_seq = order_seq;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public int getProduct_seq() {
        return product_seq;
    }

    public void setProduct_seq(int product_seq) {
        this.product_seq = product_seq;
    }
}
