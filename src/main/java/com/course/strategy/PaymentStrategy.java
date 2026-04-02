package com.course.strategy;

public interface PaymentStrategy{
  // Interface quy định mọi phương thức thanh toán đều phải có hàm pay() để thực hiện thanh toán
  void pay(double amount);
}
