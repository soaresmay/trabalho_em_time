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

<<<<<<< HEAD
    public int CalcularIdade() {
        return 2009 - anoCriacao;
=======
    public int CalcularIdade(int idade) {
        return idade = 2019 - anoCriacao;
    }

    public void imprimeInfo() {
        System.out.println(
                get.nome + get.anoCriacao + get.categoria + get.historico + get.quantidadeSocios + get.CalcularIdade);
>>>>>>> 49edbff0abce9d0b6cf04fd099176322e79229aa
    }

    public void adicionarSocios(final int novoSocios) {
        this.quantidadeSocios += novoSocios;

    }
}
