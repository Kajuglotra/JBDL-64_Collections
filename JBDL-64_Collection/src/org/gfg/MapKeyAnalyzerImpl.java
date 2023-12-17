package org.gfg;

import java.security.Key;
import java.util.*;

public class MapKeyAnalyzerImpl implements KeyAnalyzer{

    public Map<String, Keyword> hmap ;

    public Queue<Keyword> queue;



    public MapKeyAnalyzerImpl(){
//        hmap = new HashMap<>();
//        hmap = new LinkedHashMap<>();
        hmap = new TreeMap<>();
        queue = new PriorityQueue<>(comparator);
        queue = new PriorityQueue<>(); // asc order will come out from queue;
    }

    // object of anonymous class
    Comparator<Keyword> comparator = new Comparator<Keyword>() {
        @Override
        public int compare(Keyword o1, Keyword o2) {
           if(o2.getCount() > o1.getCount()){
               return 1;
           }else {
               return -1;
           }
        }
    };
    @Override
    public void storeKeyword(String key) {
      int count =1;
        if(hmap.containsKey(key)){
            Keyword keyword = hmap.get(key);
            queue.remove(keyword);
            count = keyword.getCount();
            keyword.setCount(count+1);
            queue.add(keyword);
            hmap.put(key, keyword);
        }else {
           Keyword k =new Keyword(key, count);
           hmap.put(key, k);
           queue.add(k);
        }
    }

    @Override
    public List<String> getAllKeyword() {
        return null;
    }
    @Override
    public Map<String,Keyword> getKeysFrequencies(){
        return hmap;
    }

    @Override
    public Map<String, Integer> getTop5Records(){
        Map<String, Integer> topFive = new TreeMap<>();
        for(int i = 0; i< 4;i++){
            Keyword k = queue.poll();
            topFive.put(k.getKey(), k.getCount());
        }
        return topFive;
    }
}
