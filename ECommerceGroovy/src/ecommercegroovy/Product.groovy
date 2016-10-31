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
class Product {
    def id;
    def name;
    def price;
    def amount;
    def categories;
    
    public Product(){ }
    public Product(String name, double price, int amount, ArrayList<String> categories){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.categories = categories;
    }
    
    public Product(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.amount = product.getAmount();
        this.categories = product.getCategories();
    }
    
    public def getId(){
        return this.id;
    }
    
    public def setId(int id){
        this.id = id;
    }
    
    public def getName(){
        return this.name;
    }
    
    public def setName(String name){
        this.name = name;
    }
    
    public def getPrice(){
        return this.price;
    }
    
    public def setPrice(double price){
        this.price = price;
    }
    
    public def getAmount(){
        return this.amount;
    }
    
    public def setAmount(int amount){
        this.amount = amount;
    }
    
    public def getCategories(){
        return this.categories;
    }
    
    public def setCategories(ArrayList<String> categories){
        this.categories = categories;
    }
}

