import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    List<Reservation> reservationList;

    public HotelReservationSystem() {
        this.reservationList = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        this.reservationList.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservationList.remove(reservation);
    }

    public List<Reservation> viewAll() {
        return reservationList;
    }

    public void confirmReservation(int number) {
        for (Reservation reservation : reservationList) {
            if (reservation.getReservationNumber() == number) {
                reservation.setConfirmation(true);
                System.out.println("Prenotazione confermata");
            } else {
                System.out.println("Prenotazione annullata");
            }
        }

    }
    public void showLast30DaysReservations(){
        OffsetDateTime last30Days = OffsetDateTime.now().minusDays(30);

        for (Reservation reservation : reservationList){
            if(reservation.getCheckinDate().isAfter(last30Days)){
                System.out.println("Queste sono le prenotazioni: " + reservation.getReservationNumber());
            }else{
                System.out.println("Non ci sono prenotazioni negli ultimi 30 giorni");
            }
        }
    }
}
//Effettuare una nuova prenotazione.
//Annullare una prenotazione esistente.
//Visualizzare l'elenco completo delle prenotazioni.
//Confermare una prenotazione specifica
//Utilizzare il main per testare che tutte le funzionalità eseguano i propri compiti.