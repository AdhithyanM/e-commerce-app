package com.adhithyan.ecommerce.orderline;

import com.adhithyan.ecommerce.order.Order;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class OrderLine {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private Integer productId;
    private double quantity;
}
