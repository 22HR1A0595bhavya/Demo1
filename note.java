class Note{
private String name;
private String STD;
private String sec;
private int rollno;
private String sub;
public void setName(String name){this.name=name;}
public void setSTD(String STD){this.STD=STD;}
public void setSec(String sec){this.sec=sec;}
public void setRollno(int rollno){this.rollno=rollno;}
public void setSub(String sub){this.name=sub;}
public String getName(){return name;}
public String getSTD(){return STD;}
public String getSec(){return sec;}
public int getRollno(){return rollno;}
public String getSub(){return sub;}
}
class Note1
{
public static void main(String args[]){
Note N=new Note();
N.setName("BHAVYA");
N.setSTD("Btech");
N.setSec("CSE-B");
N.setRollno(595);
N.setSub("Java");
System.out.println("name:"+N.getName());
System.out.println("class:"+N.getSTD());
System.out.println("Sec:"+N.getSec());
System.out.println("Rollno:"+N.getRollno());
System.out.println("Sub:"+N.getSub());
}
}


