/*
 * 
 * Convert Hours into Seconds
Write a function that converts hours into seconds.

Examples
howManySeconds(2) ➞ 7200

howManySeconds(10) ➞ 36000

howManySeconds(24) ➞ 86400
Notes
60 seconds in a minute, 60 minutes in an hour
Don't forget to return your answer.
Explicar
*
 */

public class CConvertHoursIntoSeconds {
    public static void main(String[] args) {
        System.out.println(convertHoursIntoSeconds(2) + " secondos.");
    }

    public static int convertHoursIntoSeconds( int a){
        return (a * 60) * (60);
    }
}
