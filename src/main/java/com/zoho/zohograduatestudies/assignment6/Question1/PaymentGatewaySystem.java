package com.zoho.zohograduatestudies.assignment6.Question1;

public class PaymentGatewaySystem
{
    private long transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private boolean transactionStatus;


//setters methods for these attributes

    public void setTransactionId(long id)
    {
        transactionId=id;
    }

    public void setPayerName(String payername)
    {
        payerName=payername;
    }
    public void setPayeeName(String name2)
    {
        payeeName=name2;
    }

    public void setAmount(double amount1)
    {
        amount=amount1;
    }

    public void setPaymentMethod(String methodName)
    {
        paymentMethod=methodName;
    }

    public void setTransactionStatus(boolean status)
    {
         transactionStatus=status;
    }

    //getters methods for the given attributes

    public long getTransactionId()
    {
        return transactionId;
    }

    public String getPayerName()
    {
        return payerName;
    }

    public String getPayeeName()
    {
        return payeeName;
    }

    public double getAmount()
    {
        return amount;
    }

    public String getPaymentMethod()
    {
        return paymentMethod;
    }

    public boolean getTransactionStatus()
    {
        return transactionStatus;
    }

    public void display()
    {
        System.out.println("Transaction id is : "+transactionId);
        System.out.println("payer name is : "+payerName);
        System.out.println("payee name  is : "+payeeName);
        System.out.println("Amount is : "+amount);
        System.out.println("payment method is : "+paymentMethod);
        System.out.println("transaction status is : "+transactionStatus);
    }

}

