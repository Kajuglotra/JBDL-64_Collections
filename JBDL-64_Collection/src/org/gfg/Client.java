package org.gfg;

public class Client {
    public static void main(String[] args) {
        KeyAnalyzer keyAnalyzer  = new MapKeyAnalyzerImpl();
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("mobile");
        keyAnalyzer.storeKeyword("laptop");
        keyAnalyzer.storeKeyword("hoodie");
        keyAnalyzer.storeKeyword("laptop");
        keyAnalyzer.storeKeyword("table");
        System.out.println(keyAnalyzer.getTop5Records());
    }
}
