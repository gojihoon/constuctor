package day29_20220427;

import java.util.ArrayList;
import java.util.List;

public class HumanRepository {
	static List<HumanDTO> humanList = new ArrayList<>();

	void save(HumanDTO human) {
		humanList.add(human);
	}

	void findAll() {
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	List<HumanDTO> findAll1() {
		return humanList;
	}

	// id값과 일치하는 객체를 찾음.
	// 한명의 정보를찾아야 하기 때문에 리턴할 때 HumanDTO 객체가 필요
	HumanDTO findById(Long id) {
		HumanDTO human = new HumanDTO();
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;
		//humanList.get(i).getId() : list에 담긴 id값
	}
	HumanDTO delete(Long id) {
		HumanDTO human = new HumanDTO();
		for(int i=0; i<humanList.size(); i++) {
			if(id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
				human = humanList.get(i);
			}
		}
		return human;
	}
}
