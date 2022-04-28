package day29_20220427;

import java.util.List;

public class HumanService {
	static HumanRepository hr = new HumanRepository();
	List<HumanDTO> humanList = hr.findAll1();

	void save(HumanDTO human) {
		hr.save(human);
	}

	void findAll() {
//		hr.findAll();
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	void findById(Long id) {
		System.out.println("넘어온 id값" + id);
		// Repository로 부터 id가 1L인 HumanDTO객체를 가져옴.
		HumanDTO human = hr.findById(id);
		//ystem.out.println(human);
		if(human==null) {
			System.out.println("조회결과가 없습니다.");
		}
		else {
			System.out.println(human);
		}
		System.out.println();
	}
	void delete(Long id) {
		humanList = hr.delete(id);
		for(HumanDTO d: humanList)
		System.out.println(d);
	}
	
	void humanName(Long id,String name) {
		humanList=hr.humanName(id, name);
		for(HumanDTO h: humanList) {
			System.out.println(h);
		}
	}
}
