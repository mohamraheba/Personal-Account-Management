class Amount {
    private double amount;
    private String transactionType;

    public Amount(double theAmount, String theTransactionType) {
        amount = theAmount;
        transactionType = theTransactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
}