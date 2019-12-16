package trabalhoTime;

public class Time {
<<<<<<< HEAD
    private String nome = "Flamengo";
    private String categoria = "Futebol";
=======

    private String nome = "indefinido";
    private String categoria = "futebol";
>>>>>>> e44f64ea2bf768043c425e47fe56a90953f9d9ee
    private String historico = "indefinido";
    private int anoCriacao = 2019;
    private int quantidadeSocios = 0;

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
                nome + anoCriacao + categoria + historico + quantidadeSocios + CalcularIdade());
    }

    public void adicionarSocios(final int novoSocios) {
        this.quantidadeSocios += novoSocios;


    }
    public void contagemRegressiva(){
        calculo = (100 - idade);

        System.out.println("faltam" + calculo + "para o centenario");
    }
<<<<<<< HEAD


}
=======
}
>>>>>>> e44f64ea2bf768043c425e47fe56a90953f9d9ee
