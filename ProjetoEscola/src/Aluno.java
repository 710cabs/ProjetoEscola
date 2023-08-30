import java.time.LocalDate;

public class Aluno extends BasePessoaFisica {

    private String matricula;
    private LocalDate dataMatricula;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Aluno(int codigo, LocalDate data, String endereco, String telefone, String nome, String rg, String cpf,
            LocalDate data2, String matricula, LocalDate dataMatricula) {
        super(codigo, data, endereco, telefone, nome, rg, cpf, data2);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    
}
