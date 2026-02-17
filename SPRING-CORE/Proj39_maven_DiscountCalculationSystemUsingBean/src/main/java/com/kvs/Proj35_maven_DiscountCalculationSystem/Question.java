package com.kvs.Proj35_maven_DiscountCalculationSystem;

public class Question {
/*Task 1 — Discount Calculation System

Objective:
Use the Strategy Design Pattern in Spring Core to apply different discount strategies based on customer type.

Class-wise Design:

DiscountStrategy (Interface)

Method: double calculateDiscount(double amount)

RegularCustomerDiscount (Concrete Strategy)

Implements: DiscountStrategy

Provides 5% discount.

PremiumCustomerDiscount (Concrete Strategy)

Implements: DiscountStrategy

Provides 10% discount.

EliteCustomerDiscount (Concrete Strategy)

Implements: DiscountStrategy

Provides 15% discount.

BillingService (Context Class)

Has a reference to DiscountStrategy.

Method: generateBill(double amount)

AppConfig (Configuration Class)

Declares beans for all discount types.

MainApp (Client Class)

User chooses customer type (Regular, Premium, Elite).

Spring injects correct strategy and displays final bill.

🧾 Expected Console Output:
Enter purchase amount: 1000
Enter customer type (regular/premium/elite): premium

Original Amount: ₹1000.0  
Discount Applied: ₹100.0  
Final Payable Amount: ₹900.0
*/
}
