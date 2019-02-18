import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    private ArrayList<Locadora> locadorasDisponiveis;
    

    public App()
    {  
        locadorasDisponiveis = new ArrayList<>();
    }

    //
    public void realizarBusca (Buscador dadosBuscador)
    {
        double tempValor = 99999999.00d;
        ArrayList<Locadora> tempLoc = new ArrayList<>();
        for (Locadora loc : this.locadorasDisponiveis)
        {
            if (dadosBuscador.getNumLugar() <= loc.getNumMaxPassageiro())
            {
                if (loc.valorTotalAluguel(dadosBuscador.getNumDiasSemana(), dadosBuscador.getNumFds(), dadosBuscador.getTipoCliente()) < tempValor)
                {
                    tempValor = loc.valorTotalAluguel(dadosBuscador.getNumDiasSemana(), dadosBuscador.getNumFds(), dadosBuscador.getTipoCliente());
                    tempLoc.add(0, loc);
                }
            }
        }
        
        System.out.println(tempLoc.get(0).getNomeLocadora() + ":" + tempLoc.get(0).getCarrosDisponiveis());

    }

    public void imprimirResultado(Locadora loc)
    {
        System.out.println();
    }


    //Inicializa as locadoras de carros com os seus devidos preços, e adiciona os carros disponíveis
    private void inicializar()
    {
        TipoDoCarro suv = new TipoDoCarro("SUV", 7);
        TipoDoCarro esportivo = new TipoDoCarro("Esportivo", 2);
        TipoDoCarro compacto = new TipoDoCarro("compacto", 4);

        Locadora southLoc = new Locadora("SouthCar", compacto, 210.00d, 200.00d, 150.00d, 90.00d);
        Locadora westLoc = new Locadora("WestCar", esportivo, 530.00d, 220.00d, 150.00d, 90.00d);
        Locadora northLoc = new Locadora("NorthCar", suv, 630.00d, 600.00d, 580.00d, 590.00d);

        southLoc.addCarro("Uno");
        southLoc.addCarro("Palio");
        westLoc.addCarro("Ferrari");
        northLoc.addCarro("EcoSport");
        northLoc.addCarro("EcoSport2");

        locadorasDisponiveis.add(southLoc);
        locadorasDisponiveis.add(westLoc);
        locadorasDisponiveis.add(northLoc);
    }

    public void executar()
    {
        inicializar();
        Scanner entraOpcao = new Scanner(System.in);
        Scanner entraDados = new Scanner(System.in);
        String opcao = null;

        do
        {
            System.out.println("Digite <a> para nova busca ou <q> para sair.");
            opcao = entraOpcao.nextLine();

            if (opcao.equals("a"))
            {
                System.out.println("Digite os dados para buscar: ");
                realizarBusca(new Buscador(entraDados.nextLine()));
            }

        }while(!opcao.equals("q"));
    }
}