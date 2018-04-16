package exam01;

import java.util.ArrayList;
import java.util.Calendar;

class Emp {
	private String name;
	private String id;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

}

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp("이현진", "920604-1"));
		list.add(new Emp("한상순", "920123-2"));
		list.add(new Emp("조성재", "921217-1"));
		list.add(new Emp("김종숙", "921224-2"));
		list.add(new Emp("양동훈", "930428-1"));
		list.add(new Emp("강서영", "940213-2"));
		list.add(new Emp("송명준", "910512-1"));
		list.add(new Emp("임연주", "930420-2"));
	
	
		//4월생일자에게 상품권을 주고자 한다
		//대상자의 이름을 출력하시오
		Calendar c = Calendar.getInstance();
		int thisMonth = c.get(Calendar.MONTH) + 1;
		int month;
		for(int i = 0; i < list.size(); i++) {
			month = Integer.parseInt(list.get(i).getId().substring(2, 4));
			if (month == thisMonth)
				System.out.println(list.get(i).getName() + "님 생일축하합니다.");
		}
	
		
		System.out.println(thisMonth + "월 생일자");
		for(Emp a : list) {
			String name = a.getName();
			String id = a.getId();
			
			int mo = Integer.parseInt(id.substring(2, 4));
			if(mo == thisMonth)
				System.out.println(name);
		}
		
	}
}