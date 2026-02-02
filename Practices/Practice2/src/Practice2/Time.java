package Practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        StringBuilder sb = new StringBuilder();

        if(hour < 10) sb.append("0" + hour + ":");
        else sb.append(hour + ":");

        if(minute < 10) sb.append("0" + minute + ":");
        else sb.append(minute + ":");

        if(second < 10) sb.append("0" + second);
        else sb.append(second);

        return sb.toString();
    }

    public String toStandard() {
        int h = hour;

        boolean ok = false;
        StringBuilder sb = new StringBuilder();

        if(h >= 12) {
            ok = true;
            h -= 12;
        }
        if(h < 10) sb.append("0" + h + ":");
        else sb.append(h + ":");

        if(minute < 10) sb.append("0" + minute + ":");
        else sb.append(minute + ":");

        if(second < 10) sb.append("0" + second);
        else sb.append(second);

        if(!ok) sb.append(" AM");
        else sb.append(" PM");

        return sb.toString();
    }

    public Time add(Time other) {
        int newSecond = this.second + other.second;
        int carryMin = newSecond / 60;
        newSecond %= 60;

        int newMinute = this.minute + other.minute + carryMin;
        int carryHour = newMinute / 60;
        newMinute %= 60;

        int newHour = (this.hour + other.hour + carryHour) % 24;

        return new Time(newHour, newMinute, newSecond);
    }

    public static void main(String[] args) {
        Time t = new Time(14, 7, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(7, 38, 1);
        Time sum = t.add(t2);
        System.out.println(sum.toUniversal());
    }
}
