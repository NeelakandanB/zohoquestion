package com.zoho.zohograduatestudies.assignment6.Question1;

public class Main
{
    public static void main(String args[])
    {
        PaymentGatewaySystem obj=new PaymentGatewaySystem();

        obj.setTransactionId(230210);
        obj.setPayerName("sharumathi");
        obj.setPayeeName("Neelakandan");
        obj.setAmount(200000);
        obj.setPaymentMethod("bankTransfer");
        obj.setTransactionStatus(false);

        obj.display();


       /* System.out.println("Transaction id is : "+obj.getTransactionId());
        System.out.println("payer name is : "+obj.getPayerName());
        System.out.println("payee name  is : "+obj.getPayeeName());
        System.out.println("Amount is : "+obj.getAmount());
        System.out.println("payment method is : "+obj.getPaymentMethod());
        System.out.println("transaction status is : "+obj.getTransactionStatus());

        */

    }

}
