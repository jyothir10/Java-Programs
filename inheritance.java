class inheritance{
    public static void main(String args[]){
        Engineer e = new Engineer();
        e.display();
        e.calcSalary();
    }
}
class Employee{
    void display(){
        System.out.println("Name of the class is Employee");
    }
    void calcSalary(){
        System.out.println("Salary of employee is 10000");
    }
}
class Engineer extends Employee{
    void calcSalary(){
        System.out.println("Salary of employee is 20000");
    }
}