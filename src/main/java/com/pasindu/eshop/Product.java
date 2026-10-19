package com.pasindu.eshop;
import jakarta.persistence.*;
@Entity
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private Double price;
    private String image;
    private String category;
    
    public Product() {}
    public Product(String name, Double price, String image, String category) {
        this.name=name; this.price=price; this.image=image; this.category=category;
    }
    // Getters Setters
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getName(){return name;} public void setName(String n){name=n;}
    public Double getPrice(){return price;} public void setPrice(Double p){price=p;}
    public String getImage(){return image;} public void setImage(String i){image=i;}
    public String getCategory(){return category;} public void setCategory(String c){category=c;}
}
