class TicketCounter {
    int availableSeats = 5;

    // synchronized: only one thread can book at a time (prevents overbooking)
    synchronized void bookTicket(int seats) {
        System.out.println(Thread.currentThread().getName() + " is trying to book " + seats + " seat(s)");
        if (availableSeats >= seats) {
            availableSeats -= seats;
            System.out.println(Thread.currentThread().getName() + " booked " + seats
                    + " seat(s). Seats left = " + availableSeats);
        } else {
            System.out.println(Thread.currentThread().getName() + ": Not enough seats. Seats left = "
                    + availableSeats);
        }
    }
}

// Version 1: extends Thread (same style as MyThread in bankThreadEx)
class BookingThread extends Thread {
    TicketCounter counter;
    int seats;

    BookingThread(TicketCounter counter, int seats, String name) {
        super(name);
        this.counter = counter;
        this.seats = seats;
    }

    @Override
    public void run() {
        counter.bookTicket(seats);
    }
}

// Version 2: implements Runnable (same style as your commented-out version)
class BookingTask implements Runnable {
    TicketCounter counter;
    int seats;

    BookingTask(TicketCounter counter, int seats) {
        this.counter = counter;
        this.seats = seats;
    }

    @Override
    public void run() {
        counter.bookTicket(seats);
    }
}

public class Ticketthreadex {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter counter = new TicketCounter();

        // Using extends Thread
        BookingThread t1 = new BookingThread(counter, 3, "User-1");
        BookingThread t2 = new BookingThread(counter, 3, "User-2");
        t1.start();
        t2.start();

        // wait for both threads to finish before moving on
        t1.join();
        t2.join();

        System.out.println("---- Now using Runnable ----");

        // Using implements Runnable
        Thread t3 = new Thread(new BookingTask(counter, 1), "User-3");
        Thread t4 = new Thread(new BookingTask(counter, 2), "User-4");
        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Final seats left = " + counter.availableSeats);
    }
}