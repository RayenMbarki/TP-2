public class RedheadDuck extends Duck {
    @Override
    public void swim() {
        System.out.println("RedheadDuck is swimming");
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck is displaying");
    }

    Flyable f;
    public  RedheadDuck(Flyable f) {
        this.f=f;
    }
    public void fly() {
        f.fly();
    }
    public void quack() {
        System.out.println("RedheadDuck is quacking");
    }


}
