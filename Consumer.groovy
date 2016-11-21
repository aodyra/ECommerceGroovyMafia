class Consumer {
  def id;
  def saldo;
  def consumerOrders;
  def reviews;
  
  public Consumer() {}

  public Consumer(int id, double saldo) 
  {
    this.id = id;
    this.saldo = saldo;
    this.consumerOrders = new HashMap<Integer, Order>();
    this.reviews = new HashMap<Integer, Review>();
  }
  
  public def addConsumerOrder(Order order)
  {
    consumerOrders.put(order.getId, order);
  }
  
  public def setStatusOrderConsumer(int idOrder, String status)
  {
    consumerOrders.get(idOrder).setStatus(status);
  }
  
  public def createReview(String message, Product product)
  {
    reviews.put(0, new Review(0, this.id, message, product));
  }
}

