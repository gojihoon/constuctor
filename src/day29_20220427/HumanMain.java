package day29_20220427;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.
		HumanDTO human = new HumanDTO(1L,"로봇",12);
		HumanService hs = new HumanService();
		hs.save(human);
		hs.findAll();
		HumanDTO human1 = new HumanDTO(2L,"로봇2",13);
		hs.save(human1);
		System.out.println();
		//id가 1인 하나의 사람만 조회
		// 조회한 데이터는 Service에서 출력
		hs.findById(1L);
		//id가 1인 사람 삭제
		// 삭제 후 리스트를 가져와서 Service에서 출력
		hs.delete(1L);
	}

}
