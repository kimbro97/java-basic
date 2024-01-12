package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }

    public void increment() {
        if (isMaxCount()) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    private boolean isMaxCount() {
        return count >= max;
    }

    public int getCount() {
        return count;
    }
}
