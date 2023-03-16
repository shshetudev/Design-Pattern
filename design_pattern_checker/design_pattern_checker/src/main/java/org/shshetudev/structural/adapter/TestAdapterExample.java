package org.shshetudev.structural.adapter;

public class TestAdapterExample {
    public static void main(String[] args) {
        //Object for XPay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);

        PayD payD = new XPayToPayDAdapter(xpay);
        printPayD(payD);
    }

    public static void printPayD(PayD payD) {
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getTotalAmount());
    }
}
