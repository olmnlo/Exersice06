//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("123456", "Hussam", 10000);
        Account account2 = new Account("123456789012", "Ahmed", 10000);
        int amount = 20000;
        int debit_amount = 10000;
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        if (account1.credit(amount)){
            System.out.printf("your new balance: %d\n", account1.getBalance());
        }

        if (account1.debit(debit_amount)){
            System.out.printf("your debit successfully your new balance: %d, you want to debit: %d\n",account1.getBalance(), debit_amount);
        }else {
            System.out.printf("your debit unsuccessfully your balance: %d\n",account1.getBalance());
        }

        if (account1.transferTo(account2, amount)){
            System.out.printf("%d transfer successfully\nyour new balance %d",amount ,account1.getBalance());
        }else {
            System.out.printf("you cannot transfer you do not have enough balance your balance: %d, you want to transfer: %d", account1.getBalance(), amount);
        }
        System.out.println(account1.toString());
        System.out.println(account2.toString());


//--------------------------------------------------------------------------------------//
        Employee employee1 = new Employee("0001", "Hussam", 12000);

        if (employee1.raisedSalary(10)){
            System.out.printf("your new salary is: %d", employee1.getSalary());
        }else {
            System.out.println("wrong percent");
        }

        System.out.printf("your annual salary is: %d", employee1.getAnnualSalary(2));


    }
}