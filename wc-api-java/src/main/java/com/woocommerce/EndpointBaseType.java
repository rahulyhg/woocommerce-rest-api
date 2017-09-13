package com.woocommerce;

import com.woocommerce.beans.coupon.WooCoupon;
import com.woocommerce.beans.customer.WooCustomer;
import com.woocommerce.beans.order.WooOrder;
import com.woocommerce.beans.product.WooProduct;
import com.woocommerce.beans.shipping.WooShippingClasses;

/**
 * Enum with basic WooCommerce endpoints
 */
public enum EndpointBaseType {

    COUPONS("coupons", WooCoupon.class),
    CUSTOMERS("customers", WooCustomer.class),
    ORDERS("orders", WooOrder.class),
    PRODUCTS("products", WooProduct.class),
    PRODUCTS_ATTRIBUTES("products/attributes", null),
    PRODUCTS_CATEGORIES("products/categories", null),
    PRODUCTS_SHIPPING_CLASSES("products/shipping_classes", WooShippingClasses.class),
    PRODUCTS_TAGS("products/tags", null),
    REPORTS("reports", null),
    REPORTS_SALES("reports/sales", null),
    REPORTS_TOP_SELLERS("reports/top_sellers", null),
    TAXES("taxes", null),
    TAXES_CLASSES("taxes/classes", null),
    WEBHOOKS("webhooks", null);

    private String value;
    private Class<?> clazz;

    EndpointBaseType(String value, Class<?> clazz) {
        this.value = value;
        this.clazz = clazz;
    }

    public String getValue() {
        return value;
    }
    
    public Class<?> getClazz() {
        return clazz;
    }
}
