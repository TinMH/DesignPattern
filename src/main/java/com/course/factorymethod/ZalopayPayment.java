package com.course.factorymethod;

public class ZalopayPayment implements Payment {
    private String phoneNumber;
    private String linkedAccount;

    public ZalopayPayment(String phoneNumber, String linkedAccount) {
        this.phoneNumber = phoneNumber;
        this.linkedAccount = linkedAccount;
    }

    @Override
    public void process() {
        System.out.println("Xử lý ZaloPay qua tài khoản liên kết: " + linkedAccount);
    }
}