package exam02;

public class EmpVO {
	private int eno;
	private String ename;
	private int dno;
	private int esal;
	private String elevel;
	private String ejumin;
	private String eaddr;
	private String ehiredate;
	
	public EmpVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmpVO(int eno, String ename, int dno, int esal, String elevel, String ejumin, String eaddr,
			String ehiredate) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dno = dno;
		this.esal = esal;
		this.elevel = elevel;
		this.ejumin = ejumin;
		this.eaddr = eaddr;
		this.ehiredate = ehiredate;
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getElevel() {
		return elevel;
	}
	public void setElevel(String elevel) {
		this.elevel = elevel;
	}
	public String getEjumin() {
		return ejumin;
	}
	public void setEjumin(String ejumin) {
		this.ejumin = ejumin;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getEhiredate() {
		return ehiredate;
	}
	public void setEhiredate(String ehiredate) {
		this.ehiredate = ehiredate;
	}
	
	
}
