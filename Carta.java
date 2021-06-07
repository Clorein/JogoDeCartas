public class Carta{

    private String nome;
    private String naipe;

    public Carta(String nome, String naipe){
        this.nome = nome;
        this.naipe = naipe;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNaipe(){
        return this.naipe;
    }


}