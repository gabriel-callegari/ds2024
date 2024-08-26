
public class InformacaoAluno {
    private String nome;
    private String curso;
    private String disciplina;
    private int bimestre;
    private double nota;

    
    public InformacaoAluno(String nome, String curso, String disciplina, int bimestre, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.bimestre = bimestre;
        this.nota = nota;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para exibir informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Bimestre: " + bimestre);
        System.out.println("Nota: " + nota);
    }

    public static void main(String[] args) {
        // Criando um objeto InformacaoAluno
        InformacaoAluno aluno = new InformacaoAluno("João da Silva", "Engenharia", "Matemática", 1, 8.5);
        
        // Exibindo informações do aluno
        aluno.exibirInformacoes();
    }
}
