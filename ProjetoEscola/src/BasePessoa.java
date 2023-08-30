import java.time.LocalDate;

public abstract class BasePessoa extends BaseDadosComuns {

    protected String endereco;
    protected String telefone;
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public BasePessoa(int codigo, LocalDate data, String endereco, String telefone) {
        super(codigo, data);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    
}
