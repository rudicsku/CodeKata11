package org.example;


public class SortingChars {
    public static void main(String[] args) {
        System.out.println(sortChars("When not studying nuclear physics, Bambi likes to play\n" +
                "beach volleyball."));
    }

    public static String sortChars(String sentence) {

        String modifiedString = sentence.toLowerCase().replaceAll("[^(a-zA-Z0-9)]", " ").replaceAll("\\s", "");
        char[] chars = modifiedString.toCharArray();

        bubbleSort(chars);

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            String str = String.valueOf(c);
            sb.append(str);
        }
        return sb.toString();
    }

    private static void bubbleSort(char[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = (char) temp;
                }
            }
        }
    }

}
