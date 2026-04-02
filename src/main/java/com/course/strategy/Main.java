package com.course.strategy;

public class Main {
  public static void main(String[] args) {
    PaymentContext cart = new PaymentContext();
    double orderTotal = 1500000; // 1.500.000 VNĐ

    // Người dùng chọn thanh toán bằng ZaloPay
    System.out.println(">> Khách hàng chọn ZaloPay:");
    cart.setPaymentStrategy(new ZalopayPayment());
    cart.executeCheckout(orderTotal);

    // Người dùng đổi ý, chuyển sang dùng MoMo ngay lúc chương trình đang chạy
    System.out.println(">> Khách hàng đổi ý sang MoMo:");
    cart.setPaymentStrategy(new MomoPayment());
    cart.executeCheckout(orderTotal);
  }
}
