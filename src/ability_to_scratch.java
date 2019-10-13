public interface ability_to_scratch {
//Предлагаю использовать camelCase везде, snake_case неудобно читать.
//https://techrocks.ru/2018/08/09/most-common-programming-case-types/
     public default String scratch() {
         //Здесь не нужна была реализация по умолчанию, здесь надо было просто объявить метод
         //Если добавила реализацию, то почему создаёшь объект класса, который должен был реализовать
         //этот метод, ещё и возвращаешь null? Возвращать null - вообще плохая практика. Если хочешь вернуть
         //String, значит, верни String
          Cat scratch = new Cat();
                    return null;
     }
}