package comabc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class empTest {

    @Test
    @MethodSource("DataProvider")
    void tellTheStory() {
    }
    public static Stream<Arguments> DataProvider(){
        return Stream.of(
                Arguments.of("aa",22),
                Arguments.of("bb",11)
                );
    }
}

