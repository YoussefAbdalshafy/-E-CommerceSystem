/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package e.commercesystem;               
public class Order {
    private  int customerId;
    private  int orderId;
    private Product[] products;
    private double totalPrice;   
//getCustomerId
    public int getCustomerId() {
        return customerId;}
//setCustomerId
    public void setCustomerId(int customerId) {
        this.customerId = customerId;}
//getOrderId
    public int getOrderId() {
        return orderId;}
//setOrderId
    public void setOrderId(int orderId) {
        this.orderId = orderId;}
//Product[] getProducts
    public Product[] getProducts() {
        return products;}
//setProducts
    public void setProducts(Product[] products) {
        this.products = products;}
//getTotalPrice
    public double getTotalPrice() {
        return totalPrice;}
//setTotalPrice
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;}
//constructor
    public Order(int customerId, int orderId,Product[] products, double totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);}
//constructor
    Order() {}
//method to printOrderInfo
    public void printOrderInfo() {
      System.out.println("Here's your order's summary:");
      System.out.println("Order ID: " + orderId);
      System.out.println("Customer ID: " + customerId);
      System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " (price: " + product.getPrice() + ")");}
            System.out.println("The total price should be: $" +getTotalPrice());}}

       



