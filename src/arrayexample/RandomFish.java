package arrayexample;

import java.util.Random;

/**
 * RandomFish Example
 */
public class RandomFish {

    public String generateRandomFish() {
        String randomFish;
        Random randomObject = new Random();
        int randomNumber = randomObject.nextInt(5);
        switch (randomNumber) {
            case 0:
                randomFish = "Blue Fish";
                break;
            case 1:
                randomFish = "Red Drum";
                break;
            case 2:
                randomFish = "Striped Bass";
                break;
            case 3:
                randomFish = "Tautog";
                break;
            default:
                randomFish = "Unknown Fish Type";
                break;
        }
        System.out.println(randomNumber);
        return randomFish;
    }

    public static void main(String[] args) {
        RandomFish rf = new RandomFish();
        System.out.println(rf.generateRandomFish());
    }
}
