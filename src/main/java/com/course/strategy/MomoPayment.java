package com.course.strategy;

public class MomoPayment implements PaymentStrategy {

  @Override
  public void pay(double amount) {
    System.out.println("--- ĐANG XỬ LÝ THANH TOÁN QUA MoMo ---");
    System.out.println("[Hệ thống] Kết nối API MoMo...");
    System.out.println("[MoMo] Đã thanh toán thành công: " + amount + " VNĐ");
  }

}
