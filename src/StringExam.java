
public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		// String은 기본 data type처럼 값을 바로 넣을 수 있다
		//이렇게 할 시에는 메모리의 상수들이 저장되는 공간에 저장이 된다
		// 같은 instance를 참조하게 된다면, 새로 만들지 않고 벌써 전에 쓰인 instance를 참조하게 된다
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		// String은 일반 클래스처럼 new를 사용해서 만들 수도 있다
		// new keyword가 쓰인다면 상수영역에 있는 instance를 참조하는 것이 아닌, 새로 힙(Heap) 영역에 만들게 된다
		
		if(str1 == str2) {
			// 기본형이 아닌 참조형에 == 표시가 사용될 경우, 실제 값을 비교하는 것이 아닌, 가리키는 주소를 비교하게 된다
			System.out.println("Str1과 Str2는 동일한 instance를 참조하고 있습니다");
		} else {
			System.out.println("Str1과 Str2는 동일한 instance를 참조하고 있지 않습니다");
		}
		
		if(str3 == str4) {
			System.out.println("Str3과 Str4는 동일한 instance를 참조하고 있습니다");
		} else {
			System.out.println("Str3과 Str4는 동일한 instance를 참조하고 있지 않습니다");
		}
	}
}
