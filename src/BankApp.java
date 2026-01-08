import java.util.Scanner;

class BankApp {
  // Attributes
  private BankAccount account;
  private boolean stayOpen;
  private Scanner scanner;
  String menu = "1. Depositar dinero\n" +
      "2. Retirar Dinero\n" +
      "3. Mostrar saldo\n" +
      "4. Salir";

  // Constructor
  public BankApp() {
    this.account = null;
    this.scanner = new Scanner(System.in);
    this.stayOpen = true;
  }

  public BankApp(BankAccount account) {
    this.account = account;
    this.scanner = new Scanner(System.in);
    this.stayOpen = true;
  }

  // Print menu
  public int menu() {
    System.out.println(menu);
    System.out.println("Digite el número de trámite");
    return scanner.nextInt();
  }

  // Handle options
  public void open() {
    while (stayOpen) {
      System.out.println("\n");
      int userOpt = menu();

      switch (userOpt) {
        // Deposit
        case 1:
          System.out.print("\nMonto a depositar ₡");
          account.deposit(scanner.nextInt());
          break;

        // Withdraw
        case 2:
          System.out.print("\nMonto a retirar ₡");
          account.withdraw(scanner.nextInt());
          break;

        // Get balance
        case 3:
          System.out.print("\nSaldo actual: ₡" + account.getBalance());
          break;

        // Exit
        case 4:
          System.out.println("Saliendo...");
          this.stayOpen = false;
          break;

        // Print warning (defualt)
        default:
          System.out.println("Digite una opcion valida");
      }
    }

  }
}
