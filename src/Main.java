import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Test [] tests = new Test[5];

        for (int i = 0; i<5 ;i++) {
            tests[i] = new Test();
        }

        List arrList = new ArrayList();
        List linkList = new LinkedList();
        long startTime, endTime;


        tests[0].methodName = "Insert into beginning";
        tests[0].countOfIterations = 10000;
        startTime = System.nanoTime();
        for (int i = 0; i<10000; i++) {
            arrList.add(0,i);
        }
        endTime = System.nanoTime();
        tests[0].timeOfExecutionArray = (endTime - startTime)/1000000;

        startTime = System.nanoTime();
        for (int i = 0; i<10000; i++) {
            linkList.add(0,i);
        }
        endTime = System.nanoTime();
        tests[0].timeOfExecutionLinked = (endTime - startTime)/1000000;

        tests[0].printTest();
    }

}
