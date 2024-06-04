package Abstraction_Payment_Processing.Class;

import Abstraction_Payment_Processing.Interfaces.IPaymentProcess;
import Abstraction_Payment_Processing.Interfaces.ITransactionResponse;

public class CreditCardPayment implements IPaymentProcess {
    @Override
    public ITransactionResponse paymentProcess(double amount) {
        // TODO Auto-generated method stub
        return new TransactionResponse(true, "cc1234567890", "Payment processed successfully via Credit Card");
    }

}
