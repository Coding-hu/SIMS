package SIMS;

import java.util.Scanner;

public class Menu {
    Scanner input=new Scanner(System.in);
    public void menuOfStudents() {
        System.out.println("欢迎使用学生成绩管理系统--Java版");
        System.out.println("*************************************");
        System.out.println("1.添加学生信息");
        System.out.println("2.删除学生信息");
        System.out.println("3.修改学生信息");
        System.out.println("4.查询学生信息");
        System.out.println("5.显示学生信息");
        System.out.println("6.插入学生的信息");
        System.out.println("*************************************");
        boolean flag = true;
        Opearters opearters = new Opearters();
        while (flag) {
            System.out.print("请输入你的选择：");
            int choice = input.nextInt();
            while (choice < 1 || choice > 5) {
                System.out.print("输入选项有误,请重新输入:");
                choice = input.nextInt();
            }
            //  input.close();         //关闭输入流
            switch (choice) {
                case 1:
                    opearters.appendStudents();
                    break;
            case 2:
                opearters.deleteStudents();
                break;
            case 3:
                opearters.remarkStudents();
                break;
            case 4:
                opearters.searchStudents();
                break;
            case 5:
                String id="id",name="name",sex="sex",grade="grade",major="major";
                String english="english", math="math",profession="profession" ,average="average";
                System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s%-10s%-15s%-10s\n",
                   id,name,sex,grade,major,english,math,profession ,average );
                opearters.showStudentsInformation();
                break;
             default:
                    flag=false;
                    break;
            }
            String a;
            System.out.print("Do you want to do the next step?(Y/N):"); a=input.next();
            if (a=="NO"||a=="no") flag=false;
        }
    }
}
