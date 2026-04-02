package com.course.strategy;

public class TraditionalPaymentService {

  // Hàm xử lý thanh toán chứa tất cả các phương thức
  public void processPayment(String paymentType, double amount) {
    System.out.println("--- ĐANG XỬ LÝ THANH TOÁN ---");

    if (paymentType.equalsIgnoreCase("ZALOPAY")) {
      System.out.println("[Hệ thống] Kết nối API ZaloPay...");
      System.out.println("[ZaloPay] Đã thanh toán thành công: " + amount + " VNĐ");

    } else if (paymentType.equalsIgnoreCase("MOMO")) {
      System.out.println("[Hệ thống] Kết nối API MoMo...");
      System.out.println("[MoMo] Đã thanh toán thành công: " + amount + " VNĐ");

    } else if (paymentType.equalsIgnoreCase("CREDIT_CARD")) {
      System.out.println("[Hệ thống] Kết nối cổng thẻ tín dụng quốc tế...");
      System.out.println("[Credit Card] Đã trừ: " + amount + " VNĐ");

    } else {
      System.out.println("[Lỗi] Phương thức thanh toán không được hỗ trợ!");
    }
  }

  public static void main(String[] args) {
    TraditionalPaymentService service = new TraditionalPaymentService();
    service.processPayment("MOMO", 500000);
    service.processPayment("BITCOIN", 100000); // Báo lỗi vì chưa được hỗ trợ
  }
}