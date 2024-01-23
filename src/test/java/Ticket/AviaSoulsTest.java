package Ticket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    AviaSouls aviaSouls = new AviaSouls();
    Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 3000, 1520, 1620);
    Ticket ticket2 = new Ticket("Москва", "Санкт-Петербург", 4000, 2020, 2220);
    Ticket ticket3 = new Ticket("Москва", "Санкт-Петербург", 5000, 1700, 1820);
    Ticket ticket4 = new Ticket("Екатеринбург", "Москва", 10000, 500, 800);
    Ticket ticket5 = new Ticket("Казань", "Сочи", 15000, 800, 1000);

    Ticket ticket6 = new Ticket("Москва", "Санкт-Петербург", 2000, 1720, 1820);


    @BeforeEach

    public void setup() {
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
    }

    @Test

    public void findFewTicketsFromToTest() {
        Ticket[] actual = aviaSouls.search("Москва", "Санкт-Петербург");
        Ticket[] expected = {ticket6, ticket1, ticket2, ticket3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findOneTicketFromTo() {
        Ticket[] actual = aviaSouls.search("Казань", "Сочи");
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findZeroTicketFromTo() {
        Ticket[] actual = aviaSouls.search("Казань", "Калининград");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findFewTicketsTimeFromTimeToTest() {
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] actual = aviaSouls.searchAndSortBy("Москва", "Санкт-Петербург", comparator);
        Ticket[] expected = {ticket1, ticket6, ticket3, ticket2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findOneTicketTimeFromTimeTo() {
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] actual = aviaSouls.searchAndSortBy("Казань", "Сочи", comparator);
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findZeroTicketTimeFromTimeTo() {
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] actual = aviaSouls.searchAndSortBy("Казань", "Калининград", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }


}

