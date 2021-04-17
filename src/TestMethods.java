
import java.util.List;

public class TestMethods {

    public int addToBeginning(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i<countOfIterations; i++) {
            list.add(0,i);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }

    public int addToMiddle(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i<countOfIterations; i++) {
            list.add(list.size()/2+i,i);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }

    public int deleteFromMiddle(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i<countOfIterations; i++) {
            list.remove(list.size()/2);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }

    public int addToEnding(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i<countOfIterations; i++) {
            list.add(list.size(),i);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }

    public int getFromBeginning(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i<countOfIterations; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }

    public int getFromMiddle(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = list.size()/2; i<list.size()/2 + countOfIterations; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }

    public int getFromEnding(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = list.size()-countOfIterations; i< list.size(); i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }

    public int deleteFromBeginning(List list, int countOfIterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i<countOfIterations; i++) {
            list.remove(0);
        }
        long endTime = System.nanoTime();
        return (int) ((endTime - startTime)/1000000);
    }
}
