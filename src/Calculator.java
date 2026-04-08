// 추상 클래스를 상속받아 실제 기능을 완성하는 구현 클래스
public class Calculator extends TaskProcessor {

    // 생성자: 부모 클래스의 생성자를 호출(super)
    public Calculator(String name) {
        super(name);
    }

    @Override
    public String execute(String input) {
        printTaskInfo(); // 부모 클래스의 메서드 활용

        try {
            // 1. 문자열 -> 정수 변환 (실패 시 NumberFormatException)
            int value = Integer.parseInt(input);

            // 2. 0 나누기 수동 체크 (실수 연산의 Infinity 방지)
            if (value == 0) {
                throw new ArithmeticException();
            }

            // 3. 정상 산술 연산 수행
            double result = 100.0 / value;
            return String.valueOf(result);

        } catch (NumberFormatException e) {
            System.out.println("[시스템] 입력 형식이 잘못되었습니다.");
            return "오류";
        } catch (ArithmeticException e) {
            System.out.println("[시스템] 0으로 나눌 수 없습니다.");
            return "오류";
        } finally {
            // 성공/실패 여부와 상관없이 무조건 실행
            System.out.println("> 처리 완료");
        }
    }
}