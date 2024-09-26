public class ScopedValueUseCase {
    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() -> ScopedValue.runWhere(
                CurrentUser.USER, "Paulo", () -> new TaskDefinition().runTaskDefinition()));
        Thread.sleep(1000);
    }

}

class CurrentUser {
    public final static ScopedValue<String> USER = ScopedValue.newInstance();

}

class TaskDefinition {

    public void runTaskDefinition() {
        Step step = new Step();
        step.runStep();
    }
}

class Step {

    void runStep() {
        System.out.println("Current user: " + CurrentUser.USER.get());
    }
}
