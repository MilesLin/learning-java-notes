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
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import java.nio.file.Files;
import java.nio.file.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>(Map.of("1",1, "2",2));
        HashMap<String, Integer> map2 = new HashMap<>(Map.of("2",2,"1",1));



        var a = Path.of("a");
//        map.entrySet().removeIf(x -> x.getValue() > 1);
//        map.put("222", 123);
        System.out.println(map.equals(map2));
//        HashMap<String, Integer> newMap = new HashMap<>();
//        map.values().stream().filter(
//                x -> {
//                   return Collections.frequency(map.values(), x) > 1;
//                }
//        ).toList();
    }
    public record Emp(int id, String name){}
}

