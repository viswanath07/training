//add 2 binary numbers of string
import java.util.*;
class sums {
    public static void  main(String ar[])
    {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        String c=addBinary(a, b);
        System.out.println(c);
    }
    public static String addBinary(String a, String b) {
        String y="";
        int i,j,e,n=0,k=0,c,d;
        for(i=a.length()-1,j=b.length()-1;;i--,j--)
        {
            if(i<0&&j<0)
                break;
            c=i<0?0:(int)(a.charAt(i))-48;
            d=j<0?0:(int)(b.charAt(j))-48;
            e=c+d+n;
            if(e%2==0)
                y='0'+y;
            else
                y='1'+y;
            n=e>=2?1:0;
            
        }
        if(n==1)
          y='1'+y;
        return(y);    
    }
}
