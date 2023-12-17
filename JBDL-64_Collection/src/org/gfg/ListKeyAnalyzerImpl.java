package org.gfg;

import java.util.ArrayList;
import java.util.List;

public class ListKeyAnalyzerImpl implements KeyAnalyzer {

    List<String> list;

    public ListKeyAnalyzerImpl(){
        list = new ArrayList<>();
    }
    @Override
    public void storeKeyword(String keyword) {
        list.add(keyword);
    }

    @Override
    public List<String> getAllKeyword() {
        return list;
    }
}
