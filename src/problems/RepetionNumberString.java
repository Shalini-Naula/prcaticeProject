package problems;

public class RepetionNumberString {
    static String s="BBEEDDT";
    //output should be 3A3B2C2D2E
    public static void main(String args[])
    {
       char prev=s.charAt(s.length()-1);
       char curr = 0;
        int count=1;
        String op="";
        for(int i=s.length()-2;i>=-1;i--) {
            if (i == -1) {
                op = "" + count + prev + op;
                break;
            }


            curr=s.charAt(i);


         if(curr==prev)
         {
          count++;
         }

         else
         {
             op=""+count+prev+op;
             count=1;
             prev=curr;
         }


        }
        System.out.println(op);
    }
}
