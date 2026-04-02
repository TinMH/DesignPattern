package com.course.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private int cvc;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, int cvc, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND thông qua Thẻ Tín Dụng (" + cardNumber + ").");
    }

    @Override
    public boolean validatePaymentInfo() {
        System.out.println("Đang kết nối cổng thanh toán quốc tế để xác thực thẻ...");
        return true;
    }

    @Override
    public double getAvailableAmount() {
        return 20000000.0; // Giả lập hạn mức thẻ tín dụng
    }
}