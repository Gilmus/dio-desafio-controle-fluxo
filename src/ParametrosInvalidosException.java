import java.io.FileNotFoundException;

public class ParametrosInvalidosException extends FileNotFoundException {

    public ParametrosInvalidosException(){

        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

}
