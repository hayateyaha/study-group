public class Human {
    private int age;
    private String name;

    Human(int age,String name){
        this.age=age;
        this.name=name;
    }

    public static Human create(int age,String name,boolean isMan){
        Human human;
        if(isMan) human=new Man(age,name);
        else human=new Woman(age,name);
        return human;
    }

    public void getIntroduction(){
        System.out.println(name + "は" + age + "才です");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
