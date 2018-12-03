package br.com.samuel.santana.quality.bug.principal;

import java.util.Collections;

public class TesteSpotBug {
    //Unused field
    //private int abc;

    private String ip = "127.0.0.1";

    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};

        //concatenates strings using + in a loop
        //String s = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < field.length; ++i) {
            sb.append(field[i]);
        }
        //Collections.emptyList();
        System.out.println(ip);
        System.out.println(sb);

    }

}
