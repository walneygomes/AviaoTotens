package Subjects;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import Objects.Totens;

public interface Voo {
   
	public void addObservers(Totens totens);
	public void adicionarInformacao(int numeroDoVoo, String empresa,String[] horarios);
	public void removerObservers(Totens totens);
     

}
