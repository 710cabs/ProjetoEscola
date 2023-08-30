import java.time.LocalDate;

public abstract class BasePessoaFisica extends BasePessoa {
    
    protected String nome;
    protected String rg;
    protected String cpf;
    protected LocalDate data;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public BasePessoaFisica(int codigo, LocalDate data, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate data2) {
        super(codigo, data, endereco, telefone);
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        data = data2;
    }

}
