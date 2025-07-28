package constructor;
import java.util.Scanner;
class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = Math.floorMod(hours, 24);
        this.minutes = Math.floorMod(minutes, 60);
        this.seconds = Math.floorMod(seconds, 60);
    }

    public Clock(int totalSeconds) {
        setClock(totalSeconds);
    }

    public void setClock(int totalSeconds) {
        totalSeconds = ((totalSeconds % 86400) + 86400) % 86400;
        this.hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minutes = totalSeconds / 60;
        this.seconds = totalSeconds % 60;
    }

    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }

    public void setHours(int hours) {
        this.hours = Math.floorMod(hours, 24);
    }

    public void setMinutes(int minutes) {
        this.minutes = Math.floorMod(minutes, 60);
    }

    public void setSeconds(int seconds) {
        this.seconds = Math.floorMod(seconds, 60);
    }

    public void tick() {
        setClock(toSeconds() + 1);
    }

    public void tickDown() {
        setClock(toSeconds() - 1);
    }

    public void addClock(Clock other) {
        setClock(this.toSeconds() + other.toSeconds());
    }

    public Clock subtractClock(Clock other) {
        int diff = this.toSeconds() - other.toSeconds();
        return new Clock(diff);
    }

    private int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
}


public class ClassDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total seconds since midnight for firstClock: ");
        int secondsSinceMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);

        System.out.println("\nTicking firstClock 10 times:");
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("Tick " + (i + 1) + ": " + firstClock);
        }

        System.out.print("\nEnter hours for secondClock: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes for secondClock: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds for secondClock: ");
        int seconds = scanner.nextInt();

        Clock secondClock = new Clock(hours, minutes, seconds);

        System.out.println("\nTicking secondClock 10 times:");
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println("Tick " + (i + 1) + ": " + secondClock);
        }

        firstClock.addClock(secondClock);

        System.out.println("\nAfter adding secondClock to firstClock:");
        System.out.println("firstClock: " + firstClock);
        System.out.println("secondClock: " + secondClock);

        Clock thirdClock = firstClock.subtractClock(secondClock);

        System.out.println("\nthirdClock (difference of firstClock and secondClock): " + thirdClock);

        scanner.close();
    }
}