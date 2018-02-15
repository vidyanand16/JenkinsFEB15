package JenkinsJobFeb16.HelloJenkins;

public class SonarOne {
   static int empID;
   static int age;
   static double salary;
   static double vpay;
   
   public static void main(String[] args){
	   SonarOne s1= new SonarOne();
	   SonarOne.empID=1002;
	   s1.age=32;
	   s1.salary=1234.25;
	   s1.vpay=123.21;
	   System.out.println("Employee ID is " + empID);
	   System.out.println("Employee age is " + age);
	   System.out.println("Employee salary is " + salary);
	   System.out.println("Employee variable pay is " + vpay);
   }
}
