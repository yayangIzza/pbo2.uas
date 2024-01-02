public class yayangizzapbo_uas2 {

    public class Uaspbo2 {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            
            abstract class Employee {
        private String name;
    
        public Employee(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    
        public abstract double getSalary();
    }
    
    class Manager extends Employee {
    
                private final double salary;
        public Manager(String name, double salary) {
            super(name);
            this.salary = salary;
        }
    
        public double getSalary() {
            return salary;
        }
            }
    
    class Developer extends Employee {
    
                private final double salary;
        public Developer(String name, double salary) {
            super(name);
            this.salary = salary;
        }
    
        public double getSalary() {
            return salary;
        }
            }
    
    class Designer extends Employee {
    
                private final double salary;
        public Designer(String name, double salary) {
            super(name);
            this.salary = salary;
        }
    
        public double getSalary() {
            return salary;
        }
    
    }
        }
    }  
}
