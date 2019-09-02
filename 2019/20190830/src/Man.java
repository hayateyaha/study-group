public class Man extends Human{
    Man(int age,String name){
        super(age,name);
    }

    @Override
    public void getIntroduction(){
        System.out.println(super.getName() + "は" + super.getAge() + "才男性です");
    }
}
