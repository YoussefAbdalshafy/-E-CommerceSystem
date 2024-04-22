/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commercesystem;
import java.util.Scanner;
public class ECommerceSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Product p = new Product();
        ElectronicProduct  ep = new ElectronicProduct("smartphone",1,599.9f,"samsung",1);
        ClothingProduct cp = new ClothingProduct("T-shirt",2,19.99f,"medium","cotton");
        BookProduct bp = new BookProduct("oop",3,39.99f,"O’Reilly","X Publications");     
           System.out.println("Welcome to E-commerce System");
           System.out.println("plese enter your name");
               String n = in.nextLine();
           System.out.println("Plese enter your address:");
               String add = in.nextLine();
           System.out.println("Plese enter your id:");
               int id = in.nextInt();
        Customer c = new Customer(id,n,add);
           System.out.println("How many products you want to add to your cart? ");
               int num = in.nextInt();
        Cart car = new Cart(id,num);
        Product[] products = new Product[num];
        car.setnProducts(num);
               double Tprice =0;
         for(int i=0;i<num;i++){
                 System.out.println("Which product would you like to add?"+" 1-"+ep.getName()+" 2-"+cp.getName()+" 3-"+bp.getName());
          int choise = in.nextInt();
         switch (choise){
            case 1: 
                  products[i]=new Product("smartphone",1,599.9f);
                  car.addProduct(ep,i);
                   break;
            case 2:
                  products[i]=new Product("T-shirt",2,19.99f);
                  car.addProduct(cp,i);
                   break;
            case 3:
                    products[i]=new Product("oop",3,39.99f);
                  car.addProduct(bp,i);
                   break;
            default:
                System.out.println("invalid choise");}
               Tprice=  car.calculatePrice();}
               System.out.println("Your Total is :"+Tprice+" Would you like to place the order? 1-yes 2-no");
               int y = in.nextInt();
        Order order = new Order(c.getCustomerId(), 1, products , Tprice);
        car.placeOrder(order,y);}}
