package day29_20220427;

import java.util.List;

public class PhoneMain {

	public static void main(String[] args) {
		// 새로운 Phone 등록, => List에 저장(List는 Repository가 가지고 있음.)
		PhoneDTO phone1 = new PhoneDTO(1L, "아이폰", "123-123", 1000000);
		// Main>(DTO)>Service
		// Service 클래스에 phone1 객체를 넘기기위해 Service 객체를 만들고
		PhoneService phoneService = new PhoneService();
		// Service 클래스가 가지고 있는 save 메서드 호출(phoneDTO를 매개변수로 하는 메서드)
		phoneService.save(phone1);

		// 직접 넘기기
		Long id = 2L;
		String modelName = "갤럭시노트";
		String modelNumber = "1111-2222";
		int price = 220000;
		// 상자에 담아서 넘기기(DTO) vs 물건한개씩 옮기기 /어느게 더 효율적일까?
		// phoneService.save(phone1);
		// phoneService.save(id, modelName, modelNumber, price);
		System.out.println("--------------1");
		// list 에 담긴 전체 데이터 조회
		phoneService.findAll();

		PhoneDTO phone2 = new PhoneDTO(2L, "어른폰", "323-323", 2000000);
		phoneService.save(phone2);
		phoneService.findAll();
	}

}
