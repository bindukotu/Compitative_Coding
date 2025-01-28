package leetcode;

public class StringCompression {
    public static void main(String[] args) {
      // char[] c={'1','1','2'};
     // char[] c={'1', '2', '2'};
        // char[] c={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
                //char[] c={'a'};
       char[] c={'a','a','b','b','c','c','c'};
        System.out.println(compress(c));
    }
    public static int compress(char[] chars) {
        int index=0;
        int count=1;
        int len=chars.length;
        for(int i=0,j=1;j<len;){

               while(j<len && chars[i]==chars[j])
               {
                   count++;
                   j++;
               }
               chars[index++]=chars[i];
            System.out.println(count+" "+chars[i]);
               if(count>1){
                   for(char c:String.valueOf(count).toCharArray()){
                       chars[index++]=c;
                   }
               }
               i=j;
            count=0;
        }
        System.out.println(chars);
        return index;
    }
}
