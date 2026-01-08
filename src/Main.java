class Main {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("Dilan Rojas", 250000);
    BankApp bankApp = new BankApp(bankAccount);

    bankApp.open();
  }
}
