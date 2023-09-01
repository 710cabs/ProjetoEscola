import java.time.LocalDate;

public class Professor extends BaseFuncionario {

    private String cadeira;

    public String getCadeira() {
        return cadeira;
    }

    public Professor(int codigo, LocalDate data, String endereco, String telefone, String nome, String rg, String cpf,
            LocalDate data2, String cracha, String registro, LocalDate dataVinculoInicial, LocalDate dataVinculoFinal,
            String cadeira) {
        super(codigo, data, endereco, telefone, nome, rg, cpf, data2, cracha, registro, dataVinculoInicial,
                dataVinculoFinal);
        this.cadeira = cadeira;
    }
    
}
