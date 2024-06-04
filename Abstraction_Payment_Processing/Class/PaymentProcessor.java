package Abstraction_Payment_Processing.Class;

import Abstraction_Payment_Processing.Interfaces.IPaymentProcess;
import Abstraction_Payment_Processing.Interfaces.ITransactionResponse;

public class PaymentProcessor {
    private IPaymentProcess paymentMethod;

    PaymentProcessor(IPaymentProcess paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        ITransactionResponse response = paymentMethod.paymentProcess(amount);
        if (response.isSuccess()) {
            System.out.println("Transaction ID: " + response.GetTransactionId() + "Transaction ID: "
                    + response.GetMessage());
        } else {
            System.err.println("Transaction failed! Message: " + response.GetMessage());
        }
    }
}
