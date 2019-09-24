public class Main {

public String name [] = {"Pers", "Masha", "Fishka", "Barsik"};

//Добавь файл gitignore
//https://github.com/github/gitignore/blob/master/Java.gitignore
    public static void main(String[] args) {

        Cat ourcat = new Cat(name[3]);
        ourcat.jump();
        ourcat.scratch();


        play_sound cat1 = new Cat(name[1]);

        cat1.print();

        Animals cat2 = new Cat(name[0]);

        cat2.getName();
        cat2.print();

        ability_to_scratch cat3 = new Cat(name[4]);

        cat3.scratch();
	// write your code here
    }
}
