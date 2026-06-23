import ru.practicum.model.Apple;
import ru.practicum.model.Food;
import ru.practicum.model.Meat;
import ru.practicum.model.constants.Colour;
import ru.practicum.service.ShoppingCart;

public class Main {

    public static void main(String[] args){

        //Создаем объекты для мяса, красных яблок и зеленых яблок
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple (10, 50, Colour.RED);
        Apple greenApple = new Apple (8, 60, Colour.GREEN);

        //Помещаем созданные продукты в массив
        Food[] food = {meat, redApple, greenApple};

        //Создаем объект корзины с массивом продуктов food
        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.printf("Общая сумма товаров без скидки: %.2f\n", shoppingCart.getPriceWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f\n", shoppingCart.getPriceWithDiscount());
        System.out.printf("Общая сумма вегетарианских товаров без скидки: %.2f\n", shoppingCart.getVegetarianPriceWithoutDiscount());
    }
}
