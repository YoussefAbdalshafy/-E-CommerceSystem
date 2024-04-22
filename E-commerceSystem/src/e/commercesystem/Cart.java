/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package e.commercesystem;
public class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;
// getCustomerId
    public int getCustomerId() {
        return customerId;}
// setCustomerId
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);}
//getnProducts
    public int getnProducts() {
        return nProducts;}
// setnProducts
    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);}
//constructor
     Cart(int id, int num, Product p){}
//constructor
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products =new Product [nProducts];}
//method to addProduct
 public void addProduct(Product product,int x) {
    if (x>=0&&x<nProducts) {
        products[x] = product;
        System.out.println(product.getName() + " added to cart.");}}
//method to removeProduct
      public void removeProduct(int index) {
        if (index >= 0 && index < nProducts) {
            for (int i = index; i < nProducts - 1; i++) {
                products[i] = products[i + 1];}
            products[nProducts - 1] = null;
            nProducts--;}
        else {
            System.out.println("Invalid index. No product removed.");}}
//method to calculatePrice
       public double calculatePrice() {
        double total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();}}
        return total;}
//method toPlaceOrder
        public void placeOrder(Order order,int y) {
      if (y==1){   
     order.printOrderInfo();}
        else{
            System.out.println("thanks for useing");}}}
