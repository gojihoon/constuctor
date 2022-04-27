package day29_20220427;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {
	static List<PhoneDTO> phoneList = new ArrayList<>();
		//save할 때랑 findAll할 때 List가 총 2개 생성된다. 여기에 static을 쓰면 모든 객체가 메모리를 공유하게 되므로 List가 하나로 고정된다.
		//Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.

	void save(PhoneDTO phone) {
		System.out.println("PhoneRepository.save()");
		System.out.println(phone);
		phoneList.add(phone); // 가져온 phone을 phoneList에 추가
	}

	void findAll() {
		System.out.println("PhoneRepository.findAll()");
		for (PhoneDTO p : phoneList) {
			System.out.println(p);
		}
	}

	// findAll 메서드 정의
	// 리턴: phoneList
	List<PhoneDTO> findAll1() {
		return phoneList; // 리스트를 리턴하고 싶을 때는 리스트의 타입을 써주면 된다.
	}
}
