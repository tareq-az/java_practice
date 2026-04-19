public class employee extends person{
    double salary;
    String post;
    int work_hour;
         employee(String name,int age,String post,double salary,int work_hour){
             super.name=name;
             super.age=age;
             this.post=post;
             this.salary=salary;
             this.work_hour=work_hour;

         }
         void display(){
             System.out.println("Employee name is: "+name);
             System.out.println("Employee age is: "+age);
             System.out.println("Employee post is: "+post);
             System.out.println("Employee salary is: "+salary);
             System.out.println("Employee work hour is: "+work_hour);

         }

}
