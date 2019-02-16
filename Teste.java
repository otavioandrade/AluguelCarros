
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste
{
    public static void main(String[] args)
    {
        
        Buscador novoBuscador = new Buscador("normal:5:16mar2009(seg),17mar2009(ter),18mar2009(sab)");
        App novoApp = new App();
        novoApp.executar();
        novoApp.realizarBusca(novoBuscador);


        //Scanner entraDados = new Scanner(System.in);

                      
        //String buscaCarros = "premium:4:16mar2009(seg),17mar2009(ter),18mar2009(qua)";


        


    }
}