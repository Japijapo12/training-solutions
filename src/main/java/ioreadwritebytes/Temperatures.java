package ioreadwritebytes;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte d : data) {
            sum += d;
        }
        return sum / 365;
    }

    public double getMonthAverage() {
        double average = 0;
        for (int i = data.length - 1; i > data.length - 31; i--) {
            average += data[i];
        }
        return average / 30;
    }
}

//Hőmérsékleti statisztika
//Az előző 365 nap hőmérsékleti adatait fájlban tároljuk. A Temperatures osztály
//attribútumában ezek találhatók egy byte[]-ben. Az osztály konstruktorban kapja meg a
//hőmérsékleti adatokat. A getYearAverage() metódusa a teljes év átlaghőmérsékletét
//adja vissza, a getMonthAverage() az utolsó 30 napét. Készíts egy TemperatureReader
//osztályt, mely egyetlen readTemperatures() metódusa bináris fájlból beolvassa az
//eltárolt hőmérsékleteket, és egy Temperatures példánnyal tér vissza! Ugyanennek
//mintájára készíts egy TemperaturesWriter osztályt, amelynek a writeTemperatures()
//metódusa a paraméterként kapott Temperatures példányból bináris fájlba írja a
//hőmérsékleti adatokat!
