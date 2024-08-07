package de.telran.shop.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "OrderItems")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderItemID")
    private long orderItemID;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "PriceAtPurchase")
    private double priceAtPurchase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID")
    private Orders order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductID")
    private Products product;
}
