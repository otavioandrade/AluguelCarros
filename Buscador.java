import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Buscador
{
    private boolean tipoCliente;
    private int numLugar;
    private int numDiasSemana;
    private int numFds;

    public Buscador(String novaBuscaString)
    {

        String array1[] = novaBuscaString.split(":");
        this.tipoCliente = ehPremium(array1[0]);
        this.numLugar = Integer.parseInt(array1[1]);
        defineNumDias(array1[2]);
    }

    private boolean ehPremium(String tipoCliente)
    {
        if (tipoCliente.contentEquals("premium"))
        {
            return true;
        } 
        else return false;
    }

    private void defineNumDias(String dataString)
    {
        ArrayList<String> matchlist = new ArrayList<>();
        int tempNumDiasSemana = 0;
        int tempNumFds = 0; 
        Matcher m = Pattern.compile("\\((.*?)\\)").matcher(dataString);
        while(m.find())
        {
            matchlist.add(m.group(1));
        }

        for (String str : matchlist)
        {
            if (str.equals("sab") || str.equals("dom"))
            {
                tempNumFds = tempNumFds+1; 
            }
            else
            {
                tempNumDiasSemana = tempNumDiasSemana+1;
            }
        }
        this.numDiasSemana = tempNumDiasSemana;
        this.numFds = tempNumFds;
    }

    public int getNumFds()
    {
        return numFds;
    }

    public int getNumDiasSemana()
    {
        return numDiasSemana;
    }
  
    public int getNumLugar()
    {
        return numLugar;
    }

    public boolean getTipoCliente()
    {
        return tipoCliente;
    }
}