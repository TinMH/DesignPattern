package com.course.strategy;

public class Application {
    public static void main(String[] args) {
        // Khách hàng có giỏ hàng trị giá 500,000 VND
        OrderProcessor processor = new OrderProcessor(500000.0);

        // Kịch bản 1: Khách chọn thanh toán bằng ZaloPay
        System.out.println("--- Kịch bản 1: Thanh toán ZaloPay ---");
        processor.setStrategy(new ZalopayPayment("0912345678", "VCB12345"));
        processor.processPayment();

        // Kịch bản 2: Khách đổi ý, muốn thanh toán bằng Thẻ Tín Dụng
        // Chỉ cần "cắm" Strategy mới vào, Context hoàn toàn không phải sửa đổi code
        System.out.println("--- Kịch bản 2: Chuyển sang Thẻ Tín Dụng ---");
        processor.setStrategy(new CreditCardPayment("4123-5678-9012-3456", 123, "12/28"));
        processor.processPayment();

        // Kịch bản 3: Khách thanh toán Momo nhưng không đủ tiền
        System.out.println("--- Kịch bản 3: Thanh toán Momo (Không đủ số dư) ---");
        OrderProcessor processor2 = new OrderProcessor(2000000.0); // Đơn hàng 2 triệu
        processor2.setStrategy(new MomoPayment("0987654321", 100000.0)); // Ví chỉ còn 100k
        processor2.processPayment();
    }
}