//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("A-123456", "Hussam", 10000);
        Account account2 = new Account("A-123456789012", "Ahmed", 10000);
        // used the default balance for account 500
        Account account3 = new Account("A-33445242", "Faisal");
        //here will show you that user should have A- at the start and not contains @
        Account account4 = new Account("oopellds", "Rayan");
        //use default account: demo, A-demo, 500
        Account account5 = new Account();

        // amount used in add money to credit() and transferTo()
        int amount = 20000;
        // debit_amount used in debit()
        int debit_amount = 10000;
        //show you the initial value for account1 to account5
        System.out.println("-----------------------------------------------");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        System.out.println(account4.toString());
        System.out.println(account5.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("operations between account1 and account2:");
        //add amount to account1 balance
        if (account1.credit(amount)){
            System.out.printf("credit: your new balance: %d\n", account1.getBalance());
        }else {
            System.out.println("credit: You can not do this operation");
        }

        if (account1.debit(debit_amount)){
            System.out.printf("debit: your debit successfully your new balance: %d, your debit: %d\n",account1.getBalance(), debit_amount);
        }else {
            System.out.printf("debit: your debit unsuccessfully your balance: %d\n",account1.getBalance());
        }

        if (account1.transferTo(account2, amount)){
            System.out.printf("transferTo: %d transfer successfully your new balance %d\n",amount ,account1.getBalance());
        }else {
            System.out.printf("transferTo: you cannot transfer you do not have enough balance your balance: %d, you want to transfer: %d\n", account1.getBalance(), amount);
        }
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        System.out.println("\n\n");

//----------------------------------Employee class objects-----------------------------------------//
        System.out.println("---------------------------------------------------------");
        Employee employee1 = new Employee("0002", "Hussam", 12000);
        Employee employee2 = new Employee();
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println("---------------------------------------------------------");
        if (employee1.raisedSalary(35)){
            System.out.printf("your new salary is: %d\n", employee1.getSalary());
        }else {
            System.out.println("wrong percent");
        }

        System.out.printf("your annual salary is: %d\n", employee1.getAnnualSalary(2));

        System.out.println("-----------------------------------");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println("-----------------------------------");

    }
}