/*
 * number of people who received the first dose
 * vaccine per week
 */
package howmanywerevaccinated;

import java.util.Arrays;

public class HowManyWereVaccinated {

    public static void main(String[] args) {
        int[] week1 = new int[7];
        week1[0] = 202;
        week1[1] = 566;
        week1[2] = 598;
        week1[3] = 600;
        week1[4] = 552;
        week1[5] = 431;
        week1[6] = 475;
        
        String[] dayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(int i = 0; i < week1.length; i++){
            System.out.println(dayWeek[i] + ":" + " " +week1[i]);
        }
        
        int total = 0;
        for(int i : week1){
            total += i;
        }
        int avg = total / week1.length;
        System.out.println("That week they were vaccinated an average of " + avg + " a day");
    }
    
    
}
