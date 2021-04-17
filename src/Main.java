import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Test [] tests = new Test[8];
        TestMethods methods = new TestMethods();

        for (int i = 0; i<8 ;i++) {
            tests[i] = new Test();
        }

        List arrList = new ArrayList();
        List linkList = new LinkedList();
        long startTime, endTime;

        tests[0].methodName = "Insert into beginning";
        tests[0].countOfIterations = 10000;

        tests[1].methodName = "Insert into middle";
        tests[1].countOfIterations = 10000;

        tests[2].methodName = "Remove from the middle";
        tests[2].countOfIterations = 3000;

        tests[3].methodName = "Insert into the ending";
        tests[3].countOfIterations = 10000;

        tests[4].methodName = "Get from the middle";
        tests[4].countOfIterations = 2000;


        tests[5].methodName = "Get from the beginning";
        tests[5].countOfIterations = 2000;


        tests[6].methodName = "Get from the ending";
        tests[6].countOfIterations = 2000;

        tests[7].methodName = "Remove from the beginning";
        tests[7].countOfIterations = 3000;

        //Произведём вычисления несколько раз, для улучшения точности
        for (int j = 0; j<20; j++) {

            //Вставка в начало
            tests[0].timeOfExecutionArray.add(methods.addToBeginning(arrList, tests[0].countOfIterations));
            tests[0].timeOfExecutionLinked.add(methods.addToBeginning(linkList, tests[0].countOfIterations));


            //Вставка в середину
            tests[1].timeOfExecutionArray.add(methods.addToMiddle(arrList, tests[1].countOfIterations));
            tests[1].timeOfExecutionLinked.add(methods.addToMiddle(linkList, tests[1].countOfIterations));

            //Удаление из середины
            tests[2].timeOfExecutionArray.add(methods.deleteFromMiddle(arrList, tests[2].countOfIterations));
            tests[2].timeOfExecutionLinked.add(methods.deleteFromMiddle(linkList, tests[2].countOfIterations));

            //Вставка в конец
            tests[3].timeOfExecutionArray.add(methods.addToEnding(arrList, tests[3].countOfIterations));
            tests[3].timeOfExecutionLinked.add(methods.addToEnding(linkList, tests[3].countOfIterations));

            //Получение значения из середины
            tests[4].timeOfExecutionArray.add(methods.getFromMiddle(arrList, tests[4].countOfIterations));
            tests[4].timeOfExecutionLinked.add(methods.getFromMiddle(linkList, tests[4].countOfIterations));

            //Получение значения из начала
            tests[5].timeOfExecutionArray.add(methods.getFromBeginning(arrList, tests[5].countOfIterations));
            tests[5].timeOfExecutionLinked.add(methods.getFromBeginning(linkList, tests[5].countOfIterations));

            //Получение значения из конца
            tests[6].timeOfExecutionArray.add(methods.getFromEnding(arrList, tests[6].countOfIterations));
            tests[6].timeOfExecutionLinked.add(methods.getFromEnding(linkList, tests[6].countOfIterations));

            //Удаление из начала
            tests[7].timeOfExecutionArray.add(methods.deleteFromBeginning(arrList, tests[7].countOfIterations));
            tests[7].timeOfExecutionLinked.add(methods.deleteFromBeginning(linkList, tests[7].countOfIterations));


            linkList.clear();
            arrList.clear();
        }

        for (int i = 0; i < 8 ;i++) {
            tests[i].printTest();
        }
    }

}

