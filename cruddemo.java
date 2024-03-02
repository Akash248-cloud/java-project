
import java.util.Scanner;
import java.util.*;

/*Author name:
 * akash kumar 
 * junior developer
 * // crud operation in using List (collection framework in java)
 * // project name simple create a  CRUD functionality on Employee
 * // my hobbies create something new 
 */
 class Employee 
{
    private int empno;
    private String empname;
    private int empsalary;

    public Employee(int empno , String empname , int empsalary)
    {
        this.empno=empno;
        this.empname=empname;
        this.empsalary=empsalary;  
    }

    public int getEmpid()
    {
        return empno;
    }
    public String getEmpname()
    {
        return empname;
    }
    public int getsalary()
    {
        return empsalary;
    }

   public String toString()
   {
      return empno +" "+ empname + "  " + empsalary;
   }

   

}

public class cruddemo
{
    public static void main(String []args)
    {
      List<Employee> c = new ArrayList<Employee>();
        Scanner s1 = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int ch ;
        do
        {
         System.out.println("1.Insert");
         System.out.println("2.display");
         System.out.println("3.search");
         System.out.println("4.delete");
         System.out.println("5.update");
         System.out.println("0. Quit the program.");
         System.out.print("Enter your choice:  ");
        ch=s.nextInt();

       switch(ch)
       {
         case 1:
         // add the data in list 
         System.out.print("Enter the Employe Number :");
         int eno = s.nextInt();
         System.out.print("Enter the Employe  Name :");
         String empname = s1.nextLine();
         System.out.print("Enter Employe salary:");
         int  salary = s.nextInt();

         c.add(new Employee(eno , empname , salary ));
         break;

         case 2:
         // display the record
         System.out.println("__________________________________");
        Iterator<Employee> i = c.iterator();
        while(i.hasNext())
        {
            Employee e = i.next();
            System.out.println(e);

        }
        
        System.out.println("____________________________________________");
        break;

        case 3:
        // search the data in record
        boolean found = false;
        System.out.print("Enter Employee to the search: ");
        int empno = s.nextInt();
        System.out.println("------------------------------");
        i = c.iterator();
        while(i.hasNext())
        {
            Employee e = i.next();
            if(e.getEmpid() == empno) {
                System.out.println(e);
                found = true;
            }
        }
 
          if(!found)
          {
            System.out.println("Record Not Found ! try again ..");
          }
          System.out.println("------------------------------");
          break;

          case 4:
          // delete the data in record
          found = false;
          System.out.print("Enter the Employe Number: for delete:");
          empno = s.nextInt();
          System.out.println("-------------------");
          i = c.iterator();
          while(i.hasNext())
          {
            Employee e = i.next();
            if(e.getEmpid()==empno)
           {
             i.remove();
             System.out.println(e);
              found = true;
           }

          }
          if(!found)
          {
            System.out.println("Record Not Found ! try again.. ");
          }
          else
          {
            System.out.println("Record is Deleted Successfully....");
          }

          System.out.println("---------------------");
          break;
         //// update the data in record
          case 5:
          found = false;
          System.out.print("Enter the Employe Number: for the Update:");
          empno = s.nextInt();
          System.out.println("-------------------");
          ListIterator<Employee>li = c.listIterator();
          while(li.hasNext())
          {
            Employee e = li.next();
            if(e.getEmpid() == empno)
           {
             System.out.print("Enter new employe Name: ");
             empname = s1.nextLine();

             System.out.print("Enter new salary:");
             salary = s.nextInt();

             li.set(new Employee(empno, empname, salary));
              found = true;
             

           }

          }
          if(!found)
          {
            System.out.println("Record Not FOund! try again.. ");
          }
          else
          {
            System.out.println("Record is updated Successfully....");
          }

          System.out.println("---------------------");
          break;

          

       }
       }while(ch!=0);

    }
}