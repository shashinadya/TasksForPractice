//Создайте структуру с именем train, содержащую поля: название пункта назначения, номер поезда, время отправления.
// Ввести данные в массив из пяти элементов типа train, упорядочить элементы по номерам поездов. Добавить возможность
// сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть
// упорядочены по времени отправления.
package train;

import java.time.LocalDateTime;
import java.util.Arrays;
public class Train {
    String destinationName;
    int trainNumber;
    LocalDateTime departureTime;

    Train() {
    }

    Train(String destinationName, int trainNumber, LocalDateTime departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }


    @Override
    public String toString() {
        return "Train [destinationName =" + destinationName
                + " , trainNumber =" + trainNumber
                + " , departureTime =" + departureTime + "]";
    }
}
