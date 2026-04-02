package com.course.combine;

public class ZalopayPayment implements PaymentStrategy {
    private String phoneNumber;
    private String linkedAccount;

    public ZalopayPayment(String phoneNumber, String linkedAccount) {
        this.phoneNumber = phoneNumber;
        this.linkedAccount = linkedAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Tiến hành trừ " + amount + " VND từ tài khoản ZaloPay (SĐT: " + phoneNumber + ").");
    }

    @Override
    public boolean validatePaymentInfo() {
        System.out.println("Đang kiểm tra tính hợp lệ của tài khoản ZaloPay...");
        return true;
    }

    @Override
    public double getAvailableAmount() {
        return 5000000.0; // Giả lập số dư khả dụng
    }
}
