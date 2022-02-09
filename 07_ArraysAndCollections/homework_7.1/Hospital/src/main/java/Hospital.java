public class Hospital {
    public final static float MIN_TEMPERATURE = 32;
    public final static float MAX_TEMPERATURE = 40;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperature = new float[patientsCount];   // массив количества пациентов
        for (int i = 0; i < patientsTemperature.length; i++) { // для заданного количества пациентов определяется
            float value = (float) (Math.random() * (MAX_TEMPERATURE - MIN_TEMPERATURE)) + MIN_TEMPERATURE; // случайным образом генерируется значение температуры из заданного диапазона
            patientsTemperature[i] = value;  // присваивается случайное значение пациенту
        }
        return patientsTemperature;
    }
    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        float sumTemperature = 0;
        int countOfPatients = 0;
        String temperatureAllPatients = "";

        for (int i = 0; i < temperatureData.length; i++) {  //
            temperatureAllPatients += temperatureData[i] + " "; // температура всех пациентов
            sumTemperature += temperatureData[i];  //
            if (temperatureData[i] >= 36.2F && temperatureData[i] <= 36.9F) {  // если есть температура в заданном диапазоне
                countOfPatients++;  // прибаление здорового пациента
            }
        }
        float averageTemperature = (float) (Math.floor((sumTemperature / temperatureData.length) * Math.pow(10, 2)) / Math.pow(10, 2));  // средняя температура по больнице
        String report = "Температуры пациентов: " + temperatureAllPatients.trim() +
                "\nСредняя температура: " + averageTemperature +
                "\nКоличество здоровых: " + countOfPatients;
        return report;
    }
}