public class Prefeito {
    private String nome;

    private Prefeito(){}
    private static Prefeito prefeito = new Prefeito();
    public static synchronized Prefeito getInstance(){
        return prefeito;
    }

    public String getNome(){
        return prefeito.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
