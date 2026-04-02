package com.course.strategy;

public class PaymentContext {
  private PaymentStrategy strategy;
  public void setPaymentStrategy(PaymentStrategy strategy) {
    this.strategy = strategy;
  }

  // Thực thi thanh toán
  public void executeCheckout(double amount) {
    if (strategy == null) {
      System.out.println("[Hệ thống] Vui lòng chọn phương thức thanh toán trước!\n");
      return;
    }
    System.out.println("--- BẮT ĐẦU QUY TRÌNH THANH TOÁN ---");
    // Ủy quyền việc thanh toán cho đối tượng Strategy xử lý
    strategy.pay(amount);
  }
}
