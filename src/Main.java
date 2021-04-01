import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Test [] tests = new Test[8];

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
            startTime = System.nanoTime();
            for (int i = 0; i<10000; i++) {
                arrList.add(0,i);
            }
            endTime = System.nanoTime();
            tests[0].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 0; i<10000; i++) {
                linkList.add(0,i);
            }
            endTime = System.nanoTime();
            tests[0].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));

            //Вставка в середину
            startTime = System.nanoTime();
            for (int i = 0; i<10000; i++) {
                arrList.add(5000+i,i);
            }
            endTime = System.nanoTime();
            tests[1].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 0; i<10000; i++) {
                linkList.add(5000+i,i);
            }
            endTime = System.nanoTime();
            tests[1].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));

            //Удаление из середины
            startTime = System.nanoTime();
            for (int i = 0; i<3000; i++) {
                arrList.remove(arrList.size()/2);
            }
            endTime = System.nanoTime();
            tests[2].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 0; i<3000; i++) {
                linkList.remove(linkList.size()/2);
            }
            endTime = System.nanoTime();
            tests[2].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));

            linkList.clear();
            arrList.clear();

            //Вставка в конец
            startTime = System.nanoTime();
            for (int i = 0; i<10000; i++) {
                arrList.add(arrList.size(),i);
            }
            endTime = System.nanoTime();
            tests[3].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 0; i<10000; i++) {
                linkList.add(linkList.size(),i);
            }
            endTime = System.nanoTime();
            tests[3].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));


            //Получение значения из середины
            startTime = System.nanoTime();
            for (int i = 4000; i<6000; i++) {
                arrList.get(i);
            }
            endTime = System.nanoTime();
            tests[4].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 4000; i<6000; i++) {
                linkList.get(i);
            }
            endTime = System.nanoTime();
            tests[4].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));


            //Получение значения из начала
            startTime = System.nanoTime();
            for (int i = 0; i<2000; i++) {
                arrList.get(i);
            }
            endTime = System.nanoTime();
            tests[5].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 0; i<2000; i++) {
                linkList.get(i);
            }
            endTime = System.nanoTime();
            tests[5].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));

            //Получение значения из конца
            startTime = System.nanoTime();
            for (int i = 8000; i<10000; i++) {
                arrList.get(i);
            }
            endTime = System.nanoTime();
            tests[6].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 8000; i<10000; i++) {
                linkList.get(i);
            }
            endTime = System.nanoTime();
            tests[6].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));


            //Удаление из начала
            startTime = System.nanoTime();
            for (int i = 0; i<3000; i++) {
                arrList.remove(0);
            }
            endTime = System.nanoTime();
            tests[7].timeOfExecutionArray.add((int) ((endTime - startTime)/1000000));

            startTime = System.nanoTime();
            for (int i = 0; i<3000; i++) {
                linkList.remove(0);
            }
            endTime = System.nanoTime();
            tests[7].timeOfExecutionLinked.add((int) ((endTime - startTime)/1000000));

            linkList.clear();
            arrList.clear();
        }

        for (int i = 0; i < 8 ;i++) {
            tests[i].printTest();
        }
    }

}

