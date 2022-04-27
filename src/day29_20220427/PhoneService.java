package day29_20220427;

import java.util.ArrayList;
import java.util.List;

public class PhoneService {
	void save(PhoneDTO phone) {
		System.out.println("PhoneService.save()");
		System.out.println(phone); // 객체 자체를 호출하여 toString이 자동 호출되어 객체에 대한 정보를 문자열로 출력

		// phone 객체를 Repository의 save 메서드를 넘겨서 잘 넘어갔는지 syso 확인
		PhoneRepository pr = new PhoneRepository();
		pr.save(phone); // phone1을 phone으로 받았기 떄문에 phone1이 아니라 phone다
	}

	void findAll() {
		System.out.println("PhoneService.findAll()");

		PhoneRepository pr = new PhoneRepository(); 
		// 1.Repository에서 목록을 출력
		pr.findAll();
		System.out.println("------------------2");
		// 2.Repository에서 리스트를 가져와서 여기서 출력
		List<PhoneDTO> phoneList = pr.findAll1(); // List를 만든것이 아니라 타입을 맞춰준 것, Repository에 있는 List만 진짜 List이다. ,List도 주고
													// 받을 수 있다.
		System.out.println("PhoneService.findAll() for 문 ");
		for (PhoneDTO p : phoneList) {
			System.out.println(p);
		}

	}
}
