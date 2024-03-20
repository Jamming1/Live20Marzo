import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        Reservation reservation = new Reservation(1, OffsetDateTime.parse("2024-03-10T12:00:00Z"),OffsetDateTime.parse("2024-05-10T12:00:00Z"),true);
        Reservation reservation2 = new Reservation(2, OffsetDateTime.parse("2024-04-10T12:00:00Z"),OffsetDateTime.parse("2024-06-10T12:00:00Z"),true);
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addReservation(reservation);
        hotelReservationSystem.addReservation(reservation2);
//        System.out.println(hotelReservationSystem.viewAll());
//        hotelReservationSystem.removeReservation(reservation);
//        System.out.println(hotelReservationSystem.viewAll());
//        hotelReservationSystem.confirmReservation(2);
        hotelReservationSystem.showLast30DaysReservations();

    }
}

//Aggiungi la possibilità di visualizzare le prenotazioni negli ultimi 30 giorni, formattando la data in un formato leggibile