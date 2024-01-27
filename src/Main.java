//import static comabc.dasdf.*;

import comabc.*;

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

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler(Main.class.getSimpleName()+".log");
            fh.setFormatter(new SimpleFormatter());
            fh.setFilter(x -> x.getLevel() == Level.SEVERE);
            LOGGER.addHandler(fh);
//            LOGGER.addHandler(new ConsoleHandler());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        var d = new Db();
        var cloned =  d.clone();
        LOGGER.log(Level.INFO, "hahaha-give me that 123");
        LOGGER.log(Level.SEVERE, "hahaha-give me that 789");

        LOGGER.log(Level.INFO, "hahaha-give me that 123");
    }
    public record Emp(int id, String name){}
}

public class Db implements Cloneable {
    @Override
    public Db clone() {
        try {
            return (Db) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    private static class LazyHolder {
        static final Db INSTANCE = new Db();
    }
    public static Db getInstance(){
        return LazyHolder.INSTANCE;
    }
}

