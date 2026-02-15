package task5;

import java.util.Vector;

public class DragonLaunch {
    private final Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        people.add(p);
    }

    public boolean willDragonEatOrNot() {
        int k = 0;

        for (int i = 0; i < people.size(); i++) {
            Person cur = people.get(i);

            if (k > 0
                    && people.get(k - 1).getGender() == Gender.BOY
                    && cur.getGender() == Gender.GIRL) {
            } else {
                people.set(k, cur);
                k++;
            }
        }

        people.setSize(k);

        return k != 0;
    }

    public String line() {
        StringBuilder sb = new StringBuilder();
        for (Person p : people) sb.append(p);
        return sb.toString();
    }

    public static DragonLaunch fromString(String s) {
        DragonLaunch dl = new DragonLaunch();
        for (char ch : s.toCharArray()) {
            if (ch == 'B') dl.kidnap(new Person(Gender.BOY));
            else if (ch == 'G') dl.kidnap(new Person(Gender.GIRL));
        }
        return dl;
    }

    public static void main(String[] args) {
        DragonLaunch a = DragonLaunch.fromString("BBGG");
        System.out.println("Start: " + a.line());
        System.out.println("Will eat? " + a.willDragonEatOrNot());
        System.out.println("Left : " + a.line());
        System.out.println();

        DragonLaunch b = DragonLaunch.fromString("GBGB");
        System.out.println("Start: " + b.line());
        System.out.println("Will eat? " + b.willDragonEatOrNot());
        System.out.println("Left : " + b.line());
        System.out.println();

        DragonLaunch c = DragonLaunch.fromString("BGBGGB");
        System.out.println("Start: " + c.line());
        System.out.println("Will eat? " + c.willDragonEatOrNot());
        System.out.println("Left : " + c.line());
    }
}
