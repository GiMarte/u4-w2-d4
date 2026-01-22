package gianmarte;

import gianmarte.classes.Ordine;
import gianmarte.classes.Prodotto;
import gianmarte.classes.Utente;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        Utente u1 = new Utente(1L, "Carlo", 1);
        Utente u2 = new Utente(2L, "Pierpaolo", 2);
        Utente u3 = new Utente(3L, "Giangiorgio", 5);
        Utente u4 = new Utente(5L, "Cecco", 15);


        Prodotto p1 = new Prodotto(15.00, "Baby", "Lego", 1L);
        Prodotto p2 = new Prodotto(3000.00, "Tech", "RTX 5090TI", 2L);
        Prodotto p3 = new Prodotto(150.00, "Boys", "Mouse", 3L);
        Prodotto p4 = new Prodotto(150.00, "Books", "Bibbia", 4L);
        Prodotto p5 = new Prodotto(90.00, "Books", "Shades of grey", 5L);

        List<Prodotto> magazzino = Arrays.asList(p1, p2, p3, p4, p5);

        Ordine o1 = new Ordine(1L, "Inviato", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 20), Arrays.asList(p1, p2), u2);
        Ordine o2 = new Ordine(1L, "Consegnato", LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 15), Arrays.asList(p3), u3);
        Ordine o3 = new Ordine(1L, "Inviato", LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 5), Arrays.asList(p4), u4);
        Ordine o4 = new Ordine(1L, "Nuovo", LocalDate.of(2021, 2, 8), LocalDate.of(2021, 3, 1), Arrays.asList(p5), u1);

        List<Ordine> ordini = Arrays.asList(o1, o2, o3, o4);

        Map<Utente, List<Ordine>> utenti = ordini.stream()
                                                 .collect(Collectors.groupingBy(Ordine::getUtente));

        utenti.forEach((utente, ordine) -> System.out.println("Utente: " + utente + " Ha ordinato: " + ordine));


    }
}
