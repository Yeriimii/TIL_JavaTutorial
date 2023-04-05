package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반목문 for

        // 반복문 이용 For
        for ( int i = 0; i < 10; i++ ){
            System.out.println("어서오세요. 나코입니다. #" + i);
        }

        // 짝수만 출력 (for i 만 적고 엔터)
        // 0, 2, 4, 6, 8
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        // 홀수만 출력
        // 1, 3, 5, 7 ,9
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        // 거꾸로 숫자 출력
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // 1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }
}
