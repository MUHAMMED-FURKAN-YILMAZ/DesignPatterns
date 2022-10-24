package StructuralDP.DecoratorDP;

public class İphone11 extends PhoneDecorator{

    public İphone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "11";
    }




}
