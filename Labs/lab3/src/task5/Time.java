package task5;

public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    @Override
    public int compareTo(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
