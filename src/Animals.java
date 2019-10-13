public abstract class Animals {

    final String name;

    public Animals(String name) {
        this.name = name;
    }

    //Считаю, что стоит именовать классы названием в единственном числе.
    //Про такую реализацию метода eat я говорил:)
    public void eat() {
        System.out.println("Ом-ном-ном");
    }

    abstract void jump();
}
