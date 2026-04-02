package com.course.factorymethod;

public class MomoPayment implements Payment {
    private String phoneNumber;
    private double accountBalance;

    public MomoPayment(String phoneNumber, double accountBalance) {
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public void process() {
        System.out.println("Xử lý thanh toán MoMo cho SĐT: " + phoneNumber);
    }
}