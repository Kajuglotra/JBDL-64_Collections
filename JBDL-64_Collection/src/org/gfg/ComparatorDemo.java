package org.gfg;

import java.security.Key;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Keyword> {

    @Override
    public int compare(Keyword o1, Keyword o2) {
        if(o2.getCount() > o1.getCount()){
            return 1;
        }
        else {
            return  -1;
        }
    }
}
