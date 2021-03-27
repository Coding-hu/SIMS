package SIMS;

public class Students {
   private String id;    //学生的学号
   private String name; //学生姓名
   private String sex;  //学生性别
   private String grade; //学生所处班级
   private String major; //学生的专业
   private double [] score =new double[3];
   private double avgs;
   //构造函数
   Students(String id,String name,String sex,String grade,String major,double score[]){
       this.id=id; this.name=name; this.sex=sex;  this.grade=grade;this.major=major;
       double sum=0;
       for (int i=0;i<score.length;i++) {
           this.score[i]=score[i];
           sum+=score[i];
       }
       this.avgs=sum/score.length;
   }
   //输出学生的信息
   public void showStudentsInformation(){
       System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10.2f%-10.2f%-15.2f%-10.2f",id,name,sex,grade,major,
               score[0],score[1],score[2],avgs);
       System.out.println();
    }

    public String getId(){return  id;}
    public String getName(){return name;}
    public String getSex(){return sex;}
    public String getGrade(){return grade;}
    public String getMajor(){ return major;}
    public double[] getScore(){return score;}
    public double getAvgs(){return avgs;}
}
