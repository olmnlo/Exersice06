public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee() {
        id = "0001";
        name = "demo";
        salary = 0;
    }

    public Employee(String id, String name, int salary) {
        setId(id);
        setSalary(salary);
        setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.startsWith("00")){
            System.out.print("your id must start with 00\n");
        }else if (id.length() != 4 || !id.matches("\\d{4}")){
            System.out.println("you must have 4 digits");
        }else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.contains("@")){
            System.out.println("you cannot enter @ in your name");
        }else {
            this.name = name;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("you cannot make salary negative");
        }else {
            this.salary = salary;
        }
    }

    public int getAnnualSalary(int annual){
        if (annual <= 0){
            return salary;
        }else {
            return this.salary * (annual*12);
        }
    }

    public boolean raisedSalary(int percent){
        if (percent > 0){
            this.salary += (int)(this.salary*((double) percent/100));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
