/*
 * Problem Statement

You are given time in AM/PM format. Can you convert this into a 24-hour format?

Input

Input consists of time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM 
where 01��hh��12.

Sample: 07:05:45PM

Output

You need to print the time in a 24-hour format i.e. hh:mm:ss 
where 00��hh��23.

Sample output for the above input: 19:05:45

Note: Midnight is 12:00:00AM or 00:00:00. Noon is 12:00:00PM.
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String start = input.substring(0, 2);
        String end = input.substring(input.length() - 2);

    }

}
