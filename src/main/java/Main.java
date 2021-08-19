public class Main {
    public static void main(String[] args) {
        Prefeito prefeito1, prefeito2;

        prefeito1 = Prefeito.getInstance();
        prefeito1.setNome("Marco");
        prefeito2 = Prefeito.getInstance();

        if(prefeito1 == prefeito2){
            System.out.println(prefeito1.getNome());
            System.out.println(prefeito2.getNome());
        }
    }
}