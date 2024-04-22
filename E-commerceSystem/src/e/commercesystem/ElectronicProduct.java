package e.commercesystem;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;
    ElectronicProduct() {}
//get brand
    public String getBrand() {
        return brand;}
//set brand
    public void setBrand(String brand) {
        this.brand = brand;}
//getWarrantyPeriod
    public int getWarrantyPeriod() {
        return warrantyPeriod;}
//setWarrantyPeriod
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);}
//constructor
    public ElectronicProduct( String name, int productId, double price,String brand, int warrantyPeriod) {
        super(name, productId, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;}}
