package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class SortingBallsTest {


    @Test
    void bubbleSortTest() {
        //Arrange
        int[] expectedArr = {1, 2, 3, 4};
        int[] testArr = {3, 4, 1, 2};

        //Act
        int[] result = SortingBalls.bubbleSort(testArr);

        //Assert
        assertArrayEquals(expectedArr, result);

    }
}