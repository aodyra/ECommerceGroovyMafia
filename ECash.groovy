class ECash extends PaymentMethod
{
  def accountID
  def productID

  public EChecks()
  {
    this.accountID = 0;
    this.productID = 0;
  }

  public EChecks(int accountID, int productID)
  {
    this.accountID = accountID;
    this.productID = productID;
  }

  public int getAccountID()
  {
    return this.accountID;
  }

  public int getProductID()
  {
    return this.productID;
  }
}
