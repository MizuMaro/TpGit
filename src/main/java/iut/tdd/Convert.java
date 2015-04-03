package iut.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import sun.applet.Main;

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
        map.put("70", SOIXANTE);
        map.put("80", QUATRE+"-"+VINGT+"s");
        map.put("90", QUATRE+"-"+VINGT+"s");

        if (nbChiffre(input) == -1) {
            return map.get(input);
        }
        if (nbChiffre(input) == 0) {
            return map.get(input);
        } else if( nbChiffre(input) == 1){
            String resultat ="" ;
            resultat = map.get(input.charAt(0)+"0");
            if(input.charAt(1) == '1')
            resultat = resultat+" et " + map.get(""+input.charAt(1));
            else 
            resultat = resultat+"-" + map.get(""+input.charAt(1));
            return resultat;
        }
        return map.get(input);
    }


public static int nbChiffre(String input) {
        
        ArrayList<String> exception = new ArrayList<>();
        for(int i = 10; i <=16 ;i++){
            exception.add(i+"");
        }
        for (int i = 20; i <= 100 ; i=i+10){
            exception.add(i+"");
        }
       
        if(exception.contains(input))
            return -1;
        if(input.length() == 1)
            return 0;
        else
            return 1;
    }  

    public static String text2num(String input) {
        return null;
    }
}
