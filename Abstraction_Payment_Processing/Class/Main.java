package Abstraction_Payment_Processing.Class;

import Abstraction_Payment_Processing.Interfaces.IPaymentProcess;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        IPaymentProcess crditCardPayment = new CreditCardPayment();
        IPaymentProcess paypalpayment = new CreditCardPayment();
        PaymentProcessor CreditCardprocessor = new PaymentProcessor(crditCardPayment); //
        PaymentProcessor paypalprocessor = new PaymentProcessor(crditCardPayment); //
        CreditCardprocessor.process(500);
        paypalprocessor.process(500);
    }
}