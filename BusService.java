/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hamza Gul.
 */
import java.util.List;
import java.util.ArrayList;

class BusService implements TransportService {
    private List<Observer> observers = new ArrayList<>();
    private String busName;

    public BusService(String busName) {
        this.busName = busName;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(busName + ": " + message);
        }
    }

    public void updateStatus(String status) {
        notifyObservers(status);
    }
}

