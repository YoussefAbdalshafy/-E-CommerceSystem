/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 
 */ 
package e.commercesystem;
public class Product {
    protected int productId;
    protected String name;
    protected double price;
    Product() {}
//get ProductId
    public int getProductId() {
        return productId;}
//set ProductId(abs)
    public void setProductId(int productId) {
        this.productId = Math.abs(productId);}
//get name
    public String getName() {
        return name;}
//set name
    public void setName(String name) {
        this.name = name;}
//get price
    public double getPrice() {
        return price; }
//set Price(abs)
    public void setPrice(double price) {
        this.price = Math.abs(price); }
//constructor
    public Product(String name,int productId, double price) {
        this.productId =Math.abs(productId);
        this.name = name;
        this.price =Math.abs(price);}}
