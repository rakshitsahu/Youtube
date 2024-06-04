package Abstraction_Payment_Processing.Interfaces;

public interface IPaymentProcess {
    ITransactionResponse paymentProcess(double amount);
}