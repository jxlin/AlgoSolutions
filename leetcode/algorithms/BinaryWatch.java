/*
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

 * Each LED represents a zero or one, with the least significant bit on the right.
 * 
 * https://upload.wikimedia.org/wikipedia/commons/8/8b/Binary_clock_samui_moon.jpg
 * 
 * For example, the above binary watch reads "3:25".
 * 
 * Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
 * 
 * Example:
 * 
 * Input: n = 1
 * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 * Note:
 * The order of output does not matter.
 * The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 * The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
 */
public class BinaryWatch {

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
        if (num > 8 || num <= 0) {
            return result;
        }
        int min = Math.max(0, num - 5);
        for (int h = min; h <= Math.min(3, num); ++h) {
            List<String> hours = new ArrayList<String>();
            List<String> minutes = new ArrayList<String>();
            if (h == 0) {
                hours.add("0");
            } else if (h == 1) {
                hours.add("1");
                hours.add("2");
                hours.add("4");
                hours.add("8");
            } else if (h == 2) {
                hours.add("12");
                hours.add("10");
                hours.add("9");
                hours.add("6");
                hours.add("5");
                hours.add("3");
            } else if (h == 3) {
                hours.add("11");
                hours.add("7");
            }
            int m = num - h;
            if (m == 0) {
                minutes.add("00");
            } else if (m == 1) {
                for (int i = 0; i < 5; ++i) {
                    int minute = 1 << i;
                    minutes.add((minute < 10 ? "0" : "") + minute);
                }
            } else if (m == 2) {

            } else if (m == 3) {

            } else if (m == 4) {

            } else if (m == 5) {

            }
        }
        return result;
    }

}
