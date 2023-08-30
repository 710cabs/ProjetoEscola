import java.time.LocalDate;

 public abstract class BaseDadosComuns extends BaseIdentificador {

    protected LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BaseDadosComuns(int codigo, LocalDate data) {
        super(codigo);
        this.data = data;
    }


    
}

