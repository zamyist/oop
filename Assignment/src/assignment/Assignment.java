
package assignment;

import java.util.Scanner;

/**
 *
 * @author hcc
 */
public class Assignment {

    
    public static void main(String[] args) {
        
        Scanner zan = new Scanner(System.in);
        
       FullTimeEmploy one = new FullTimeEmploy ();
       PartTimeEmploy two = new PartTimeEmploy();
       
        System.out.println("1- fulltimeemploy");
        System.out.println("2- parttimeemploy");
        
        System.out.print("employtype : ");
        
        int input = zan.nextInt();
        
        if(input==1)
        {
            System.out.print("input your name : ");
            String name = zan.next();
            System.out.print("input your age : ");
            int age = zan.nextInt();
            System.out.print("enter monthly salary : ");
            double salary=zan.nextDouble();
            one.setName(name);
            one.setAge(age);
            one.setYearlySalary(salary);
            
            System.out.println("fulltime information : ");
            
            System.out.println("name      age      salary ");
            System.out.println("....      ...      ......");
            System.out.println(one.getName()+"      "+one.getAge()+"      "+one.getYearlySalary());
            
           
            
            
        
            
        }
        
        
        
        else if(input==2)
        {
            System.out.print("input your name : ");
            String name = zan.next();
            System.out.print("input your age : ");
            int age = zan.nextInt();
            System.out.print("enter working  Hour : ");
            double hour=zan.nextDouble();
            two.setName(name);
            two.setAge(age);
            two.setSalaryRate(hour);
            
            System.out.println("partTime Employ information : ");
            
            System.out.println("name      age      salary ");
            System.out.println("....      ...      ......");
            System.out.println(two.getName()+"      "+two.getAge()+"      "+two.getSalaryRate());
            
           
            
            
        }
        
       
        
        System.exit(0);
        
    }
    
}
