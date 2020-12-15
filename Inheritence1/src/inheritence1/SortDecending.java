package inheritence1;

import java.util.Comparator;

public class SortDecending implements Comparator<Integer>{

    
    //Compare använder ett sätt att jämföra skillnaden mellan tal i par för att sortera, om du ändrar vilket tal som ska subtrahera vilket kan du ändra ordningen: Stigande/Fallande
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

}
