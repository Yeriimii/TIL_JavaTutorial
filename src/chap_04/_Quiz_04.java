package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int parkingTime = 10;  // 주차 시간
        boolean withDisabledPerson = true;  // 장애인 차량 여부
        boolean isSmallCar = false;  // 장애인 차량 여부
        int fee = parkingTime * 4000;

        if (fee > 30000) {  // 30000 원 초과 시 일일 최대 요금으로 수정
            fee = 30000;  // 일일 최대 요금 적용
        }
        if (withDisabledPerson || isSmallCar) {  // 경차 또는 장애인 차량인 경우 50% 할인
            fee *= 0.5f;  // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원 입니다.");
    }
}
