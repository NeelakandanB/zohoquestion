package com.zoho.zohograduatestudies.assignment4;

import java.util.*;

/*6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.

 */

class Store
{
        private  static String storeName;
        private static String storeLocation;

          public static void setStoreDetails(String storename,String location)
          {
                  storeName=storename;
                 storeLocation=location;
          }

         public static void displayStoreDetails()
         {

               System.out.println("store name :  "+storeName);
               System.out.println("store location : "+storeLocation);
         }

            List<Product> store=new ArrayList<>();

         public void addProduct(Product product)
         {

                 store.add(product);
         }

         public void displayAllStoreDetails()
         {
                 for(Product detail:store)
                 {

                     System.out.println(" product Name : "+detail.productName+","+" product Id : "+detail.productId+","+" product price : "+ detail.price+","+" product quantity "+detail.quantity);
                     System.out.println();
                  }

         }


}

class Product
{
      long productId;
      String productName;
      double price;
      int quantity;

   public Product(String productname,long id,double price,int quantity)
   {
         this.productName=productname;
         this.productId=id;
         this.price=price;
         this.quantity=quantity;
   }

   public void displayProductDetails()
   {

       System.out.println("product name : "+productName);
       System.out.println("product id : "+productId );
       System.out.println("product price : "+price);
       System.out.println("product quantity : "+quantity);
       System.out.println("______________________________");

   }

}



public class Question6
{
    public static void main(String args[])
    {
        Product product1=new Product("baggy jeans",12342321,1000,1);
        Product product2=new Product("linen shirts",23023211,1200,1);
        Product product3=new Product("korean baggy",43235343,1500,2);

        Store obj=new Store();
        obj.setStoreDetails("max fashion","Chennai");
        obj.displayStoreDetails();

        obj.addProduct(product1);
        obj.addProduct(product2);
        obj.addProduct(product3);
        obj.displayAllStoreDetails();

        product1.displayProductDetails();
        product2.displayProductDetails();;
        product3.displayProductDetails();

    }
}
