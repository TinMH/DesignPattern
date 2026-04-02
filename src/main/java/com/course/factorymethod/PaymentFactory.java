package com.course.factorymethod;

public class PaymentFactory {
    public static Payment createPayment(String paymentType) {
        if (paymentType.equalsIgnoreCase("MOMO")) {
            // Giả lập việc Factory tự đi lấy cấu hình (DB/Config) để nạp tham số
            return new MomoPayment("0987654321", 100000.0);

        } else if (paymentType.equalsIgnoreCase("ZALOPAY")) {
            return new ZalopayPayment("0912345678", "VCB12345");

        }
        throw new IllegalArgumentException("Loại thanh toán không hợp lệ!");
    }
}
