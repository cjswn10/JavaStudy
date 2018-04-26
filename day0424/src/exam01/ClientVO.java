package exam01;

public class ClientVO {
	private int cno;
	private String cname;
	private String cjumin;
	private String caddr;
	private String cphone;
	
	public ClientVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClientVO(int cno, String cname, String cjumin, String caddr, String cphone) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cjumin = cjumin;
		this.caddr = caddr;
		this.cphone = cphone;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCjumin() {
		return cjumin;
	}
	public void setCjumin(String cjumin) {
		this.cjumin = cjumin;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	
}
