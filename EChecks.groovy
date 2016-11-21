import java.util.*;

class EChecks extends PaymentMethod
{
  def accountID
  def productID
  def releaseDate

  public EChecks()
  {
    this.accountID = 0;
    this.productID = 0;
    this.releaseDate = new Date();
  }

  public EChecks(int accountID, int productID, Date releaseDate)
  {
    this.accountID = accountID;
    this.productID = productID;
    this.releaseDate = releaseDate;
  }

  public int getAccountID()
  {
    return this.accountID;
  }

  public int getProductID()
  {
    return this.productID;
  }

  public Date releaseDate()
  {
    return this.releaseDate;
  }
}
