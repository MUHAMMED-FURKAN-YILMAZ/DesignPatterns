package BehavioralDP.MediatorDP;

// bu interface sadece dagitim isini yapacak
public interface Dispatcher {

    void dispatch(String topic, String message);

}
