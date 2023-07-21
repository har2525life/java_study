class AlarmClock extends Clock {
    String alarmTime;

    AlarmClock(String time) {
        super(time);
        System.out.println(time);
    }

    void alarm() {
        if (time == alarmTime) {
            System.out.println("アラームが鳴りました");
        }
    }

    void setAlarm(String time) {
        alarmTime = time;
    }
}