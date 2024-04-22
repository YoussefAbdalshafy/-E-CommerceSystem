package e.commercesystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Customer {
    private int customerId;
    private String name;
    private String address;
     Customer (){}
//get CustomerId
    public int getCustomerId() {
        return customerId;}
//setCustomerId
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);}
//getName
    public String getName() {
        return name;}
//setName
    public void setName(String name) {
        this.name = name;}
//getAddress
    public String getAddress() {
        return address;}
//setAddress
    public void setAddress(String address) {
        this.address = address;}
//constructor
    public Customer(int customerId, String name, String address) {
        this.customerId =Math.abs(customerId) ;
        this.name = name;
        this.address = address;}}