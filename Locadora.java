import java.util.ArrayList;

public class Locadora
{
    private String nomeLocadora;
    private ArrayList<Carro> carrosDisponiveis;
    private double precoPremFds;
    private double precoPremDiaSemana;
    private double precoNormFds;
    private double precoNormDiaSemana;


    public Locadora (String nomeLocadora, double precoNormDiaSemana, double precoNormFds, double precoPremDiaSemana, double precoPremFds)
    {
        this.carrosDisponiveis = new ArrayList<Carro>();
    }

    public void addCarro(Carro carro)
    {
        carrosDisponiveis.add(carro);
    }

    public Double valorAluguel()
    {
        
    } 



}