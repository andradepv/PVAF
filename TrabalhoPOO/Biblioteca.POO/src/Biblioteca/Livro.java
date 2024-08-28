package Biblioteca;

//Paulo Victor Souto Andrade - 2315080046
//Ana Flavia de Castro Segadilha da Silva - 2315080055

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int numeroPaginas;
    private String ISBN;
    private String genero;
    private String sinopse;
    private String idioma;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, int numeroPaginas, String ISBN, String genero, String sinopse, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.ISBN = ISBN;
        this.genero = genero;
        this.sinopse = sinopse;
        this.idioma = idioma;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String dadosLivro() {
	    return "Livro Titulo = " + titulo + ", Autor = " + autor + ", Editora = " + editora + ", Ano Publicação=" + anoPublicacao + 
	    		", Número Páginas =" + numeroPaginas + ", ISBN = " + ISBN + ",Gênero = " + genero +  ", Sinopse = " + sinopse + ", Idioma = " + idioma;          
	}



}

