/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Item;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class Order {
    
    private static int temp=10000;
    
    private String orderId;
    private String restaurantName;
    private String status;
    
    private String customerName;
    private String customerId;
    private String customerNotes;
    private String feedback;
    private double orderTotal;
    private LocalDateTime orderDateTime;
    
    private String deliveryManName;
    private String deliveryManId;
    private LocalDateTime deliveredDateTime;
    
    private HashMap<Item,Integer> itemList;
    
    public Order(){
        temp++;
        this.orderId= "O"+String.valueOf(temp);
        this.orderDateTime=LocalDateTime.now();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getDeliveryManId() {
        return deliveryManId;
    }

    public void setDeliveryManId(String deliveryManId) {
        this.deliveryManId = deliveryManId;
    }

    public HashMap<Item,Integer> getItemList() {
        return itemList;
    }

    public void setItemList(HashMap<Item,Integer> itemList) {
        this.itemList = itemList;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public LocalDateTime getDeliveredDateTime() {
        return deliveredDateTime;
    }

    public void setDeliveredDateTime(LocalDateTime deliveredDateTime) {
        this.deliveredDateTime = deliveredDateTime;
    }
    
}
