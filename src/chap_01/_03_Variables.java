package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5;  // 정밀한 소수점 값일 때 사용.
        char grade = 'A';  // 작은 문자열은 작은 따옴표를 사용.
        name = "강백호";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;  // float은 숫자 뒤에 f or F를 입력해야함. 소수점 뒤 6자리만 출력된다.
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;  // long은 숫자 뒤에 l or L을 입력해야함. int 자료형은 +-21억 까지만 지원
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
