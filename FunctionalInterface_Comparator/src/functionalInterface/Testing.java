package functionalInterface;

public class Testing {
    public static void main(String[] args) {
        String name1 = "Kalle";
        String name2 = "Kalle";
        
//        boolean x = true;
//        
//        System.out.println(x);
        System.out.println(name1.equals(name2));
        
        Employee employee1 = new Employee("Lisa", 27, 10000.0);
        Employee employee2 = new Employee("Lisa", 27, 12000.0);
        Employee employee3 = new Employee("Lisa", 31, 12000.0);
        
        System.out.println(employee1.equals(employee3));
        
        
        Work worker = new Work(){
            @Override
            public void working(String task) {
                System.out.println("Worker working with "+task+".");
            }
        };
        
        worker.working("bulding houses");
        
        Work worker2 = (String task)->{
            System.out.println("Worker is master the process of "+task+".");
        };
        
        worker2.working("hammering");
        
        
        Work worker3 = task->System.out.println("Worker is king of " + task);
        
        worker3.working("coding");
        
        WorkWithLevel worker4 = (task, level) -> System.out.println("Employee is master of "+task+" and executes on level "+level);
        worker4.working("coding", 10);
        
        WorkWithLevel worker5 = (task, level) -> System.out.println("Worker works with "+ task+" at level "+level);
        
        worker5.working("boring taks", 7);

    }

}
