package trabalhoTime;

public class Time {

    public Time(String nome, String categoria) {
        super();
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public int getQuantidadeSocios() {
        return quantidadeSocios;
    }

    public void setQuantidadeSocios(int quantidadeSocios) {
        this.quantidadeSocios = quantidadeSocios;
    }


    public int CalcularIdade() {
        return 2019 - anoCriacao;

  }

    public void imprimeInfo() {
        System.out.println(
                get.nome + get.anoCriacao + get.categoria + get.historico + get.quantidadeSocios + get.CalcularIdade);
    }

    public void adicionarSocios(final int novoSocios) {
        this.quantidadeSocios += novoSocios;

    }
}
