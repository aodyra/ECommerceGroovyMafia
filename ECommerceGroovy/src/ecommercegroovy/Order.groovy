/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommercegroovy

/**
 *
 * @author aodyra
 */
class Order {
    def id;
    def orderDate;
    def consumer;
    def products;
    def deadlinePayment;
    def status;
    
    public Order(){ }
    
    public Order(int id, Consumer consumer, ArrayList<Product> products){
        this.id = id;
        this.orderDate = Date.calendarDate;
        this.consumer = consumer;
        this.products = products;
        this.deadlinePayment = new Date(this.orderDate.date + (5 * 3600 * 24));
        this.status = "wait_payment"
    }
    
    public def getId(){
        return this.id;
    }
    
    public def setId(int id){
        this.id = id;
    }
    
    public def getOrderDate(){
        return this.orderDate;
    }
    
    public def setOrderDate(Date orderDate){
        this.orderDate = orderDate;
    }
    
    public def getConsumer(){
        return this.consumer;
    }
    
    public def setConsumer(Consumer consumer){
        this.consumer = consumer;
    }
    
    public def getProducts(){
        return this.products;
    }
    
    public def setProducts(ArrayList<Product> products){
        this.products = products;
    }
    
    public def getDeadlinePayment(){
        return this.deadlinePayment;
    }
    
    public def setDeadlinePayment(Date deadlinePayment){
        this.deadlinePayment = deadlinePayment;
    }
    
    public def getStatus(){
        return this.status;
    }
    
    public def setStatus(String status){
        this.status = status;
    }
}

