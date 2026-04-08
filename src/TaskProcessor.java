// [추상 클래스] 공통 데이터(작업명)와 생성자, 공통 메서드 관리
abstract class TaskProcessor implements Calculatable {
    protected String taskName;

    // 생성자: 하위 클래스로부터 이름을 받아 초기화
    public TaskProcessor(String taskName) {
        this.taskName = taskName;
    }

    // 공통 로직: 작업 시작 메시지 출력
    public void printTaskInfo() {
        System.out.println("[" + taskName + "] 연산을 시도합니다.");
    }
}