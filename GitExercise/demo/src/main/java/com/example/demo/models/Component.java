package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
@Entity(name="inventory")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String component_id;
    private String category;
    private String name;
    private String brand;
    private String product_line;
    private String number_of_cores;
    private String processor_clock_speed;
    private String graphic_clock_speed;
    private String dimension;
    private String resolution;
    private String color;
    private String interface_type;
    private int price;
    private int quantity;

    public String getComponent_id() {
        return component_id;
    }

    public void setComponent_id(String component_id) {
        this.component_id = component_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct_line() {
        return product_line;
    }

    public void setProduct_line(String product_line) {
        this.product_line = product_line;
    }

    public String getNumber_of_cores() {
        return number_of_cores;
    }

    public void setNumber_of_cores(String number_of_cores) {
        this.number_of_cores = number_of_cores;
    }

    public String getProcessor_clock_speed() {
        return processor_clock_speed;
    }

    public void setProcessor_clock_speed(String processor_clock_speed) {
        this.processor_clock_speed = processor_clock_speed;
    }

    public String getGraphic_clock_speed() {
        return graphic_clock_speed;
    }

    public void setGraphic_clock_speed(String graphic_clock_speed) {
        this.graphic_clock_speed = graphic_clock_speed;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInterface() {
        return interface_type;
    }

    public void setInterface(String anInterface) {
        interface_type = anInterface;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Component() {}


}
