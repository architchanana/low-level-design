package observer.bad_code;

public class WithoutObserver {
}

class DisplayDevice{
    public void showTemp(float temp){
        System.out.println("Current temp: "+ temp + "C");
    }
}

class WeatherStation{
    private float temparature;

    private DisplayDevice displayDevice;

    public  WeatherStation(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void  setTemparature(float temp){
        this.temparature = temp;
        notify(temp);
    }

    public void notify(float temp){
        displayDevice.showTemp(temp);
    }
}
