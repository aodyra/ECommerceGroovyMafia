class EWallet extends PaymentMethod
{
  def walletType
  def productID

  public EWallet()
  {
    this.walletType = 0;
    this.productID = 0;
  }

  public EWallet(int walletType, int productID)
  {
    this.walletType = walletType;
    this.productID = productID;
  }

  public int getWalletType()
  {
    return this.walletType;
  }

  public int getProductID()
  {
    return this.productID;
  }
}
