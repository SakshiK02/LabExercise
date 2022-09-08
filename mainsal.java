import java.util.*;
class employeesal
{
     private String employeid;
     private String empname;
     private double basicsalary,HRA,sa,pf;
     public void read()
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the basic salary of an employee");
        basicsalary=scan.nextInt();
        calculate();
     }
     public void calculate()  //calculating all the parameters
     {
        HRA=0.5*basicsalary;
		sa = basicsalary * 75.0 / 100.0;
		pf = basicsalary*0.12;
     }
     public void display()  //displaying the calculating parameters
     {
        System.out.println("Employee basic salary :  "+basicsalary+"\n"+"HRA  :  "+HRA+"\n"+"Special Allowance : "+sa+"\n"+"Provident Fund : "+pf);
     }
 
}
class mainsal //main function
{
     public static void main(String args[])
     {
         employeesal employeobj=new employeesal();
         employeobj.read(); //calling read function
         employeobj.display(); //calling display function
     }
}