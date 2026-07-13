class Solution {
    public double angleClock(int hour, int minutes) {
        double minutesangle= 6.0 * minutes;
        double hourangle= 30.0 *(hour % 12) + 0.5 * minutes;
        double difference= Math.abs(minutesangle-hourangle);

        return Math.min(difference,360.0-difference);
    }
}