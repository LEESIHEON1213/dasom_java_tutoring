public class Main {
    public static void main(String[] args) {
        System.out.println("--- 데이터 처리 시작 ---");
        System.out.println("기준값: " + DataStorage.threshold);

        // 1. 반복문 (for-each)을 사용하여 배열 순회
        for (int num : DataStorage.numbers) {

            // 2. 조건문 (if-else) 사용
            if (num >= DataStorage.threshold) {
                // 3. 연산자 사용 (산술 연산자 +)
                int doubled = num * 2;
                System.out.println("[PASS] " + num + " -> 2배 연산 결과: " + doubled);
            } else {
                // 산술 연산자 (-) 및 비교 연산자 사용
                int gap = DataStorage.threshold - num;
                System.out.println("[FAIL] " + num + " -> 기준값보다 " + gap + " 작습니다.");
            }
        }

        // 4. 추가 반복문 (while)과 복합 대입 연산자 예시
        int index = 0;
        int totalSum = 0;

        while (index < DataStorage.numbers.length) {
            totalSum += DataStorage.numbers[index]; // 복합 대입 연산자 (+=)
            index++; // 증감 연산자 (++)
        }

        System.out.println("-----------------------");
        System.out.println("배열 요소 전체 합계: " + totalSum);
    }
}