package com.victorsashnev.tema11.Ejer07;
import com.victorsashnev.tema11.LibMethods;
public class VipEntrance extends Entrance {
    private final String alfanumerico;
    int direrenttInt= 1;

    public String getAlfanumerico() {
        return alfanumerico;
    }

    public VipEntrance(Match match, Zone zone, int row,Seat seat,String alfanumerico){
        super(match,zone,row,seat);
        this.alfanumerico = alfanumerico;
        this.direrenttInt +=1;

    }

    protected String alfaNumRand(){
        String letter = "ABCDEFGHIJKLMNOPQRSTVWXYZ";
        String numbers = "1234567890";
        int num = 15;
        int choice;
        int letterRange;
        int numberRange;
        StringBuilder alfanumerico = new StringBuilder();
        for (int i = 0; i < num; i++){
            choice=LibMethods.randomNumeber(2,1);
            letterRange = LibMethods.randomNumeber(letter.length(),0);
            numberRange = LibMethods.randomNumeber(numbers.length(),0);
            if(choice == 2){
                alfanumerico.append(letter.charAt(letterRange));
            }else
                alfanumerico.append(numbers.charAt(numberRange));
        }
        alfanumerico.append(direrenttInt);
        return alfanumerico.toString();
    }
}
