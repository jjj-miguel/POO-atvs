package animal;
public class Animal {
    private String especie;
    private String nome;
    private int qtdePatas;

    public Animal(String especie, String nome, int qtdePatas) {
        this.especie = especie;
        this.nome = nome;
        this.qtdePatas = qtdePatas;
    }

    public String getespecie() {
        return this.especie;
    }

    public String getnome() {
        return this.nome;
    }

    public int getqtdePatas() {
        return this.qtdePatas;
    }

    public void setespecie(String especie) {
        this.especie=especie;
    }

    public void setnome(String nome) {
        this.nome=nome;
    }

    public void setqtdePatas(int qtdePatas) {
        this.qtdePatas=qtdePatas;
    }
}
