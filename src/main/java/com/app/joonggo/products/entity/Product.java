package com.app.joonggo.products.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "product_id", nullable = false)
    private String id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "product_status", nullable = false)
    private String productStatus;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "product_title", nullable = false)
    private String productTitle;

    @Column(name = "product_desc", nullable = false)
    private String productDesc;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "reg_date", nullable = false)
    private LocalDateTime regDate;

    @Column(name = "mod_date")
    private LocalDateTime modDate;

}