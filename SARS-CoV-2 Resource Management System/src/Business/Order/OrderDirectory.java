/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class OrderDirectory {
    
    private HashMap<String,Order> orderDirectory;
    
    public OrderDirectory(){
        this.orderDirectory= new HashMap<>();
    }

    public HashMap<String, Order> getOrderDirectory() {
        return orderDirectory;
    }
    
    public Order newOrder(){
        Order no= new Order();
        this.orderDirectory.put(no.getOrderId(),no);
        return this.orderDirectory.get(no.getOrderId());
    }
    
    public void newOrder(Order order){
        this.orderDirectory.put(order.getOrderId(),order);
    }
    
    public void deleteOrder(String orderId){
        this.orderDirectory.remove(orderId);
    }
    
}
