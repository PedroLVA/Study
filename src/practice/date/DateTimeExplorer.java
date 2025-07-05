package practice.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;

public class DateTimeExplorer {

    public static void main(String[] args) {
        // --- LocalDate, LocalTime, LocalDateTime ---
        System.out.println("--- Basic Date and Time ---");
        LocalDate today = LocalDate.now();

        LocalDate yesterday = LocalDate.now().minusDays(1);

        System.out.println("Today's Date: " + today);

        LocalTime now = LocalTime.now();
        LocalTime nowMinusOneHour = LocalTime.now().minusHours(1);
        System.out.println("Current Time: " + nowMinusOneHour);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Current Date and Time: " + rightNow);

        // --- Creating Specific Dates ---
        System.out.println("\n--- Creating Specific Dates ---");
        LocalDate myBirthday = LocalDate.of(1995, 5, 23);
        LocalDate myBirthday2 = LocalDate.of(2003, 8, 21);
        System.out.println("My Birthday: " + myBirthday);
        System.out.println("My Birthday: " + myBirthday2);

        System.out.println("Day of the week of my birthday: " + myBirthday.getDayOfYear());

        // --- Formatting Dates (DD/MM/YYYY to MM/DD/YYYY) ---
        System.out.println("\n--- Formatting Dates ---");
        DateTimeFormatter dmyFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter mdyFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        String dateString = "23/05/1995";
        LocalDate parsedDate = LocalDate.parse(dateString, dmyFormatter);

        System.out.println("Parsed Date (from dd/MM/yyyy): " + parsedDate);

        String formattedDate = parsedDate.format(mdyFormatter);
        System.out.println("Formatted Date (to MM/dd/yyyy): " + formattedDate);

        // --- Working with Instant and Milliseconds ---
        System.out.println("\n--- Instant and Milliseconds ---");
        Instant timestamp = Instant.now();
        System.out.println("Current Instant (UTC): " + timestamp);

        // Milliseconds from epoch
        long millisFromEpoch = System.currentTimeMillis();
        System.out.println("Current Millis from Epoch: " + millisFromEpoch);

        Instant fromMillis = Instant.ofEpochMilli(millisFromEpoch);
        System.out.println("Instant from Millis: " + fromMillis);

        // --- Duration and Period ---
        System.out.println("\n--- Duration and Period ---");
        LocalDateTime startDateTime = LocalDateTime.of(2024, 1, 1, 10, 0, 0);
        LocalDateTime endDateTime = LocalDateTime.now();
        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println("Duration from start of 2024 until now: " + duration.toHours() + " hours");

        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println("Period from start of 2020 until now: " +
                period.getYears() + " years, " +
                period.getMonths() + " months, and " +
                period.getDays() + " days.");

        // --- ZonedDateTime ---
        System.out.println("\n--- ZonedDateTime ---");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoTime = ZonedDateTime.now(tokyoZone);
        System.out.println("Current time in Tokyo: " + tokyoTime);

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' HH:mm:ss z");
        System.out.println("Formatted Tokyo time: " + tokyoTime.format(fullFormatter));

        //problems
        //my age in days

        LocalDate myDateOfBirth = LocalDate.of(2003, 8, 21);
        LocalDate currentTime = LocalDate.now();

        long daysThatPasse = ChronoUnit.DAYS.between(myDateOfBirth, currentTime);
        long weeksThatPasse = ChronoUnit.WEEKS.between(myDateOfBirth, currentTime);


        System.out.println("Days since I was born: "+ daysThatPasse);
        System.out.println("Days since I was born: "+ weeksThatPasse);


        //This only exists on test

        //some stuff some stuff




    }
}