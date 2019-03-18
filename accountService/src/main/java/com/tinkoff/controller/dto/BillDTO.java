package com.tinkoff.controller.dto;

import java.math.BigDecimal;

public class BillDTO {

    private Long id;

    private BigDecimal sum;

    private Long customerID;

    public BillDTO(Long id, BigDecimal sum, Long customerID) {
        this.id = id;
        this.sum = sum;
        this.customerID = customerID;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}
