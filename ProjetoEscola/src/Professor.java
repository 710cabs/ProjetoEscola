import java.time.LocalDate;

public class Professor extends BaseFuncionario {

    private String registro;
    private String cadeira;
    
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCadeira() {
        return cadeira;
    }
    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public Professor(int codigo, LocalDate data, String endereco, String telefone, String nome, String rg, String cpf,
            LocalDate data2, String cracha, String registro, LocalDate dataVinculoInicial, LocalDate dataVinculoFinal,
            String registro2, String cadeira) {
        super(codigo, data, endereco, telefone, nome, rg, cpf, data2, cracha, registro, dataVinculoInicial,
                dataVinculoFinal);
        registro = registro2;
        this.cadeira = cadeira;
    }
    
    
}
