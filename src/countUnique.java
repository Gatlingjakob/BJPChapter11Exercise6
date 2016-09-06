import java.util.*;


/**
 * Created by Jakob on 31-08-2016.
 */
public class countUnique {

    public static void main (String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));

        System.out.println(countUniques(list));


    }
    public static int countUniques (ArrayList<Integer> list){


        int uniques = 0;
        Set<Integer> set= new HashSet<Integer>();

        for (int i = 0; i < list.size(); i++){

            int element = list.get(i);
            set.add(element);
        }

        uniques= set.size();

        return uniques;

    }




}

