
public class Demo1 
{
  private String empname;
  private int empid,h1,b1;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getH1() {
	return h1;
}
public void setH1(int h1) {
	this.h1 = h1;
}
public int getB1() {
	return b1;
}
public void setB1(int b1) {
	this.b1 = b1;
}
  public int process()
  {
	  int v;
	  v=h1*b1;
	  return v;
  }
}
