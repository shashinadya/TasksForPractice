package train;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class TrainHandler {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("London", 14, LocalDateTime.of(2022, 12, 30, 11, 23));
        trains[1] = new Train("Praha", 21, LocalDateTime.of(2022, 12, 4, 6, 20));
        trains[2] = new Train("Drezden", 3, LocalDateTime.of(2022, 12, 11, 14, 10));
        trains[3] = new Train("London", 11, LocalDateTime.of(2022, 12, 29, 20, 40));
        trains[4] = new Train("Vena", 1, LocalDateTime.of(2022, 12, 31, 13, 21));

        sortTrainsByTrainNumber(trains);
        isThereTrainsWithTheSameDestinationName(trains);
    }

    public static void sortTrainsByTrainNumber(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return Integer.compare(o1.trainNumber, o2.trainNumber);
            }
        });
        for (Train train : trains) {
            System.out.println(train);
        }
    }


    public static boolean isThereTrainsWithTheSameDestinationName(Train[] trains) {
        boolean IsDestinationNameTheSame = false;
        for (int i = 1; i < trains.length; i++) {
            if (trains[i].destinationName.equals(trains[i - 1].destinationName)) {
                IsDestinationNameTheSame = true;
                break;
            } else continue;
        }
        System.out.println(IsDestinationNameTheSame);
        return IsDestinationNameTheSame;
    }
}
