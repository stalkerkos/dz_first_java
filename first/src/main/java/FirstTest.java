import test.ship.StarShip;

public class FirstTest {

    public static void main(String[] args) {
        //создаю экземпляр класса
        StarShip ship = new StarShip();

        //задаю конкретному кораблю конкретное свойство
        ship.shipHeight = 253.25;
        displayHeight(ship);


    }

    public static void displayHeight(StarShip ship) {
        System.out.println("Высота корабля составляет : " + getStarShipHeight(ship));

    }

    public static double getStarShipHeight(StarShip ship) {
        return ship.shipHeight;
    }
}

