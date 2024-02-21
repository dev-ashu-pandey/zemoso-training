import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment3 {

    public static float medianTimeToPing(String host,int n){
        ArrayList<Integer> pingTimeArray=new ArrayList<>();
        try{
            Process process=Runtime.getRuntime().exec("ping -n "+n+" "+host);
            BufferedReader br=new BufferedReader(new InputStreamReader(process.getInputStream()));
            String inputLine;
            while((inputLine = br.readLine())!=null){
//                System.out.println("Line1 "+inputLine);
                if(inputLine.contains("time=")){
                    int startInd=inputLine.indexOf("time=")+5;
                    int lastInd=inputLine.indexOf("ms");
                    String time=inputLine.substring(startInd,lastInd);
//                    System.out.println("Time"+time);
                    pingTimeArray.add(Integer.parseInt(time));
                }
            }
        }catch (IOException e){
            System.out.println(e);
        }
        Collections.sort(pingTimeArray);
        System.out.println(pingTimeArray.toString());
        float median=-1;
        if(pingTimeArray.size()%2==0){
            median= (float) (pingTimeArray.get((pingTimeArray.size() / 2) - 1)
                    + pingTimeArray.get(pingTimeArray.size() / 2)) /2;
        }else{
            median=pingTimeArray.get((pingTimeArray.size()+1)/2-1);
        }
        return median;
    }
    public static void main(String []args){
        String host="www.google.com";
        System.out.println("Enter how many time you want to ping the host");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(medianTimeToPing(host,n));
    }
}
