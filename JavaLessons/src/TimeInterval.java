public class TimeInterval {
    private Time _min;
    private Time _max;

    public TimeInterval(Time min, Time max) {
        _min = min;
        _max = max;
    }

    public boolean containsTime(Time now) {
        if (now.MoreThan(_min) && _max.MoreThan(now))
            return true;
        return false;
    }
}
