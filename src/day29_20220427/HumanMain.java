package day29_20220427;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.
		HumanDTO human1 = new HumanDTO(1L,"로봇",12);
		HumanDTO human2 = new HumanDTO(2L,"로봇2",13);
		HumanDTO human3 = new HumanDTO(3L,"로봇3",14);
		HumanService hs = new HumanService();
		hs.save(human1);
		hs.save(human2);
		hs.save(human3);
		hs.findAll();
		//id 3인 사람의 이름을 자바왕 으로 바꾸자.
		
		hs.humanName(3L,"자바왕");
		System.out.println("---------------");
		//id가 1인 하나의 사람만 조회
		// 조회한 데이터는 Service에서 출력
		hs.findById(1L);
		//id가 1인 사람 삭제
		// 삭제 후 리스트를 가져와서 Service에서 출력
		hs.delete(1L);
		hs.findById(4L);
		
		HumanDTO human = new HumanDTO(3L,"로봇",12);
		hs.save(human); // 10개 라고 해서 10개의 서로다른객체를 생성을 하지 않아도 
						//1개의 객체만 가진 이 2줄에 값만 바꿔주면 여러개의 값을 넣어줄 수 있다.
		
		human= new HumanDTO(3L,"로봇3",14);
		hs.save(human);
		human= new HumanDTO(4L,"로봇3",14);
		hs.save(human);
		
	}

}
