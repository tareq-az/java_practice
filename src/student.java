public class student extends person{
    int roll;
    float cgpa;
        student(String name,int age,double weight,int roll,float cgpa){
            super.name=name;
            super.age=age;
            super.weight=weight;
            this.roll=roll;
            this.cgpa=cgpa;
        }
        void display(){
            System.out.println("Student name is: "+name);
            System.out.println("Student age is:"+age);
            System.out.println("student roll is:"+roll);
            System.out.println("student cgpa is: "+cgpa);
        }
}
