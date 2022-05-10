package crivodeeratostenes;

import java.math.BigInteger;
import java.util.ArrayList;

public class CrivoDeEratostenes {

    public static void reducePrimeList(BigInteger pivo, ArrayList<BigInteger> list) {
        for (int i = 0; i < list.size(); i++) {
            BigInteger value = list.get(i);

            if (!value.equals(pivo) && value.mod(pivo).equals(BigInteger.valueOf(0))) {
                list.remove(i);
            }
        }
    }

    public static ArrayList<BigInteger> getPrimeUntil(int limit) {
        ArrayList<BigInteger> listOfNumbers = new ArrayList<BigInteger>();

        //Fill List
        for (int i = 2; i <= limit; i++) {
            listOfNumbers.add(BigInteger.valueOf(i));
        }

        //Removing number that are not prime number
        for (int i = 0; i < listOfNumbers.size(); i++) {
            reducePrimeList(listOfNumbers.get(i), listOfNumbers);
        }

        return listOfNumbers;
    }

    public static void main(String[] args) {
        ArrayList<BigInteger> listOfNumbers = getPrimeUntil(10);

        for (int i = 0; i < listOfNumbers.size(); i++) {
            System.out.println(listOfNumbers.get(i));
        }
    }

}
