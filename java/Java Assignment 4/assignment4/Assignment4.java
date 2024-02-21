package assignment4;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually.
// Each form has a date which signifies the date the form was filled called the form date.
//Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer.
// When filling it up, you have to provide the form date. If you are past the +-30 day anniversary
//then you can back-date it so that it falls in the +-30-day window.When filling it up you cannot use a future date for the form date.
//For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC
// submission this year would be 30 Jan 2017 to 31 Mar 2017.
// Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.
//Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
//Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then
// your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992
// is not an anniversary.
// Given the signup date and the current date, provide the allowable date range for the form date.
//Input - First line is an integer n as the number of inputs to be passed. Next,n lines are n input
// for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates
// separated by space where the first date in signup date and the second date is the current date.
//Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy
//
//        Test Input:
//        5
//        16-07-1998 27-06-2017
//        04-02-2016 04-04-2017
//        04-05-2017 04-04-2017
//        04-04-2015 04-04-2016
//        04-04-2015 15-03-2016
//
//        Test output:
//        16-06-2017 27-06-2017
//        05-01-2017 06-03-2017
//        No range
//        05-03-2016 04-04-2016
//        05-03-2016 15-03-2016
public class Assignment4 {
    public static void kycDateRange(String dates){
        String []date=dates.split(" ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date current=sdf.parse(date[1]);
            Date signupDate=sdf.parse(date[0]);
            Calendar signupCalendar = Calendar.getInstance();
            signupCalendar.setTime(signupDate);
            int signupMonth = signupCalendar.get(Calendar.MONTH);
            int signupDay = signupCalendar.get(Calendar.DAY_OF_MONTH);
            int signupYear = signupCalendar.get(Calendar.YEAR);
//            System.out.println(signupCalendar.get(Calendar.YEAR));
            Calendar currentCalendar = Calendar.getInstance();
            currentCalendar.setTime(current);
            int currentYear = currentCalendar.get(Calendar.YEAR);
            int currentMonth = currentCalendar.get(Calendar.MONTH);
            int currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH);
            if(currentYear<signupYear || (currentYear==signupYear
                    && (currentMonth<signupMonth || (currentMonth==signupMonth
                    && currentDay<signupDay)))){
                System.out.println("Wrong input");
                return;
            }
            int anniversaryYear = currentYear;
            Calendar anniversaryCalendar = Calendar.getInstance();
            anniversaryCalendar.set(Calendar.YEAR, anniversaryYear);
            anniversaryCalendar.set(Calendar.MONTH, signupMonth);
            anniversaryCalendar.set(Calendar.DAY_OF_MONTH, signupDay);
//            // Calculate the allowable date range for KYC form
            anniversaryCalendar.add(Calendar.DAY_OF_MONTH, -30);
            Date dateAllowedFrom = anniversaryCalendar.getTime();
            int startMonthFrom=anniversaryCalendar.get(Calendar.MONTH);
            anniversaryCalendar.add(Calendar.DAY_OF_MONTH, 60);
            Date dateAllowedTo = anniversaryCalendar.getTime();
//            System.out.println("Allowed from   "+dateAllowedFrom+"to "+dateAllowedTo);
            int endMonthTo=anniversaryCalendar.get(Calendar.MONTH);
            if(currentMonth>=startMonthFrom && currentMonth <= endMonthTo){
                System.out.println(sdf.format(dateAllowedFrom) + " " + sdf.format(dateAllowedTo));
            }else{
                System.out.println("Back date");
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String []args){
        System.out.println("Enter the number of inputs to be passed");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String []datesArray=new String[n];
        for(int i=0;i<n;i++){
            datesArray[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(datesArray));
        for(int i=0;i<n;i++){
            kycDateRange(datesArray[i]);
        }
//        rangeOfDatesForKYC("16-07-1998 27-06-2017");
    }
}
