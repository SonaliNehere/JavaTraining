package p;
import java.util.*;
import java.io.*;
abstract class cellularplan {
    protected double rate;
    abstract void getRate();
    public void processBill(int minutes){
           System.out.println(minutes*rate);
    }
}
 
/*public */ class abcNetwork extends cellularplan{
    public void getRate(){
           rate=1.50;
   }
}
 
/*public */ class pqrNetwork extends cellularplan{
    public void getRate(){
           rate=1.75;
    }
}
 
/*public */ class xyzNetwork extends cellularplan{
    public void getRate(){
         rate=1.50;
    }
}
 
/*public */ class SelectNetworkFactory {
    public cellularplan getPlan(String planType){
         if(planType == null){
                 return null;
         }
         if(planType.equalsIgnoreCase("abcNetwork")) {
                 return new abcNetwork();
         }
         else if(planType.equalsIgnoreCase("xyzNetwork")){
                 return new xyzNetwork();
         }
         else if(planType.equalsIgnoreCase("pqrNetwork")) {
                 return new pqrNetwork();
         }
    return null;
    }
}
 
public class Demo {
 
    public static void main(String[] args)  throws IOException{
 
        SelectNetworkFactory planFactory = new SelectNetworkFactory();
        System.out.print("Enter the name of network for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        String networkName=br.readLine();
        System.out.print("Enter the number of minutes for bill will be calculated: ");
        int minutes=Integer.parseInt(br.readLine());
        cellularplan p = planFactory.getPlan(networkName);
        System.out.print("Bill amount for "+networkName+" of "+minutes+" units is: ");
        p.getRate();
        p.processBill(minutes);
 
    }
 
}

