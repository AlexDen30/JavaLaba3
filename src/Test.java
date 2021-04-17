import java.util.ArrayList;
import java.util.List;

/**
 * Класс для хранения информации о тесте
 */
public class Test {

    /**
     * имя метода, его описание
     */
    public String methodName;
    /**
     * колчество итераций этого метода
     */
    public int countOfIterations;

    /**
     * Для хранения времени исполнения метода
     * для <b>linkedList</b>
     * (будет выведено среднее время)
     */
    public ArrayList<Integer> timeOfExecutionLinked = new ArrayList<Integer>();
    /**
     * Для хранения времени исполнения метода
     * для <b>arrayList</b>
     * (будет выведено среднее время)
     */
    public ArrayList<Integer> timeOfExecutionArray = new ArrayList<Integer>();

    public Test() {
    }

    /**
     * Вывод информации о тесте в консоль
     */
    public void printTest() {
        int timeLink = 0;
        int timeArr = 0;

        for (int i = 0; i < timeOfExecutionArray.size(); i++) {
            timeArr += timeOfExecutionArray.get(i);
        }
        timeArr /= timeOfExecutionArray.size();

        for (int i = 0; i < timeOfExecutionLinked.size(); i++) {
            timeLink += timeOfExecutionLinked.get(i);
        }
        timeLink /= timeOfExecutionLinked.size();

        System.out.println("Method name:" + methodName + ", count of iterations:" +
                countOfIterations + ", time for linked list (average):"
                + timeLink + " ms, time for array list (average):" + timeArr + " ms");
    }


}
