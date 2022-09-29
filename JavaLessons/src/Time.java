public class Time {
    private int _hour;
    private int _minutes;
    public Time(int hour,int minutes)
    {
        if (hour>=0&&hour<=24)
            _hour=hour;
        else throw new RuntimeException();
        if (minutes>=0&&minutes<=60)
            _minutes=minutes;
        else throw new RuntimeException();
    }
    public boolean MoreThan(Time time) {
        if (this._hour > time._hour||(this._hour == time._hour&& this._minutes >= time._minutes))
            return true;
        return false;
    }
}
