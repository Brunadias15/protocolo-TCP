import java.io.Serializable;
import java.util.Random;

public class Mensagem implements Serializable {
	

	public String getMsg() {
            
	Random gerador = new Random(); 
        int x = gerador.nextInt();
        String msg = "Bem-vindo!";
        switch (x%3){
        case 0:
            msg = "TADS6 - Desenvolvimento de Sistemas Distribuídos";
            break;
        case 1:
            msg = "Bom trabalho!!";
            break;
        case 2:
            msg = "Hello World";
            break;
        }
        System.out.println(msg);
            return msg;
    }
	
}
