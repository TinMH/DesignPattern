package com.course.combine;

public class PaymentStrategyFactory {
    public static PaymentStrategy getPaymentStrategy(String paymentType) {
        if (paymentType.equalsIgnoreCase("MOMO")) {
            return new MomoPayment("0987654321", 100000.0);

        } else if (paymentType.equalsIgnoreCase("ZALOPAY")) {
            return new ZalopayPayment("0912345678", "VCB12345");

        } else if (paymentType.equalsIgnoreCase("CREDIT_CARD")) {
            return new CreditCardPayment("4123-5678-9012-3456", 123, "12/28");
        }

        throw new IllegalArgumentException("Phương thức thanh toán không được hỗ trợ!");
    }
}
