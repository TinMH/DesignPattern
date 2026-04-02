package com.course.strategy;

public class ZalopayPayment implements PaymentStrategy {

  @Override
  public void pay(double amount) {
    System.out.println("--- ĐANG XỬ LÝ THANH TOÁN QUA ZaloPay ---");
    System.out.println("[Hệ thống] Kết nối API ZaloPay...");
    System.out.println("[ZaloPay] Đã thanh toán thành công: " + amount + " VNĐ");
  }

}
