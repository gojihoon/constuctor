package day29_20220427;

import java.util.List;

public class HumanService {
	static HumanRepository hr = new HumanRepository();
	List<HumanDTO> humanList = hr.findAll1();
	void save(HumanDTO human) {
		hr.save(human);
	}
	void findAll() {
		hr.findAll();
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}
	void findById(Long id) {
		System.out.println("넘어온 id값"+id);
		// Repository로 부터 id가 1L인 HumanDTO객체를 가져옴.
		HumanDTO human=hr.findById(id);
		System.out.println(human);
		
	}
	void delete(Long id) {
		HumanDTO human =hr.delete(id);
		System.out.println(human);
	}
}
