package observer.good_code;


//Observer  Interface

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temp);
}

interface subject{
    void attach (Observer obs);
    void remove (Observer obs);
    void notifyObs();
}

class Weather implements subject{

    private float temperature;
    private final List<Observer> listOfObs;

    Weather(){
        listOfObs = new ArrayList<>();
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObs();
    }


    @Override
    public void attach(Observer obs) {
        listOfObs.add(obs);
    }

    @Override
    public void remove(Observer obs) {
        listOfObs.remove(obs);
    }

    @Override
    public void notifyObs() {
        for(Observer obs: listOfObs){
            obs.update(temperature);
        }
    }
}

class Mobile implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Updated temp Mobile "+temp);
    }
}

class Phone implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Updated temp phone "+ temp);
    }
}

public class Example {
    static void main(String[] args) {
        Observer phone = new Phone();
        Observer mobile = new Mobile();
        Weather weather = new Weather();

        weather.attach(phone);
        weather.attach(mobile);

        weather.setTemperature(25);

        weather.remove(mobile);

        weather.setTemperature(35);
    }

}

