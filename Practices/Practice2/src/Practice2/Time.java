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

        boolean ok = false;
        StringBuilder sb = new StringBuilder();

        if(hour > 12) {
            ok = true;
            hour -= 12;
        }
        if(hour < 10) sb.append("0" + hour + ":");
        else sb.append(hour + ":");

        if(minute < 10) sb.append("0" + minute + ":");
        else sb.append(minute + ":");

        if(second < 10) sb.append("0" + second);
        else sb.append(second);

        if(!ok) sb.append(" AM");
        else sb.append(" PM");

        return sb.toString();
    }

    public Time add(Time t1, Time t2) {
        int newHour = t1.hour + t2.hour;
        int newMinute = t1.minute + t2.minute;
        int newSecond = t1.second + t2.second;

        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }

        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }

        if (newHour >= 24) {
            newHour -= 24;
        }

        return new Time(newHour, newMinute, newSecond);
    }

    public static void main(String[] args) {
        Time t = new Time(14, 7, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(7, 38, 1);
        t.add(t, t2);
        System.out.println(t.toUniversal());
    }
}
