package hw2;

import java.sql.Date;

public class EmpVo {
	private int eno;
	private String ename;
	private int sal;
	private int comm;
	private Date hiredate;
	private String jumin;
	private int dno;
	private String position;
	private String addr;
	private int mgr;
	private String email;
	public EmpVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpVo(int eno, String ename, int sal, int comm, Date hiredate, String jumin, int dno, String position,
			String addr, int mgr, String email) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.comm = comm;
		this.hiredate = hiredate;
		this.jumin = jumin;
		this.dno = dno;
		this.position = position;
		this.addr = addr;
		this.mgr = mgr;
		this.email = email;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public String getHiredate() {
		return hiredate+"";
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
