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
		//HumanDTO human = new HumanDTO(); 이렇게 객체를 새로이 생성하는 것보다 null로 적는게 값이 없을 때도 적용되어 더 좋은 코드이다.
		HumanDTO human = null;//id=null, name=null, age=0 // 값을 찾을 때 값이 없어도 초깃값이 있는 상태라 
							//완전한 null이 아니라서 완전한 객체는 아니고 이름만 있는 상태이다. 
							//객체가 아니라 타입만 맞춰준 상태
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;
		//humanList.get(i).getId() : list에 담긴 id값
	}
	List<HumanDTO> delete(Long id) {
		for(int i=0; i<humanList.size(); i++) {
			if(id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
		return humanList;
	}
	List<HumanDTO> humanName(Long id,String name) {
		for(int i=0; i<humanList.size(); i++){
			if(id.equals(humanList.get(i).getId())) {
				humanList.get(i).setName(name);
			}
		}
		return humanList;
	}
}
