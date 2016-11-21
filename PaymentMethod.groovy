class PaymentMethod
{
  def amount
  def balance

  public PaymentMethod()
  {
    this.amount = 0;
    this.balance = 0;
  }

  public PaymentMethod(int amount, int balance)
  {
    this.amount = amount;
    this.balance = balance;
  }

  public getAmount()
  {
    return this.amount;
  }

  public getBalance()
  {
    return this.balance;
  }
}
