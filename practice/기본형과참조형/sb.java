package 기본형과참조형;
public class sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 문자열 추가
        System.out.println(sb.append("bbb")); // bbb
        System.out.println(sb.append(4)); // bbb4
        System.out.println(sb.append("aaa")); // bbb4aaa

        // 문자열 삽입
        System.out.println(sb.insert(2, "C")); // bbCb4aaa
        
        // 문자열 치환, 문자열 교체
        System.out.println(sb.replace(3, 4, "y")); // bbCy4aaa
        System.out.println(sb.replace(1, 4, "HH")); // bHH4aaa

        // 문자열 자르기
        System.out.println(sb.substring(5)); // aa
        System.out.println(sb.substring(3, 5)); // 4a

        // 문자 삭제
        System.out.println(sb.deleteCharAt(3)); // bHHaaa

        // 문자열 삭제
        System.out.println(sb.delete(3, sb.length())); // bHH

        // 문자열 변환
        System.out.println(sb.toString()); // bHH

        // 문자열 뒤집기
        System.out.println(sb.reverse()); // HHb

        // 문자 대체, 문자 교체, 문자 치환
        sb.setCharAt(1, '1');
        System.out.println(sb); // H1b

        // 문자열 길이 조정
        sb.setLength(2);
        System.out.println(sb); // H1
        
        sb.setLength(6);
        System.out.println(sb); // H1     
        
    }
}
