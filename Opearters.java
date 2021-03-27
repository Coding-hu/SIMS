package SIMS;

import java.util.Scanner;
import java.util.Vector;

public class Opearters {
    Vector<Students> students=new Vector<Students>();
    //增加学生的信息
    Scanner input1=new Scanner(System.in);
    public void appendStudents(){
        Scanner input=new Scanner(System.in);
        String id,name,sex,grade,major;
        double [] score=new double[3];
        double avgs;
        System.out.print("请输入学生的学号，姓名，性别，年级，专业，英语成绩，数学成绩，专业成绩:");
        id=input.next(); name=input.next(); sex=input.next(); grade=input.next(); major=input.next();
        score[0]=input.nextDouble(); score[1]=input.nextDouble(); score[2]=input.nextDouble();
        Students stu=new Students(id,name,sex,grade,major,score);
        students.add(stu);
        System.out.println("成功!"+"现在有"+students.size()+"个学生");
        Thread.currentThread().interrupt();//停顿1s
    }
    public  void showStudentsInformation(){
        for (Students stu:students)
            stu.showStudentsInformation();
    }
    public void deleteStudents(){
        String stuid;
        System.out.print("请输入和你要删除学生的学号:");
        stuid=input1.nextLine();
       for (Students stu:students){
           if (stu.getId().equals(stuid))
              {
                  students.remove(stu);
                  System.out.println("删除成功"+"现在有"+students.size()+"个人");
                  return ;
              }

       }
       System.out.print("没有找到相关学生信息,请重新查找");
    }

    public  void searchStudents(){
        String stuid;
        System.out.print("请输入和你要查询学生的学号:");
        stuid=input1.nextLine();
        for (Students stu:students){
            if (stu.getId().equals(stuid))
            {
                System.out.println("查询成功!");
                String id="id",name="name",sex="sex",grade="grade",major="major";
                String english="english", math="math",profession="profession" ,average="average";
                System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s%-10s%-15s%-10s\n",
                        id,name,sex,grade,major,english,math,profession ,average );
                stu.showStudentsInformation();
                return ;
            }

        }
        System.out.println("没有找到相关同学的信息!");
    }

    public void remarkStudents(){
        String stuid;
        System.out.print("请输入和你要修改学生信息的学号:");
        stuid=input1.nextLine();
        for (Students stu:students){
            if (stu.getId().equals(stuid))
            {
               students.remove(stu);
               appendStudents();
            }

        }
    }
}
