public class Baralho{

   private Carta cartas[] = new Carta[56];


   public Baralho(){
      String tipos[] = {"As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei", "Coringa"};
      String naipes[] = {"Paus", "Ouros", "Espadas", "Copas", "coringa"};

      int i, j;
      int pos = 0;

      for(i=0; i<4; i++){
         for(j=0; j<13; j++){
            cartas[pos] = new Carta(tipos[j], naipes[i]);
            pos++;
         }
         cartas[pos] = new Carta(tipos[13], naipes[4]);
         pos++;
      }
   }

  public String daCarta(){
      String cartaTopo = "Nao tem nada no baralho";
      int i;

      for(i=cartas.length-1; i>=0; i--){
         if(cartas[i] != null){
         cartaTopo = cartas[i].getNome()  + " de " + cartas[i].getNaipe();
         cartas[i] = null;
         break;
         }
      }
      
      return cartaTopo;
   } 

   public boolean temCarta(){

      boolean verificaCarta = false;
      int i;

      for(i=0; i<cartas.length; i++){
         if(cartas[i] != null){
            verificaCarta = true;
         }else{
            verificaCarta = false;
         }
      }

      return verificaCarta;
      
   } 


   public void embaralha(){

      int num1 = (int) (Math.random()*56);
		int num2 = (int) (Math.random()*56);

		Carta aux = new Carta("","");
		
		aux = cartas[num1];
		cartas[num1] = cartas[num2];
		cartas[num2] = aux;

   }

   public String imprimeBaralho() {
		String imprime = "";
		int i;

		for(i=0; i<cartas.length;i++){
         if(cartas[i]!=null){
				imprime += cartas[i].getNome() + " de " + cartas[i].getNaipe() + "\n";
         }
		}
		
		return imprime;
	}


   

}