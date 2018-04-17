package ass6.q1.navjitkaur;
public class Time {
    private int hour;
    private int minute;
    private int second;
    private long time;
    Time() {
        this.time=System.currentTimeMillis()/1000;
    }
    Time(long elapseTime){
        this.time=elapseTime/1000;
    }
    Time(int hr, int min, int sec) {
        this.hour=hr;
        this.minute=min;
        this.second=sec;
    }
    public int getHour() {
        return (int)((time/3600)%24);
    }
    public int getMinute() {
        return (int)(time/60)%60;
    }
    public int getSecond() {
        return (int)time%60;
    }  
    public void setTime(long elapseTime) {
        this.time=elapseTime/1000;
    }
}