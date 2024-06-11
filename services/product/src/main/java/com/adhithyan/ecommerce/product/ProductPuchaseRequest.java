package com.adhithyan.ecommerce.product;

import jakarta.validation.constraints.NotNull;

public record ProductPuchaseRequest(
        @NotNull(message = "Product is mandatory")
        Integer productId,
        @NotNull(message = "Quantity is mandatory")
        double quantity
) {
}
