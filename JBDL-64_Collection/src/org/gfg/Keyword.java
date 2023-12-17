package org.gfg;

public class Keyword implements Comparable<Keyword>{
    private String key;

    private int count;

    public Keyword(String keyword, int count) {
        this.key = keyword;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Keyword k) {
        if(k.getCount() > this.getCount()){
            return 1;
        }else {
            return -1;
        }
    }
}
