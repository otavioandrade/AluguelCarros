public class TipoDoCarro
{
    private String nomeDoTipo;
    private int numMaxPassageiro;

    public TipoDoCarro(String nomeDoTString, int numMaxPassageiro)
    {
        this.nomeDoTipo = nomeDoTString;
        this.numMaxPassageiro = numMaxPassageiro;
    }

    /**
     * @return the numMaxPassageiro
     */
    public int getNumMaxPassageiro()
    {
        return numMaxPassageiro;
    }
    
}