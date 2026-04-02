package com.course.factorymethod;

public class Application {
    public static void main(String[] args) {
        System.out.println("--- Yêu cầu Factory tạo đối tượng MoMo ---");
        // Client chỉ cần truyền định danh, Factory sẽ trả về đối tượng hoàn chỉnh
        Payment momo = PaymentFactory.createPayment("MOMO");
        momo.process();

        System.out.println("\n--- Yêu cầu Factory tạo đối tượng ZaloPay ---");
        Payment zalo = PaymentFactory.createPayment("ZALOPAY");
        zalo.process();
    }
}
