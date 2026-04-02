package com.course.strategy;

public class MomoPayment implements PaymentStrategy {
    private String phoneNumber;
    private double accountBalance;

    public MomoPayment(String phoneNumber, double accountBalance) {
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Tiến hành trừ " + amount + " VND từ ví Momo (SĐT: " + phoneNumber + ").");
    }

    @Override
    public boolean validatePaymentInfo() {
        System.out.println("Đang xác thực thông tin ví Momo qua API...");
        return true;
    }

    @Override
    public double getAvailableAmount() {
        return accountBalance; // Trả về số dư thực tế của ví
    }
}