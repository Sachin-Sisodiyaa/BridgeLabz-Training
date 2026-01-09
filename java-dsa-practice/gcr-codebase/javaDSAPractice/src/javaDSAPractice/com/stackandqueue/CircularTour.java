package javaDSAPractice.com.stackandqueue;

public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0;
        int currentPetrol = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            currentPetrol += petrol[i] - distance[i];

            if (currentPetrol < 0) {
                deficit += currentPetrol;
                start = i + 1;
                currentPetrol = 0;
            }
        }

        return (currentPetrol + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(findStartingPoint(petrol, distance));
    }
}
