package org.example.model;



import lombok.Data;

import javax.persistence.*;

/**
 * @author game-netease
 * @date 2024/5/27
 */
@Data
@Table(name = "product_inventory")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private int price;
}
