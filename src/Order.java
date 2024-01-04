package models;

import java.util.Arrays;

public class Order {
    public String name;///represent name of the customer
    public String phoneNumber;//represent phone no of customer
    public int[] items;///represent brought items by customer
    public double[] prices;//represent
////using constructor to intilazize value to make object for order class)
    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }
////using getter and setter to
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }
/////using print Billwith Vat to print the detail of bill
    public void printBillWithVAT() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        double vat = totalPrice * 0.13;
        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total price with VAT: " + (totalPrice + vat));
    }
}
