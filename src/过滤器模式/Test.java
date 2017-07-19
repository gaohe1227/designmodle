package ������ģʽ;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ʼ������
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("��һ", "FEMALE", "MARRIED"));
		persons.add(new Person("�˶�", "MALE", "MARRIED"));
		persons.add(new Person("����", "MALE", "SINGLE"));
		persons.add(new Person("����", "FEMALE", "MARRIED"));
		persons.add(new Person("����", "MALE", "SINGLE"));
		persons.add(new Person("����", "FEMALE", "SINGLE"));
		persons.add(new Person("����", "MALE", "SINGLE"));
		persons.add(new Person("�ް�", "MALE", "MARRIED"));
		persons.add(new Person("����", "FEMALE", "SINGLE"));
		persons.add(new Person("ʷʮ", "FEMALE", "SINGLE"));
		// ��ӡ���������Ե���Ϣ
		System.out.println("---------------------��������jdk8---------------------");
		Long countFemale=	persons.stream().filter(person->person.getGender().equalsIgnoreCase("male")).count();
		System.out.println(countFemale);
		System.out.println("---------------------��������jdk8---------------------");
		List<Person> maleList = new CriteriaMale().meetCriteria(persons);
		printList(maleList);
		List<Person> maleList1=	persons.stream().filter(person->person.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());
		System.out.println("---------------------��������---------------------");
		printList(maleList1);
		// ��ӡ������Ů�Ե���Ϣ
		System.out.println("--------------------����Ů��-------------------");
		List<Person> marriedFemaleList = new CriteriaFemale().meetCriteria(persons);
		printList(marriedFemaleList);
		// ��ӡ������������Ů�Ե���Ϣ
		System.out.println("-------------------���е�������------------------");
		List<Person> singleOrFemaleList = new FilterAnd(new CriteriaMale(), new SingleFilter()).meetCriteria(persons);
		printList(singleOrFemaleList);
	
		
		
	}

	// ��ӡ�б��е�������Ϣ
	private static void printList(List<Person> list) {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

}
