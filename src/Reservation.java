import java.time.OffsetDateTime;

public class Reservation {
    private int reservationNumber;
    private OffsetDateTime checkinDate;
    private OffsetDateTime checkOutDate;
    private boolean confirmation;

    public Reservation(int reservationNumber, OffsetDateTime checkinDate, OffsetDateTime checkOutDate, boolean confirmation) {
        this.reservationNumber = reservationNumber;
        this.checkinDate = checkinDate;
        this.checkOutDate = checkOutDate;
        this.confirmation = confirmation;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public OffsetDateTime getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(OffsetDateTime checkinDate) {
        this.checkinDate = checkinDate;
    }

    public OffsetDateTime getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(OffsetDateTime checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNumber=" + reservationNumber +
                ", checkinDate='" + checkinDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", confirmation=" + confirmation +
                '}';
    }
}
//La classe Reservation rappresenta una singola prenotazione in un hotel. Ogni prenotazione ha un numero di prenotazione,
// una data di check-in, una data di check-out e uno stato che indica se è stata confermata o meno. La classe dovrebbe avere i seguenti attributi privati:
//reservationNumber: il numero della prenotazione.
//checkInDate: la data di check-in della prenotazione.