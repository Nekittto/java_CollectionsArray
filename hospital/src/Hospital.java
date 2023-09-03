import java.text.DecimalFormat;
import java.util.Random;

public class Hospital {
    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperature = new float[patientsCount];
        for (int i = 0; i < temperature.length; i++)
        {
            temperature[i] = (float)(Math.round(getFromRange(32.0f, 39.0f) * 10.0f)/ 10.0f);
        }
        return temperature;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        int healthyPatients = 0;
        float averageTemp = 0;

        for (int i = 0; i <= temperatureData.length - 1; i++){
            averageTemp += temperatureData[i] / temperatureData.length;
            if (temperatureData[i] <= 37.2 && temperatureData[i] >= 35.9) {
                healthyPatients++;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String resultAverage = decimalFormat.format(averageTemp);

        String report =
                "Температуры пациентов: " + getTemperatureStringFromTemparatureArray(temperatureData) +
                        "\nСредняя температура: " + resultAverage +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
    static float getFromRange(float min, float max){
        Random random = new Random();
        return random.nextFloat(max - min + 1) + min;
    }
    static String getTemperatureStringFromTemparatureArray(float[] temparatureArray) {
        StringBuilder allTemp = new StringBuilder();
        for(Float i : temparatureArray){
            allTemp.append(i).append(" ");
        }
        return allTemp.toString().trim();
    }

}
