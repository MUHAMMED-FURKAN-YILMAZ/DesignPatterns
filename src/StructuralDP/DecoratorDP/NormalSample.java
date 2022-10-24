package StructuralDP.DecoratorDP;

public class NormalSample {

    // eski version , problemin izahi icin yazildi

    public static class Iphone11{

        public  String name(){// 100*100
            return "Iphone 11";
        }

        int getCameraCount(){
            return 2;
        }

    }

    public static class Iphone11Pro{

        public  String name(){ // 120*120
            return "Iphone 11 Pro";
        }

        int getCameraCount(){
            return 3;
        }

    }

    public static class Iphone11ProMax{

        public  String name(){ // 150*150
            return "Iphone 11 Pro Max";
        }

        int getCameraCount(){
            return 3;
        }

    }

}
