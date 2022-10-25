package BehavioralDP.ChainOfResponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        ChainOfResponsibility cor = new ChainOfResponsibility();

        cor.chainOfResponsibilityDemo();

    }

    void chainOfResponsibilityDemo() {

        Approver genelMudur = new GenelMudur();
        Approver mudur = new Mudur(genelMudur);
        Approver memur = new Memur(mudur);

        System.out.println("Kredi verme limitleri : ");
        System.out.println("Memur icin maksimum  : < 100 ");
        System.out.println("Mudur icin maksimum : < 500 ");
        System.out.println("Genel Memur icin sinir yok ");
        System.out.println("****************************");

        System.out.println("Musterinin memurdan talebi : 50 ");

        memur.approveLoan(50);
        System.out.println("Musterinin memurdan talebi : 450 ");
        memur.approveLoan(450);
        System.out.println("Musterinin memurdan talebi : 1050 ");
        memur.approveLoan(1050);


    }
}
