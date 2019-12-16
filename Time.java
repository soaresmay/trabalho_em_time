package trabalhoTime;

public class Time {

    private String nome;
    private String categoria;
    private int futebol;
    private String historico;
    private int anoCriacao;
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

}
