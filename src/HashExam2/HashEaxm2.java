package HashExam2;
import java.util.Arrays;

/*
문제 : 전화번호 목
문제 설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.

입출력 예제
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
*/

public class HashEaxm2 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i = 0 ; i < phone_book.length; i++){
            for(int j = i + 1; j < phone_book.length; j++){
                if(phone_book[j].contains(phone_book[i])){
                    return false;
                }
            }
        }
        boolean answer = true;
        return answer;
    }
    
    public static void main(String args[]) {
    	String[] input = {"119", "97674223", "1195524421"};
    	String[] input2 = {"123", "456", "789"};
    	String[] input3 = {"12", "123", "1235", "567", "88"};
    	String[] input4 = {"119", "999119"};
    	
    	HashEaxm2 he = new HashEaxm2();
    	if(!he.solution(input)) {
    		System.out.println("접두어인 경우가 있다.");
    	}else {
    		System.out.println("접두어인 경우가 없다.");
    	}
    	
    	if(!he.solution(input2)) {
    		System.out.println("접두어인 경우가 있다.");
    	}else {
    		System.out.println("접두어인 경우가 없다.");
    	}
    	
    	if(!he.solution(input3)) {
    		System.out.println("접두어인 경우가 있다.");
    	}else {
    		System.out.println("접두어인 경우가 없다.");
    	}
    	
    	if(!he.solution(input4)) {
    		System.out.println("접두어인 경우가 있다.");
    	}else {
    		System.out.println("접두어인 경우가 없다.");
    	}
    	
    }
}
