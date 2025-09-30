
package Modelos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author 0062953
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private Double salario;
    private Calendar data = Calendar.getInstance() ;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }
    public void dadospessoa(){
        System.out.println(this.codigo);
        System.out.println(this.nome);
        System.out.println(this.salario);
    }
    public void data(){
        Date date;
        Calendar cal = null;
        try {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        date = (Date)formatter.parse("14/07/2022");
        cal=Calendar.getInstance();
        cal.setTime(date);
        } catch(ParseException ex) {
            System.out.println("Fu...");
        }
        
        System.out.println(cal.getTimeInMillis());
    }
}
