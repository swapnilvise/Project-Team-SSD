/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author swapn
 */
public class Item {
    
    private static int temp=0;
    
    private String itemId;
    private String itemName;
    private double itemPrice;

    public Item() {
        temp++;
        this.itemId= "I"+String.valueOf(temp);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemId() {
        return itemId;
    }

    @Override
    public String toString() {
        return this.itemName;
    }
    
}
