public class EvenNumber {
    int x;
    int y = 0;

    public int getListOfEvenNumber() {
        do {
            x += +2;
            System.out.println (x);
            y = y + x;
        } while (x < 100);

        return y;
    }
}

