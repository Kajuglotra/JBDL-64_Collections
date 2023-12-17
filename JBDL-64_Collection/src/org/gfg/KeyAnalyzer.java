package org.gfg;

import java.util.List;
import java.util.Map;

public interface KeyAnalyzer {

    void storeKeyword(String keyword);

    List<String> getAllKeyword();

    default Map<String,Keyword> getKeysFrequencies(){
        return  null;
    }

    default Map<String, Integer> getTop5Records(){
        return null;
    }
}
