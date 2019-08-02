import javax.swing.*;
import java.util.GregorianCalendar;


public class Main {


    public static void main(String[] args) {
        int hora =  Integer.parseInt(JOptionPane.showInputDialog(null,"Inserir o valor da hora"));




        int minuto =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserir o valor dos minutos"));

        if (hora <0 || minuto < 0 || hora >12 || minuto > 60) {
            JOptionPane.showInternalMessageDialog(null,"Entrada invalida");

            return ;
        }
        Relogio relogio = new Relogio();

        GregorianCalendar g = new GregorianCalendar(2019, 08, 02, hora, minuto);
        long ang = relogio.retornaAnguloRelogio(g);

        JOptionPane.showInternalMessageDialog(null,"O angulo entre os 2 ponteiros é : " + ang);


    }
}
