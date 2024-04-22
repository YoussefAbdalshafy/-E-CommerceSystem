package e.commercesystem;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class ClothingProduct extends Product {
    private String size;
    private String fabric;
    ClothingProduct() {}
//get size
    public String getSize() {
        return size;}
//set size
    public void setSize(String size) {
        this.size = size;}
//get fabric
    public String getFabric() {
        return fabric;}
//set fabric
    public void setFabric(String fabric) {
        this.fabric = fabric;}
//constructor
    public ClothingProduct( String name, int productId, double price,String size, String fabric) {
        super(name, productId, price);
        this.size = size;
        this.fabric = fabric;}}
    
    

