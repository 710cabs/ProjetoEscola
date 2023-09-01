import java.time.LocalDate;

public class Tecnico extends BaseFuncionario {
    
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Tecnico(int codigo, LocalDate data, String endereco, String telefone, String nome, String rg, String cpf,
            LocalDate data2, String cracha, String registro, LocalDate dataVinculoInicial, LocalDate dataVinculoFinal,
            String setor) {
        super(codigo, data, endereco, telefone, nome, rg, cpf, data2, cracha, registro, dataVinculoInicial,
                dataVinculoFinal);
        this.setor = setor;
    }
   
}
