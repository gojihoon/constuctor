package day28_20220426;

import java.util.*;


public class ArraListEx {

	public static void main(String[] args) {
		//String 객체를 담기위한 ArrayList
		List<String> list1 = new ArrayList<>();
		// 저장: add 메서드 호출,리턴타입: boolean
		list1.add("hello"); // 해당 타입에 맞게
		list1.add("hihi");
		list1.add(1,"kkkk");
		list1.add(1,"oooo");//add(특정 인덱스번호,담고자하는 내용) 값을 덮어쓰지 않고 밀어냄
		//꺼내기: get 메서드 호출
		System.out.println(list1.get(0)); //get(index값)
		System.out.println(list1.get(1)); 
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		// 크기확인: size 메서드
		System.out.println(list1.size()); //총 몇개의 데이터가 들어있는지 알려줌
		//삭제: remove 메서드
		System.out.println(list1.get(1));
		list1.remove(1);//index 1 제거,특정 인덱스를 입력하면 해당 인덱스가 지워짐, 삭제가 되면 인덱스가 땡겨짐
		System.out.println(list1.get(1));
		//모든 값 삭제: clear 메서드
		list1.clear();
		System.out.println("-----------------");
		// for문을 이용하여 list에 담긴 내용 모두 출력하기
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		//for each
		for(String a: list1) {
			System.out.println(a);
		}
		// 정수를 담는 list 
		//Wrapper Class 래퍼클래스 랩:감싸는 것
		//int는 그냥 선언해도 초깃값이 0이고 Wrapper Class의 초깃값은 Null이다.
		//int-Integer,long-Long, double-Double, boolean-Boolean
		List<Integer> list2 = new ArrayList<>();//int는 클래스가 아니라 타입명이라 안된다.
		list2.add(10);
		list2.add(20);
		System.out.println(list2.get(0));
		System.out.println("--------------");
		for(Integer num: list2) {
			System.out.println(num);
		}
	}

}
