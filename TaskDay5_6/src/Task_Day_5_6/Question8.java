package Task_Day_5_6;

class TimeConverter{

    public void hoursToMin(int hours){
        System.out.println("Minutes in "+hours+" hours is "+ 60*hours);
    }

    public void hoursToMin(double hours){
        System.out.println("Minutes in "+hours+" hours is "+ 60*hours);
    }

    public void minutesToHours(int minutes){
        System.out.println("Hours in "+minutes+" minutes is "+ minutes/60);
    }

    public void minutesToHours(double minutes){
        System.out.println("Hours in "+minutes+" minutes is "+ minutes/60);
    }

}
public class Question8 {
    public static void main(String[] args) {

        TimeConverter timeConverter=new TimeConverter();
        timeConverter.hoursToMin(1.5);
        timeConverter.hoursToMin(1);
        timeConverter.minutesToHours(60);
        timeConverter.minutesToHours(59.5);

    }
}
