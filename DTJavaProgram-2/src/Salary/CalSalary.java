package Salary;

public class CalSalary
{
	private String empname;
	private int  empid,basic,hra,da;
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
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}

  public int calsalary()
  {
	  String empname;
	  int empid;
	  int f1,f2,f3,tot;
	  f1=basic;
	  f2=basic*hra/100;
	  f3=basic*da/100;
	  tot=f1+f2+f3;
	  return tot;
  }

}
