
public class test {

	public static void main(String[] args) {
		
	
		// ++ 앞과 뒤에 넣는 것에 따른 차이점 학습하기 
		// 주의 사항 :  함수는 최대한 쪼개서 많이 만들기 한번에 다 넣어서 하지 않기
		// from FreeCodeCamp.org 
		
		
		//Principal:  100000
		//Annual Interest Rate : 3.92 
		//Period (years) : 30
		//Mortgage : $472.81
		//Process finished with exit code 
		
		Math.pow
		
		
		# marks1.py
		marks = [90, 25, 67, 45, 80]

		number = 0 
		for mark in marks: 
		    number = number +1 
		    if mark >= 60: 
		        print("%d번 학생은 합격입니다." % number)
		    else: 
		        print("%d번 학생은 불합격입니다." % number)
		
	
		Scanner scanner = new Scanner(System.in); 		
		System.out.println("몇월을 원하시는거죠?");         
		int month = scanner.nextInt();          
		scanner.close();          
		switch (month) {         
			case 1: System.out.println(month + "월은 겨울 입니다!");         
			case 2: System.out.println(month + "월은 겨울 입니다!");         
			case 3: System.out.println(month + "월은 봄 입니다!");          
			case 4: System.out.println(month + "월은 봄 입니다!");         
			case 5: System.out.println(month + "월은 봄 입니다!"); ;         
			case 6: System.out.println(month + "월은 여름 입니다!");         
			case 7: System.out.println(month + "월은 여름 입니다!");          
			case 8: System.out.println(month + "월은 여름 입니다!");          
			case 9: System.out.println(month + "월은 가을 입니다!");         
			case 10: System.out.println(month + "월은 가을 입니다!");          
			case 11: System.out.println(month + "월은 가을 입니다!");          
			case 12: System.out.println(month + "월은 겨울 입니다");          
			default: System.out.println("1~12의 값을 입력해 주세요");
		} 	}
			
		
		// 언어 모드 선택 프로그램
		// 사용자로부터 선택을 받아
		// 해당 언어 모드로 바꾸었다는 메시지 출력하기
		/*
		 * 1. 파이썬
		 * 2. 자바
		 * 3. C
		 * 4. JS
		 */
		
		// 메시지 선언
		String msg = "사용하고 싶은 언어를 고르세요.\n1.파이썬\n2.자바\n3.C\n4.JS";
		String pythonMsg="파이썬입니다.";
		String javaMsg = "자바입니다.";
		String cMsg = "C입니다.";
		String jsMsg = "JS입니다.";
		String errMsg = "다시 시도해주세요.";
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		// 메뉴 시작
		// 안내 메시지 출력 및 입력 받기
		System.out.println(msg);
		choice=sc.nextInt();
		// 모드 전환 메시지 출력하기
		switch(choice) {
		case 1:
			System.out.println(pythonMsg);
			break;
		case 2:
			System.out.println(javaMsg);
			break;
		case 3:
			System.out.println(cMsg);
			break;
		case 4:
			System.out.println(jsMsg);
			break;
		default:
			System.out.println(errMsg);
		}			
				
	
	}

}
