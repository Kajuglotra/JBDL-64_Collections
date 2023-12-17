package org.gfg;

import java.util.*;

public class SetKeyAnalyzerImpl implements KeyAnalyzer{

    Set<String> set;

    public SetKeyAnalyzerImpl(){
//        set = new HashSet<>();
//        set = new LinkedHashSet<>();
        set = new TreeSet<>(Comparator.reverseOrder());
    }
    @Override
    public void storeKeyword(String keyword) {
        set.add(keyword);
    }

    @Override
    public List<String> getAllKeyword() {
        List<String> list =new ArrayList<>(set);
        return list;
    }
}
