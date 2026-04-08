public class Main2 {
    public static void main(String[] args) {
        // 인터페이스 타입으로 구현체 객체 생성 (다형성)
        Calculatable myApp = new Calculator("계산기");

        System.out.println("--- 시스템 가동 ---");

        // 1. 정상 데이터 테스트
        System.out.println("최종 결과: " + myApp.execute("4"));
        System.out.println("---------------------------");

        // 2. 0 입력 테스트 (오류 반환)
        System.out.println("최종 결과: " + myApp.execute("0"));
        System.out.println("---------------------------");

        // 3. 문자 입력 테스트 (오류 반환)
        System.out.println("최종 결과: " + myApp.execute("Java"));

        System.out.println("--- 시스템 종료 ---");
    }
}