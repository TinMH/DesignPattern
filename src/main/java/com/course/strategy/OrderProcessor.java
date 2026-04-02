package com.course.strategy;

public class OrderProcessor {
    private PaymentStrategy currentStrategy;
    private double cartTotal;

    public OrderProcessor(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    // Cho phép thay đổi chiến lược thanh toán tại Runtime
    public void setStrategy(PaymentStrategy strategy) {
        this.currentStrategy = strategy;
    }

    // Hàm xử lý chung, không chứa lệnh if-else kiểm tra phương thức thanh toán
    public void processPayment() {
        if (currentStrategy == null) {
            System.out.println("Lỗi: Vui lòng chọn một phương thức thanh toán trước!");
            return;
        }

        // Ủy quyền gọi hàm cho Strategy
        if (currentStrategy.validatePaymentInfo()) {
            if (currentStrategy.getAvailableAmount() >= cartTotal) {
                currentStrategy.pay(cartTotal);
                System.out.println("=> Giao dịch thành công!\n");
            } else {
                System.out.println("=> Giao dịch thất bại: Số dư/Hạn mức không đủ.\n");
            }
        } else {
            System.out.println("=> Giao dịch thất bại: Thông tin thanh toán không hợp lệ.\n");
        }
    }
}