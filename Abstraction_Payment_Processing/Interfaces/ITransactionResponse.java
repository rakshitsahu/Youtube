package Abstraction_Payment_Processing.Interfaces;

public interface ITransactionResponse {

    boolean isSuccess();

    String GetTransactionId();

    String GetMessage();

}