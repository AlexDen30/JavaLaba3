

public class Test {

    public String methodName;
    public int countOfIterations;
    public long timeOfExecutionLinked;
    public long timeOfExecutionArray;

    public Test(String methodName, int countOfIterations,
                long timeOfExecutionLinked, long timeOfExecutionArray) {
        this.methodName = methodName;
        this.countOfIterations = countOfIterations;
        this.timeOfExecutionLinked = timeOfExecutionLinked;
        this.timeOfExecutionArray = timeOfExecutionArray;
    }

    public Test() {
    }

    public void printTest() {
        System.out.println("Method name:" + methodName + ", count of iterations:" +
                countOfIterations + ", time for linked list:"
                + timeOfExecutionLinked + ", time for array list:" + timeOfExecutionArray);
    }
}
