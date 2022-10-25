package BehavioralDP.ChainOfResponsibility;

public class Memur extends Approver{

    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<100){
            System.out.println("Memur onayladi");
            System.out.println("****************");
        }else if (chief!=null){
            System.out.println("Kredi miktari memurun onaylama siniri disinda, Sefe yonlendiriliyor");
            return chief.approveLoan(amount);
        }
        return false;
    }


}
