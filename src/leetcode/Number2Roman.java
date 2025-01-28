package leetcode;

public class Number2Roman {//completed
    public static void main(String[] args)
    {
        Number2Roman nr=new Number2Roman();
           System.out.println(nr.inttoRoman(1885));
    }
    public String inttoRoman(int no)
    {
        String[] th={"","M","MM","MMM"};
        String[] hu={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] ten={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] ones={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String s=th[no/1000]+hu[(no%1000)/100]+ten[(no%100)/10]+ones[no%10];
          return s;
    }

}
