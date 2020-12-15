package functionalInterface;

public class Employee implements Comparable<Employee> {

    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee emplpoyee = (Employee) obj;
            return (this.name.equals(emplpoyee.name) && this.age == emplpoyee.age);
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.getName());
//    }
    
    @Override
    public int compareTo(Employee e) {
        return e.age-this.age;
    }    
    
}
