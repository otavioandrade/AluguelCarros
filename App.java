import java.util.ArrayList;

public class App
{
    private ArrayList<Locadora> locadorasDisponiveis;
    

    public App()
    {  
        locadorasDisponiveis = new ArrayList<>();
    }


    public void realizarBusca (Buscador dadosBuscador)
    {
        double tempValor = 99999999.00d;
        ArrayList<Locadora> tempLoc = new ArrayList<>();
        for (Locadora loc : this.locadorasDisponiveis)
        {
            if (dadosBuscador.getNumLugar() <= loc.getNumMaxPassageiro())
            {
                //System.out.println("entrou 1");
                if (loc.valorTotalAluguel(dadosBuscador.getNumDiasSemana(), dadosBuscador.getNumFds(), dadosBuscador.getTipoCliente()) < tempValor)
                {
                    System.out.println(loc.valorTotalAluguel(dadosBuscador.getNumDiasSemana(), dadosBuscador.getNumFds(), dadosBuscador.getTipoCliente()));
                    tempValor = loc.valorTotalAluguel(dadosBuscador.getNumDiasSemana(), dadosBuscador.getNumFds(), dadosBuscador.getTipoCliente());
                    tempLoc.add(0, loc);
                }
            }
        }

        System.out.println(tempLoc.get(0).getNomeLocadora());

    }

    public void imprimirResultado(Locadora loc)
    {
        System.out.println();
    }

    public void executar()
    {
        TipoDoCarro suv = new TipoDoCarro("SUV", 7);
        TipoDoCarro esportivo = new TipoDoCarro("Esportivo", 2);
        TipoDoCarro compacto = new TipoDoCarro("compacto", 4);

        Locadora loc1 = new Locadora("SouthCar", compacto, 210.00d, 200.00d, 150.00d, 90.00d);
        Locadora loc2 = new Locadora("WestCar", esportivo, 530.00d, 200.00d, 150.00d, 90.00d);
        Locadora loc3 = new Locadora("NorthCar", suv, 630.00d, 600.00d, 580.00d, 590.00d);

        loc1.addCarro("Uno");
        loc2.addCarro("Ferrari");
        loc3.addCarro("EcoSport");

        locadorasDisponiveis.add(loc1);
        locadorasDisponiveis.add(loc2);
        locadorasDisponiveis.add(loc3);
    }


}