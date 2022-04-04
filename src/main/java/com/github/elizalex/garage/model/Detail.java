package com.github.elizalex.garage.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "detail")
public class Detail {
    private int id;
    private int price;
    private int warranty;
    private String name;
    private String madeIn;

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
