import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {

    @Test
    public void sortedRandomTest() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 7, 3, 9, 3, 8, 0, 2, 5));
        Main.mySort(list);
        
        boolean isSorted = true;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                isSorted = false;
            }
        }
        assertTrue("Failed on a list of random values.", isSorted);
    }

    @Test
    public void sortedAscendingTest() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Main.mySort(list);
        
        boolean isSorted = true;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                isSorted = false;
            }
        }
        assertTrue("Failed on a list of already sorted values.", isSorted);
    }

    @Test
    public void sortedSameTest() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1));
        Main.mySort(list);
        
        boolean isSorted = true;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                isSorted = false;
            }
        }
        assertTrue("Failed on a list where all values are equal.", isSorted);
    }

    @Test
    public void sortedDescendingTest() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        Main.mySort(list);
        
        boolean isSorted = true;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                isSorted = false;
            }
        }
        assertTrue("Failed on a list of descending values.", isSorted);
    }

    @Test
    public void sortedSingleTest() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1));
        Main.mySort(list);
        
        boolean isSorted = true;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                isSorted = false;
            }
        }
        assertTrue("Failed on a list of only one value.", isSorted);
    }
}