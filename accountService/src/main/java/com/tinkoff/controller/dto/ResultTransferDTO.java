package com.tinkoff.controller.dto;

import java.math.BigDecimal;

public class ResultTransferDTO {

    private BigDecimal firstBill;
    private BigDecimal secondBill;

    public ResultTransferDTO(BigDecimal firstBill, BigDecimal secondBill) {
        this.firstBill = firstBill;
        this.secondBill = secondBill;
    }

    public BigDecimal getFirstBill() {
        return firstBill;
    }

    public BigDecimal getSecondBill() {
        return secondBill;
    }
}
