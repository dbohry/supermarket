package com.lhamacorp.supermarket.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "list")
public class SupermarketList {

    @Id
    private String id;
    private LocalDate date;
    private List<Product> products;

    public SupermarketList() {
    }

    public SupermarketList(String id, LocalDate date, List<Product> products) {
        this.id = id;
        this.date = date;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SupermarketList that = (SupermarketList) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(date, that.date)
                .append(products, that.products)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(date)
                .append(products)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("date", date)
                .append("products", products)
                .toString();
    }
}
