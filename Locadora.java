import java.util.ArrayList;

public class Locadora
{
    private String nomeLocadora;
    private TipoDoCarro categoria;
    private ArrayList<String> carrosDisponiveis;
    private double precoPremFds;
    private double precoPremDiaSemana;
    private double precoNormFds;
    private double precoNormDiaSemana;


    public Locadora (String nomeLocadora, TipoDoCarro tipo, double precoNormDiaSemana, double precoNormFds, double precoPremDiaSemana, double precoPremFds)
    {
        this.nomeLocadora = nomeLocadora;
        this.categoria = tipo;
        this.precoNormDiaSemana = precoNormDiaSemana;
        this.precoNormFds = precoNormFds;
        this.precoPremDiaSemana = precoPremDiaSemana;
        this.precoPremFds = precoPremFds;
        this.carrosDisponiveis = new ArrayList<String>();
    }

    public void addCarro(String nomeDoCarro)
    {
        carrosDisponiveis.add(nomeDoCarro);
    }

    public Double valorTotalAluguel(int numDiaSemana, int numFds, boolean ehPremium)
    {
        if(ehPremium)
        {
            return (numDiaSemana*precoPremDiaSemana)+(numFds*precoPremFds);
        }
        else
        {
            return (numDiaSemana*precoNormDiaSemana)+(numFds*precoNormFds);
        }
    }

    public String getCarrosDisponiveis()
    {
        String tempString = "";
        for (String str : carrosDisponiveis)
        {
            tempString = tempString+str+" ";
        }
        return tempString;
    }

    public int getNumMaxPassageiro()
    {
        return categoria.getNumMaxPassageiro();
    }

    /**
     * @return the nomeLocadora
     */
    public String getNomeLocadora()
    {
        return nomeLocadora;
    }

}