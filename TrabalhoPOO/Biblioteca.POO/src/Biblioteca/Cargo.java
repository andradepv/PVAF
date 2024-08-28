package Biblioteca;

//Paulo Victor Souto Andrade - 2315080046
//Ana Flavia de Castro Segadilha da Silva - 2315080055

public class Cargo {
    private String codigo;
    private String nome;
    private String descricao;
    private int cargaHoraria;

    public Cargo(String codigo, String nome, String descricao, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String dadosCargo() {
	    return "Cargo Código = " + codigo + ", Nome = " + nome + ", Descrição = " + descricao + ", Carga Horária=" + cargaHoraria;
	}

    
}

