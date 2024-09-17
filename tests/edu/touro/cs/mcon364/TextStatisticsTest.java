package edu.touro.cs.mcon364;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;


public class TextStatisticsTest{
    @Test
    public void wordCountTest1(){
        // Arrange
        String text = "";

        // Act
        int actual = TextStatistics.wordCount(text);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    public void wordCountTest2(){
        // Arrange
        String text = "testing";

        // Act
        int actual = TextStatistics.wordCount(text);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    public void wordCountTest3(){
        // Arrange
        String text = "testing testing 123";

        // Act
        int actual = TextStatistics.wordCount(text);

        // Assert
        assertEquals(3, actual);
    }

    @Test
    public void uniqueWordCountTest(){
        // Arrange
        String text = "testing testing 123";

        // Act
        int actual = TextStatistics.uniqueWordCount(text);

        // Assert
        assertEquals(2, actual);
    }

    @Test
    public void wordStatsTest(){
        // Arrange
        String text = "testing testing 123";

        // Act
        Map<String, Integer> stats = TextStatistics.wordStats(text);
        int actual = stats.get("testing");

        // Assert
        assertEquals(2, actual);
    }

    @Test
    public void letterCountTest(){
        // Arrange
        String text = "testing testing 123";

        // Act
        int actual = TextStatistics.letterCount(text);

        // Assert
        assertEquals(10, actual);
    }

    @Test
    public void letterStatsTest(){
        // Arrange
        String text = "testing testing 123";

        // Act
        Map<Character, Integer> stats = TextStatistics.letterStats(text);
        int actual = stats.get('t');

        // Assert
        assertEquals(4, actual);
    }
}
