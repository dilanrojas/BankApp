class BankAccount {
  // Attributes
  private String accountHolder;
  private int balance;

  // Constructor
  public BankAccount() {
    this.accountHolder = null;
    this.balance = 0;
  }

  public BankAccount(String accountHolder, int balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  // Getters
  public String getAccountHolder() {
    return this.accountHolder;
  }

  public int getBalance() {
    return this.balance;
  }

  // Setters
  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  // Methods
  public boolean deposit(int amount) {
    if (amount <= 0) {
      System.out.print("Error: monto inferior al mínimo");
      return false;
    }

    this.balance += amount;

    System.out.print("Saldo actual: ₡" + this.balance);
    return true;
  }

  public boolean withdraw(int amount) {
    if (amount <= 0) {
      System.out.print("Error: monto inferior al mínimo");
      return false;
    }

    if (amount > this.balance) {
      System.out.print("Error: monto excede el saldo actual");
      return false;
    }

    this.balance -= amount;

    System.out.print("Saldo restante: ₡" + this.balance);

    return true;
  }
}
