package com.adhithyan.ecommerce.order;

import com.adhithyan.ecommerce.customer.CustomerResponse;
import com.adhithyan.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
