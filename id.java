class Employe{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private int adharno;
public void setCollege_name(String college_name){this.college_name=college_name;}
public void setCollege_address(String college_address){this.college_address=college_address;}
public void setAy_start(int ay_start){this.ay_start=ay_start;}
public void setAy_end(int ay_end){this.ay_end=ay_end;}
public void setId(int id){this.id=id;}
public void setStudent_name(String student_name){this.student_name=student_name;}
public void setCourse_name(String course_name){this.course_name=course_name;}
public void setAdharno(int adharno){this.adharno=adharno;}
public String getCollege_name(){return college_name;}
public String getCollege_address(){return college_address;}
public int getAy_start(){return ay_start;}
public int getAy_end(){return ay_end;}
public int getId(){return id;}
public String getStudent_name(){return student_name;}
public String getCourse_name(){return course_name;}
public int getAdharno(){return adharno;}

}

class BCA3{
public static void main(String args[])
{
Employe ob=new Employe();
ob.setCollege_name("MTIET");
ob.setCollege_address("Palamaner");
ob.setAy_start(2023);
ob.setAy_end(2023);
ob.setId(27741);
ob.setStudent_name("BHAVYASRI");
ob.setCourse_name("CSE");
ob.setAdharno(7737);
System.out.println("College_name:"+ob.getCollege_name());
System.out.println("College_address:"+ob.getCollege_address());
System.out.println("Ay_start"+ob.getAy_start());
System.out.println("Ay_end"+ob.getAy_end());
System.out.println("Id:"+ob.getId());
System.out.println("Student_name:"+ob.getStudent_name());
System.out.println("Course_name:"+ob.getCourse_name());
System.out.println("Adharno:"+ob.getAdharno());
}
}
