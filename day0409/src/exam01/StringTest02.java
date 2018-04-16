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
		list.add(new Emp("������", "920604-1"));
		list.add(new Emp("�ѻ��", "920123-2"));
		list.add(new Emp("������", "921217-1"));
		list.add(new Emp("������", "921224-2"));
		list.add(new Emp("�絿��", "930428-1"));
		list.add(new Emp("������", "940213-2"));
		list.add(new Emp("�۸���", "910512-1"));
		list.add(new Emp("�ӿ���", "930420-2"));
	
	
		//4�������ڿ��� ��ǰ���� �ְ��� �Ѵ�
		//������� �̸��� ����Ͻÿ�
		Calendar c = Calendar.getInstance();
		int thisMonth = c.get(Calendar.MONTH) + 1;
		int month;
		for(int i = 0; i < list.size(); i++) {
			month = Integer.parseInt(list.get(i).getId().substring(2, 4));
			if (month == thisMonth)
				System.out.println(list.get(i).getName() + "�� ���������մϴ�.");
		}
	
		
		System.out.println(thisMonth + "�� ������");
		for(Emp a : list) {
			String name = a.getName();
			String id = a.getId();
			
			int mo = Integer.parseInt(id.substring(2, 4));
			if(mo == thisMonth)
				System.out.println(name);
		}
		
	}
}