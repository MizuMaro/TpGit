package iut.tdd;

import java.util.HashMap;

public class Convert {

    public static final String ZERO = "zéro";
    public static final String UN = "un";
    public static final String DEUX = "deux";
    public static final String TROIS = "trois";
    public static final String QUATRE = "quatre";
    public static final String CINQ = "cinq";
    public static final String SIX = "six";
    public static final String SEPT = "sept";
    public static final String HUIT = "huit";
    public static final String NEUF = "neuf";
    public static final String DIX = "dix";
    public static final String ONZE = "onze";
    public static final String DOUZE = "douze";
    public static final String TREIZE = "treize";
    public static final String QUATORZE = "quatorze";
    public static final String QUINZE = "quinze";
    public static final String SEIZE = "seize";
    public static final String VINGT = "vingt";
    public static final String TRENTE = "trente";
    public static final String QUARANTE = "quarante";
    public static final String CINQUANTE = "cinquante";
    public static final String SOIXANTE = "soixante";

    public static final String CENT = "cent";
    public static final String CENTS = "cents";

    public static String num2text(String input) {

        HashMap<String, String> map = new HashMap();

        map.put("0", ZERO);
        map.put("1", UN);
        map.put("2", DEUX);
        map.put("3", TROIS);
        map.put("4", QUATRE);
        map.put("5", CINQ);
        map.put("6", SIX);
        map.put("7", SEPT);
        map.put("8", HUIT);
        map.put("9", NEUF);
        map.put("10", DIX);
        map.put("11", ONZE);
        map.put("12", DOUZE);
        map.put("13", TREIZE);
        map.put("14", QUATORZE);
        map.put("15", QUINZE);
        map.put("16", SEIZE);
        map.put("20", VINGT);
        map.put("30", TRENTE);
        map.put("40", QUARANTE);
        map.put("50", CINQUANTE);
        map.put("60", SOIXANTE);
        if (nbChiffre(input) == 0) {
            return map.get(input);
        } else if( nbChiffre(input) != 0){
            //
        }
        return map.get(input);
    }


public static int nbChiffre(String input) {
        if(input.length() == 1)
            return 0;
        return input.charAt(0);
    }  

    public static String text2num(String input) {
        return null;
    }
}
