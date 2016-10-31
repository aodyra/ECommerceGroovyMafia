class ECash
{
  def accountID
  def productID

  public ECash()
  {
    this.accountID = 0;
    this.productID = 0;
  }

  public ECash(int accountID, int productID)
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
