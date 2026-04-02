package com.course.strategy;

public interface PaymentStrategy {
    void pay(double amount);
    boolean validatePaymentInfo();
    double getAvailableAmount();
}
