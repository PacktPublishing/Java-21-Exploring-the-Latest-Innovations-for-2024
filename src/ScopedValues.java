public class ScopedValues {
    public static void main(String[] args) throws InterruptedException {
        // 2. Run the task with the ScopedValue the value is "Hola mundo"
        // The value is only accessible by the thread that runs the task
        // the runWhere method will create a new scope and set the value to the
        // ScopedValue
        // ScopedValue.runWhere(Task.VALUE , "Hola mundo", () -> { // this is a Runnable

        // //3. Run the task - in this runnable the value is "Hola mundo"
        // new Task().doTask();
        // });

        // Next step: Scoped value with Virtual Thread
        Thread.startVirtualThread(() -> ScopedValue.runWhere(
                Task.VALUE, "Hello From VThread", () -> new Task().doTask()));

        Thread.sleep(1000); // Giving the thread time to print to the console
    }
}

class Task {
    final static ScopedValue<String> VALUE = ScopedValue.newInstance();

    public void doTask() {

        System.out.println("Task: " + VALUE.get());
    }
}
