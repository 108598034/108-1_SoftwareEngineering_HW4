package com.company;
import static org.junit.jupiter.api.Assertions.*;
class LetterGradeTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void letterGrade_EquivalencePartitioning() {
        int score;

        for (score = 150 ; score > 100 ; score --) // {score > 100, <score, ‘X’>}
            assertEquals('X', LetterGrade.letterGrade(score));

        for (score = 100 ; score >= 90 ; score --) // {score >= 90 && score <= 100, <score, ‘A’>}
            assertEquals('A', LetterGrade.letterGrade(score));

        for (score = 89 ; score >= 80 ; score --) // {score >= 80 && score < 90, <score, ‘B’>}
            assertEquals('B', LetterGrade.letterGrade(score));

        for (score = 79 ; score >= 70 ; score --) // {score >= 70 && score < 80, <score, ‘C’>}
            assertEquals('C', LetterGrade.letterGrade(score));

        for (score = 69 ; score >= 60 ; score --) // {score >= 60 && score < 70, <score, ‘D’>}
            assertEquals('D', LetterGrade.letterGrade(score));

        for (score = 59 ; score >= 0 ; score --) // {score >= 0 && score < 60, <score, ‘F’>}
            assertEquals('F', LetterGrade.letterGrade(score));

        for (score = -1 ; score >= -150 ; score --) // {score < 0, <score, ‘X’>}
            assertEquals('X', LetterGrade.letterGrade(score));
    }

    @org.junit.jupiter.api.Test
    void letterGrade_BoundaryValueAnalysis() {
        assertEquals('X', LetterGrade.letterGrade(101)); // {score > 100, <101, ‘X’>}
        assertEquals('A', LetterGrade.letterGrade(100)); // {score >= 90 && score <= 100, <100, ‘A’>}
        assertEquals('A', LetterGrade.letterGrade(90)); // {score >= 90 && score <= 100, <90, ‘A’>}
        assertEquals('B', LetterGrade.letterGrade(89)); // {score >= 80 && score < 90, <89, ‘B’>}
        assertEquals('B', LetterGrade.letterGrade(80)); // {score >= 80 && score < 90, <80, ‘B’>}
        assertEquals('C', LetterGrade.letterGrade(79)); // {score >= 70 && score < 80, <79, ‘C’>}
        assertEquals('C', LetterGrade.letterGrade(70)); // {score >= 70 && score < 80, <70, ‘C’>}
        assertEquals('D', LetterGrade.letterGrade(69)); // {score >= 60 && score < 70, <69, ‘D’>}
        assertEquals('D', LetterGrade.letterGrade(60)); // {score >= 60 && score < 70, <60, ‘D’>}
        assertEquals('F', LetterGrade.letterGrade(59)); // {score >= 0 && score < 60, <59, ‘F’>}
        assertEquals('F', LetterGrade.letterGrade(0)); // {score >= 0 && score < 60, <0, ‘F’>}
        assertEquals('X', LetterGrade.letterGrade(-1)); // {score >= 0 && score < 60, <-1, ‘X’>}
    }
}