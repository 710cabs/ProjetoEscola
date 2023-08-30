import java.time.LocalDate;

public abstract class BasePessoaJuridica extends BasePessoa{

    protected String nomeFantasia;
    protected String razaoSocial;
    protected String cnpj;
    protected String ie;
    protected LocalDate data;
   
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getIe() {
        return ie;
    }
    public void setIe(String ie) {
        this.ie = ie;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public BasePessoaJuridica(int codigo, LocalDate data, String endereco, String telefone, String nomeFantasia,
            String razaoSocial, String cnpj, String ie, LocalDate data2) {
        super(codigo, data, endereco, telefone);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ie = ie;
        data = data2;
    }
    
}
