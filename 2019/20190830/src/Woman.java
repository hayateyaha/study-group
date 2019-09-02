public class Woman extends Human{
    Woman(int age,String name){
        super(age,name);
    }

    @Override
    public void getIntroduction(){
        System.out.println(super.getName() + "は" + super.getAge() + "才女性です");
    }
}
