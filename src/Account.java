public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(){
        name = "demo";
        id = "demo";
        balance = 500;
    }

    public Account(String id, String name){
        setName(name);
        setId(id);
    }
    public Account(String id, String name, int balance) {
        setId(id);
        setBalance(balance);
        setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 12){
            System.out.printf("You cannot enter this id: %s\n", id);
        }else {
        this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 15){
            System.out.printf("it is long name: %s",name);
        }
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("you cannot enter negative balance");
        }else {
            this.balance = balance;
        }
    }

    public boolean credit(int amount){
        balance += amount;
        return true;
    }
    public boolean debit(int amount){
        if(amount <= this.balance){
            this.balance = this.balance-amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(Account account, int amount){
        if (this.balance >= amount){
            account.setBalance(this.balance+amount);
            this.balance -= amount;
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
