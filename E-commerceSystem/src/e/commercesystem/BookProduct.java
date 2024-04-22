package e.commercesystem;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class BookProduct extends Product{
    private String author ;
    private String publisher ;
    BookProduct() {}
// getAuthor
    public String getAuthor() {
        return author;}
//setAuthor
    public void setAuthor(String author) {
        this.author = author;}
// getPublisher
    public String getPublisher() {
        return publisher;}
//setPublisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;}
//constructor
    public BookProduct(String author, String publisher) {
        this.author = author;
        this.publisher = publisher;}
//constructor
    public BookProduct( String name, int productId, double price,String author, String publisher) {
        super(name, productId, price);
        this.author = author;
        this.publisher = publisher;}}
    
    

