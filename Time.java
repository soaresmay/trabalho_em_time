package trabalhoTime;

public class Time {

	
private String nome = "indefinido";
private String categoria = "indefinido";
private String historico = "indefinido";
private int futebol = 0 ;
private int anoCriacao = 0;
private int quantidadeSocios = 0;


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
    public int CalcularIdade() {
        return 2009 - anoCriacao;
    }
public void  adicionarSocios(final int novoSocios ) {
	this.quantidadeSocios += novoSocios;
}
}

