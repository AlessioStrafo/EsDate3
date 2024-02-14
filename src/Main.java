//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataAnno = data.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println(dataAnno);
        String dataMese = data.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println(dataMese);
        String dataGiorno = data.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println(dataGiorno);
        String giornoSettimana = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(giornoSettimana);
    }
}