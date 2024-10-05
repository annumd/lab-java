import java.util.*;
class Employee {
String name;
double salary;
String phone;
String address;
int age;
public Employee(String name, int age, String phone, String address, double salary) {
this.name = name;
this.age = age;
this.phone = phone;
this.address = address;
this.salary = salary;
}
void printSalary(){
System.out.println("Salary: " + salary);
}
void putinfo(){
System.out.println("\nDisplaying Details of " + name);
System.out.println("Age: " + age);
System.out.println("Phone no: " + phone);
System.out.println("Address: " + address);
}
}
class Manager extends Employee {
String dept;
public Manager(String name, int age, String phone, String address, double salary, String dept) {
super(name, age, phone, address, salary);
this.dept = dept;
}
void putinfo() {
super.putinfo();
System.out.println("Department: " + dept);
}
}
class Officer extends Employee {
String spec;
public Officer(String name, int age, String phone, String address, double salary, String spec) {
super(name, age, phone, address, salary);
this.spec = spec;
}
void putinfo() {
super.putinfo();
System.out.println("Specialization: " + spec);
}
}
class EmployeeInheritance {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Manager Details:");
System.out.print("Enter Name: ");
String mName = sc.nextLine();
System.out.print("Enter Age: ");
int mAge = sc.nextInt();
sc.nextLine(); 
System.out.print("Enter Phone No: ");
String mPhone = sc.nextLine();
System.out.print("Enter Address: ");
String mAddress = sc.nextLine();
System.out.print("Enter Salary: ");
double mSalary = sc.nextDouble();
sc.nextLine(); 
System.out.print("Enter Department: ");
String dept = sc.nextLine();
Manager m = new Manager(mName, mAge, mPhone, mAddress, mSalary, dept);
System.out.println("\nEnter Officer Details:");
System.out.print("Enter Name: ");
String oName = sc.nextLine();
System.out.print("Enter Age: ");
int oAge = sc.nextInt();
sc.nextLine(); 
System.out.print("Enter Phone No: ");
String oPhone = sc.nextLine();
System.out.print("Enter Address: ");
String oAddress = sc.nextLine();
System.out.print("Enter Salary: ");
double oSalary = sc.nextDouble();
sc.nextLine(); 
System.out.print("Enter Specialization: ");
String spec = sc.nextLine();
Officer o = new Officer(oName, oAge, oPhone, oAddress, oSalary, spec);
m.putinfo();
m.printSalary();
o.putinfo();
o.printSalary();
}
};




OUTPUT

ubuntu@ubuntu-H81M-S:~/SCS1051123$ javac EmployeeInheritance.java
ubuntu@ubuntu-H81M-S:~/SCS1051123$ java EmployeeInjeritance
Error: Could not find or load main class EmployeeInjeritance
Caused by: java.lang.ClassNotFoundException: EmployeeInjeritance
ubuntu@ubuntu-H81M-S:~/SCS1051123$ java EmployeeInheritance
Enter Manager Details:
Enter Name: sebastian
Enter Age: 67
Enter Phone No: 123456789
Enter Address: kochi
Enter Salary: 89000
Enter Department: civil

Enter Officer Details:
Enter Name: annu
Enter Age: 55
Enter Phone No: 123456789
Enter Address: kodali
Enter Salary: 56000
Enter Specialization: cs

Displaying Details of sebastian
Age: 67
Phone no: 123456789
Address: kochi
Department: civil
Salary: 89000.0

Displaying Details of annu
Age: 55
Phone no: 123456789
Address: kodali
Specialization: cs
Salary: 56000.0
ubuntu@ubuntu-H81M-S:~/SCS1051123$ 
