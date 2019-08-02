import java.util.GregorianCalendar;

public class Relogio {
    private int ponteiroHora(long hora, long minuto){


        return (int)(0.5 * (hora*60 + minuto));
    }

    private int ponteiroMinuto(long minuto){

        return (int)minuto*6;
    }

    public long retornaAnguloRelogio(GregorianCalendar horario){
        int hora = ponteiroHora(horario.getTime().getHours(),horario.getTime().getMinutes());
        int minuto = ponteiroMinuto(horario.getTime().getMinutes());

        int ang = Math.abs(hora - minuto);

        ang = 360-ang;
        return ang;
    }
}
