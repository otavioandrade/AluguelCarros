public class Teste
{
    public static void main(String[] args)
    {
        Locadora loc1 = new Locadora("WestCar", 100.00f, 100.00f, 100.00f, 100.00f);
        Carro car1 = new Carro(4, "teste", "teste");

        loc1.addCarro(car1);


        System.out.println(loc1);


    }
}