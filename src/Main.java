//import static comabc.dasdf.*;

import comabc.*;
import jdk.jfr.FlightRecorder;

import javax.swing.text.html.Option;
import java.awt.*;
import java.io.*;
import java.lang.annotation.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Set;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.logging.*;
import java.util.logging.Formatter;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import java.nio.file.Files;
import java.nio.file.*;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());



    public static void main(String[] args){
        var list = List.of("1","2");
        list.stream().filter(x -> x.equals("2"))
                .map(x -> x + "z").forEach(System.out::println);
    }

    public static String getSomething(){return"aa";}

    public record Emp(int id, String name){}
}


