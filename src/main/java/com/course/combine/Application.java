package com.course.combine;

public class Application {
    public static void main(String[] args) {
        // 1. Khởi tạo Context xử lý đơn hàng
        OrderProcessor processor = new OrderProcessor(500000.0);

        // 2. Client chỉ cần biết định danh (ví dụ: lấy từ Frontend truyền xuống)
        String userChoice = "ZALOPAY";

        // 3. Gọi Factory để lấy Chiến lược tương ứng
        PaymentStrategy strategy = PaymentStrategyFactory.getPaymentStrategy(userChoice);

        // 4. Truyền Chiến lược vào Context và thực thi
        processor.setStrategy(strategy);
        processor.processPayment();
    }
}