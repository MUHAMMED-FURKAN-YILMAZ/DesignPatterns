package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // SingletonObject object2 = new SingletonObject(); -> izin vermedi
        SingletonObject object2 = SingletonObject.getInstance();

        System.out.println(object2.message);
        object2.showMessage();

        // olusan obje  singleton mi test edelim
        SingletonObject object3 = SingletonObject.getInstance();

        System.out.println(object3.message);

    }
}
