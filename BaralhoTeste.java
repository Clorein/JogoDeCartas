public class BaralhoTeste{
    public static void main(String[] args) {
        
        Baralho baralho = new Baralho();

        //Retorno de true ou false se tem carta
        System.out.println(baralho.temCarta());

        System.out.println("");

        //Impressão do baralho
        System.out.println(baralho.imprimeBaralho());

        //Embaralhamento
        for(int i =0; i<30; i++){
            baralho.embaralha();
        }

        //Impressão do baralho após o embaralhamento
        System.out.println(baralho.imprimeBaralho());

        System.out.println("");

        //Retorno e retirada da carta do topo do baralho
        System.out.println("Carta do topo do baralho: " + baralho.daCarta() + "\n");

        //Impressão do baralho após a retirada da carta
        System.out.println(baralho.imprimeBaralho());



    }
}