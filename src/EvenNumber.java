public class EvenNumber {
    int number;
    int sumResult = 0;

    public int getListOfEvenNumber() {
        do {
            number += +2;
            System.out.println (number);
            sumResult = sumResult + number;
        } while (number < 100);

        return sumResult;
    }
}

