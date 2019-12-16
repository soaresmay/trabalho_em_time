package trabalhoTime;

public class Time {

    private String nome;
    private String categoria;
    private String historico;
    private int anoCriacao = 0;
    private int quantidadeSocios;

    public Time(String nome, String categoria) {
        super();
        this.nome = nome;
        this.categoria = categoria;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public void setQuantidadeSocios(int quantidadeSocios) {
        this.quantidadeSocios = quantidadeSocios;
    }

    public int CalcularIdade(int idade) {
        return idade = 2019 - anoCriacao;
    }

    public void imprimeInfo() {
        System.out.println(
                get.nome + get.anoCriacao + get.categoria + get.historico + get.quantidadeSocios + get.CalcularIdade);
    }

}
