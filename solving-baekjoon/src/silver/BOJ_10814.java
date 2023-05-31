package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10814 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Person> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int index = 1;
			
			for(Person item : list) {
				if(age == item.getAge()) {
					index++;
					break;
				}
			}
			
			Person p = new Person();
			p.setAge(age);
			p.setName(name);
			p.setIndex(index);
			
			list.add(p);
			
		}
		
		list.sort(Comparator.comparing(Person::getAge)
				.thenComparing(Person::getIndex)
		);
		
		for(Person item: list) {
			System.out.println(item.getAge() + " " + item.getName());
		}

	}

}

class Person {
	private int age;
	private String name;
	private int index;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
}
