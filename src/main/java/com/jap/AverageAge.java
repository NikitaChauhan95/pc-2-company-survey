package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;

        try{
            //Write the logic
          float [] ageRawDataDouble = new float[ageRawData.length];
            double sum = 0;
          for (int index = 0; index < ageRawData.length; index++) {
              ageRawDataDouble[index] = Float.parseFloat(ageRawData[index]);
              //avg = sum of numbers / total number

              sum += ageRawDataDouble[index];
              //sum++;
              avg = sum / ( ageRawDataDouble.length);

          }

            //Handle specific exception
        }catch (NumberFormatException exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }



}
