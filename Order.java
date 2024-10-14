package com.ctrlaltelite.pos.models;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author David Nguyen
 */


public class Order {
    private int orderId;
    private int employeeId;
    private Timestamp orderDate;
    private double totalAmount;

    /**
     * @param orderId: unique identifier for the order
     * @param employeeId employee who took the order
     * @param orderDate Timestamp of when the order was placed
     * @param totalAmount the total price of the order
     * 
     */
    public Order(int orderId, int employeeId, Timestamp orderDate, double totalAmount) {
        this.orderId = orderId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters

    /**
     * 
     * @return returns the order id
     */
    public int getOrderId() {
        return orderId;
    }

      /**
      * 
      * @param orderId sets the order id to the object from the database
      */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

      /**
      * 
      * @return returns the employee id
      */
    public int getEmployeeId() {
       return employeeId;
    }

      /**
      * 
      * @param employeeId sets the employee id to the object from the database
      */
    public void setEmployeeId(int employeeId) {
       this.employeeId = employeeId;
    }

    /**
     * 
     * @return returns the order date as a timestamp
     */
    public Timestamp getOrderDate() {
       return orderDate;
    }

      /**
      * 
      * @param orderDate sets the order date to the object from the database
      */
    public void setOrderDate(Timestamp orderDate) {
       this.orderDate = orderDate;
    }

      /**
      * 
      * @return returns the total amount (price) of the order
      */
    public double getTotalAmount() {
       return totalAmount;
    }

      /**
      * 
      * @param totalAmount sets the total amount (price) of the order to the object from the database
      */
    public void setTotalAmount(double totalAmount) {
       this.totalAmount = totalAmount;
    }

    @Override
    /**
     * @return returns the order object as a string
     */
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", employeeId=" + employeeId +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
