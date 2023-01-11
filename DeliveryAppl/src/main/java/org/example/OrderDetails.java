package org.example;

public class OrderDetails
{
    public static void main(String[] args)
    {
        Customer c= new Customer();
        c.setCustomerName("Latha");
        c.setMobileNum(965847123);
        c.setAddress("Mysore");

        Order o= new Order();
        o.setOrderedId(404569);
        o.setOrderDescription("Maxi Velvet Dress");
        o.setPrice(1000);
        o.setPaymentMode("Net Banking");

        Customer c1= new Customer();
        c1.setCustomerName("Vikas");
        c1.setMobileNum(924747123);
        c1.setAddress("Bangalore");

        Order o1= new Order();
        o1.setOrderedId(40769);
        o1.setOrderDescription("Maxi Dress");
        o1.setPrice(5000);
        o1.setPaymentMode("Net Banking");

        System.out.println("customer name:"+c.getCustomerName());
        System.out.println("customer mobile num:"+ c.getMobileNum());
        System.out.println("customer address:"+ c.getAddress());
        System.out.println("customer orderId:" +o.getOrderedId());
        System.out.println("Customer order description:" +o.getOrderDescription());
        System.out.println("Order price:"+ o.getPrice());
        System.out.println(" ");
        System.out.println("customer name:"+c1.getCustomerName());
        System.out.println("customer mobile num:"+ c1.getMobileNum());
        System.out.println("customer address:"+ c1.getAddress());
        System.out.println("customer orderId:" +o1.getOrderedId());
        System.out.println("Customer order description:" +o1.getOrderDescription());
        System.out.println("Order price:"+ o1.getPrice());


    }
}
