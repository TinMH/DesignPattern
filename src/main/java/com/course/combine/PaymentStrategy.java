package com.course.combine;

public interface PaymentStrategy {
    void pay(double amount);
    boolean validatePaymentInfo();
    double getAvailableAmount();
}
