import java.util.*;
class Promotion {                     
  def id  
  def period 
  def listDiscount 
 
  public Promotion() {}

  public Promotion(int id, Date period, Map<Integer,Integer> listDiscount)
  {
    this.id = id;    
    this.period = period;
    this.listDiscount = listDiscount;
  }

  public int getDiscountProduct(int listDiscountKey)
  {
    return this.listDiscount.get(listDiscountKey); 
  }

  public void addDiscount(int key, int amount)
  {
    this.listDiscount.put(key, amount);
  }
}
