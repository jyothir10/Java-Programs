import java.util.Scanner; 
public class details{ 
public static void main(String[] args) { 
Officer a = new Officer(); 
a.input(); 
Manager b = new Manager(); 
b.input(); 
} 
} 
class Employee{ 
Scanner sc = new Scanner(System.in); 
String name,address; 
int age,phn_no,salary; 
void printSalary(){ 
System.out.println("Salary of the employee is: "+salary); } 
} 
class Officer extends Employee{ 
String specialisation; 
void input() { 
System.out.println("Enter the Officer name: "); 
name = sc.nextLine(); 
System.out.println("Enter the address of the Officer: "); address = sc.nextLine(); 
System.out.println("Enter the Officer age: "); 
age = sc.nextInt(); 
System.out.println("Enter the Officer phone no: "); 
phn_no = sc.nextInt(); 
System.out.println("Enter the salary of the Officer: "); salary = sc.nextInt(); 
display(); 
} 
void display() { 
System.out.println("\nOfficer Name: "+name); 
System.out.println("Officer Age: "+age); 
System.out.println("Officer phone no: "+phn_no); 
System.out.println("Officer Address: "+address); 
System.out.println("Officer Salary: "+salary); 
} 
} 
class Manager extends Employee{ 
String department; 
void input(){ 
System.out.println("\nEnter the Manager name: "); 
name = sc.nextLine(); 
System.out.println("Enter the address of the Manager: ");
address = sc.nextLine(); 
System.out.println("Enter the Manager age: "); 
age = sc.nextInt(); 
System.out.println("Enter the Manager phone no: "); 
phn_no = sc.nextInt(); 
System.out.println("Enter the salary of the Manager: "); salary = sc.nextInt(); 
display(); 
} 
void display() { 
System.out.println("\nManager Name: "+name); 
System.out.println("Manager Age: "+age); 
System.out.println("Manager phone no: "+phn_no); 
System.out.println("Manager Address: "+address); 
System.out.println("Manager Salary: "+salary); 
} 
}
