class Review {
  def id;
  def reviewMakerId;
  def reviewMessage;
  def createDate;
  def product;
  
  public Review() {}
  public Review(int id, int reviewMakerId, String reviewMessage, Product product) 
  {
    this.id = id;
    this.reviewMakerId = reviewMakerId;
    this.reviewMessage = reviewMessage;
    this.product = product;
    this.createDate = Date.calendarDate();
  }
  
  public def getId() 
  {
    return this.id;
  }
  
  public def setId(int id) 
  {
    return this.id = id;
  }
  
  public def getReviewMakerId() 
  {
    return this.reviewMakerId;
  }
  
  public def setReviewMakerId(int reviewMakerId) 
  {
    this.reviewMakerId = reviewMakerId;
  }
  
  public def getReviewMessage() 
  {
    return this.reviewMessage;
  }
  
  public def setReviewMessage(String message) 
  {
    this.reviewMessage = message;
  }
  
  public def getCreateDate() 
  {
    return this.createDate;
  }
  
  public def getProduct() 
  {
    return this.product;
  }
} 
