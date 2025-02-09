package Biblioteca;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Paulo Victor Souto Andrade - 2315080046
// Ana Flavia de Castro Segadilha da Silva - 2315080055

public class Biblioteca {
    private List<Professor> professores;
    private List<Funcionario> funcionarios;
    private List<Aluno> alunos;
    private List<Livro> livros;
    private List<Cargo> cargos;
    private Scanner scanner;

    public Biblioteca() {
        this.professores = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.cargos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public UsuarioABS login(String cpf, int senha) {
        for (Professor professor : professores) {
            if (professor.getCPF().equals(cpf) && professor.getSenha() == senha) {
                return professor;
            }
        }
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCPF().equals(cpf) && funcionario.getSenha() == senha) {
                return funcionario;
            }
        }
        return null;
    }

    public void cadastrarProfessor(Professor professor) {
    	System.out.println("A senha do professor é " + professor.getSenha());
        professores.add(professor);
    }

    public void listarProfessores() {
    	System.out.println();
        for (Professor professor : professores) {
            System.out.println(professor.meusDados());
        }
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
    	System.out.println();
        for (Aluno aluno : alunos) {
            System.out.println(aluno.meusDados());
        }
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
    	System.out.println("A senha do funcionario é " + funcionario.getSenha());
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
    	System.out.println();
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.meusDados());
        }
    }

    public void cadastrarCargo(Cargo cargo) {
        cargos.add(cargo);
    }

    public void listarCargos() {
    	System.out.println();
        for (Cargo cargo : cargos) {
            System.out.println(cargo.dadosCargo());
        }
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
    	System.out.println();
        for (Livro livro : livros) {
            System.out.println(livro.dadosLivro());
        }
    }

    private void loginMenu() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Senha: ");
        int senha = scanner.nextInt();
        scanner.nextLine();

        UsuarioABS usuario = login(cpf, senha);
        if (usuario != null) {
            System.out.println("Login realizado com sucesso! Bem-vindo, " + usuario.getNome());
            if (usuario instanceof Professor) {
                menuProfessor((Professor) usuario);
            } else if (usuario instanceof Funcionario) {
                menuFuncionario((Funcionario) usuario);
            }
        } else {
            System.out.println("CPF ou senha inválidos!");
        }
    }

    private void menuProfessor(Professor professor) {
        while (true) {
            System.out.println("\nMenu Professor:");
            System.out.println("1. Consultar Acervo");
            System.out.println("2. Trocar Usuario");
            System.out.println("0. Desligar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    listarLivros();
                    break;
                case 2:
                    loginMenu();
                    break;
                case 0:
                    System.out.println("Logout realizado com sucesso!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void menuFuncionario(Funcionario funcionario) {
        while (true) {
            System.out.println("\nMenu Funcionário:");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Listar Professores");
            System.out.println("3. Cadastrar Aluno");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Cadastrar Funcionário");
            System.out.println("6. Listar Funcionários");
            System.out.println("7. Cadastrar Cargo");
            System.out.println("8. Listar Cargos");
            System.out.println("9. Cadastrar Livro");
            System.out.println("10. Listar Livros");
            System.out.println("11. Trocar Usuario");
            System.out.println("0. Desligar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProfessorMenu();
                    break;
                case 2:
                    listarProfessores();
                    break;
                case 3:
                    cadastrarAlunoMenu();
                    break;
                case 4:
                    listarAlunos();
                    break;
                case 5:
                    cadastrarFuncionarioMenu();
                    break;
                case 6:
                    listarFuncionarios();
                    break;
                case 7:
                    cadastrarCargoMenu();
                    break;
                case 8:
                    listarCargos();
                    break;
                case 9:
                    cadastrarLivroMenu();
                    break;
                case 10:
                    listarLivros();
                    break;
                case 11:
                    loginMenu();
                    break;
                case 0:
                    System.out.println("Logout realizado com sucesso!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void cadastrarProfessorMenu() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Titulação: ");
        String titulacao = scanner.nextLine();
        Professor professor = new Professor(cpf, nome, email, titulacao);
        cadastrarProfessor(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }

    private void cadastrarAlunoMenu() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Instituição de Ensino: ");
        String instituicaoEnsino = scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Nota no último ENEM: ");
        float notaEnem = scanner.nextFloat();
        scanner.nextLine();
        Aluno aluno = new Aluno(cpf, nome, email, instituicaoEnsino, curso, notaEnem);
        cadastrarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void cadastrarFuncionarioMenu() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Código do Cargo: ");
        String codigoCargo = scanner.nextLine();
        Cargo cargo = null;
        for (Cargo c : cargos) {
            if (c.getCodigo().equals(codigoCargo)) {
                cargo = c;
                break;
            }
        }
        if (cargo == null) {
            System.out.println("Cargo não encontrado!");
            return;
        }
        System.out.print("Salário: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();
        Funcionario funcionario = new Funcionario(cpf, nome, email, cargo, salario);
        cadastrarFuncionario(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private void cadastrarCargoMenu() {
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Carga Horária: ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();
        Cargo cargo = new Cargo(codigo, nome, descricao, cargaHoraria);
        cadastrarCargo(cargo);
        System.out.println("Cargo cadastrado com sucesso!");
    }

    private void cadastrarLivroMenu() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();
        System.out.print("Número de Páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();
        System.out.print("Idioma: ");
        String idioma = scanner.nextLine();
        Livro livro = new Livro(titulo, autor, editora, anoPublicacao, numeroPaginas, isbn, genero, sinopse, idioma);
        cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public static void main(String[] args) {
    	
        Biblioteca sistema = new Biblioteca();
        Professor professor = new Professor("1234", "Palheta", "prof.palheta@example.com", "Doutorado");
        professor.setSenha(1234);
        Cargo cargo = new Cargo("001", "Bibliotecário", "Responsável pelo acervo", 40);
        Funcionario funcionario = new Funcionario ("4321", "master", "master@exemplo.com", cargo, 5000);
        funcionario.setSenha(1234);
        Aluno ana = new Aluno("7777", "Flavia", "flavia@exemplo.com", "UEA", "Eng.Comp", 975);
        Aluno paulo = new Aluno("8888", "Paulo", "paulo@exemplo.com", "UEA", "Eng.Comp", 620);
        Cargo cargo2 = new Cargo("002", "Recepcionista", "Recepciona os clientes", 40);
        Livro livro = new Livro("Titulo Exemplo", "Autor Exemplo", "Editora Exemplo", 2023, 300, "1234567890", "Ficção", "Uma sinopse", "Português");
        Livro livro1 = new Livro("Java: A Beginner's Guide", "Herbert Schildt", "McGraw-Hill", 2018, 720, "978-1260440218", "Programação", "Guia completo de Java", "Inglês");
        
        sistema.cadastrarAluno(ana);
        sistema.cadastrarAluno(paulo);
        sistema.cadastrarLivro(livro1);
        sistema.cadastrarLivro(livro);
        sistema.cadastrarCargo(cargo);
        sistema.cadastrarCargo(cargo2);
        sistema.cadastrarFuncionario(funcionario);
        sistema.professores.add(professor);
        
        
        sistema.loginMenu();
    }
}
