import java.time.LocalDate;

public abstract class BaseFuncionario extends BasePessoaFisica {

    protected String cracha;
    protected String registro;
    protected LocalDate dataVinculoInicial;
    protected LocalDate dataVinculoFinal;
   
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataVinculoInicial() {
        return dataVinculoInicial;
    }
    public void setDataVinculoInicial(LocalDate dataVinculoInicial) {
        this.dataVinculoInicial = dataVinculoInicial;
    }
    public LocalDate getDataVinculoFinal() {
        return dataVinculoFinal;
    }
    public void setDataVinculoFinal(LocalDate dataVinculoFinal) {
        this.dataVinculoFinal = dataVinculoFinal;
    }

     public BaseFuncionario(int codigo, LocalDate data, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate data2, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal) {
        super(codigo, data, endereco, telefone, nome, rg, cpf, data2);
        this.cracha = cracha;
        this.registro = registro;
        this.dataVinculoInicial = dataVinculoInicial;
        this.dataVinculoFinal = dataVinculoFinal;
    }
    
}
