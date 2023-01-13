package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SortingCharsTest {

    @Test
    void sortCharsTest() {
        //Arrange
        String str = "When not studying nuclear physics, Bambi likes to play beach volleyball.";
        String expectedStr = "aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy";

        //Act
        String result = SortingChars.sortChars(str);

        //Assert
        Assertions.assertEquals(expectedStr, result);

    }
}