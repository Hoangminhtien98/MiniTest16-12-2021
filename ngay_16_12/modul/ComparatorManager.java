package Minitest.ngay_16_12.modul;

import java.util.Comparator;

public class ComparatorManager implements Comparator<Person> {
    public ComparatorManager(){
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            if (((Student) o1).getAveragePoint() > ((Student) o2).getAveragePoint()) {
                return -1;
            } else if (((Student) o1).getAveragePoint() < ((Student) o2).getAveragePoint()) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
