package Abstraction_Payment_Processing.Class;

import Abstraction_Payment_Processing.Interfaces.ITransactionResponse;

class TransactionResponse implements ITransactionResponse {
    boolean isSuccess;
    String transactionId;
    String message;

    TransactionResponse(boolean isSuccess, String transactionId, String message) {
        this.message = message;
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
    }

    @Override
    public boolean isSuccess() {
        // TODO Auto-generated method stub
        return isSuccess;
    }

    @Override
    public String GetTransactionId() {
        return transactionId;
    }

    @Override
    public String GetMessage() {
        return message;
    }

}