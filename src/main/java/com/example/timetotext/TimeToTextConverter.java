package com.example.timetotext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

final class TimeToTextConverter {

    private String textSuffix;
    private int unitHourValue;
    private String[] unitWords = {"zero","one","two","three","four",
                                  "five","six","seven","eight","nine","ten",
                                  "eleven","twelve","thirteen","fourteen",
                                  "fifteen","sixteen","seventeen","eighteen","nineteen"};
    private String[] tensWords = {"","", "twenty","thirty","forty","fifty"};

    public String time2text(LocalTime time) {
        unitHourValue = time.getHour();
        int minuteValue = time.getMinute();
        int tensMinsValue = minuteValue / 10;
        int unitMinsValue = minuteValue % 10;
        String preffix;
        String suffix = getTextSuffix(unitHourValue, minuteValue);


        // the middle minute part of the time sentence
        String minPart;
        if (unitHourValue==12 && minuteValue==0){
            return textSuffix = "noon";
        }
        else if(unitHourValue==0 && minuteValue==0){
            return textSuffix = "midnight";
        }
        if(minuteValue<20 && (minuteValue!=15)){
            // between 1 to 19
            minPart = unitWords[minuteValue];
            if(minuteValue<10 && minuteValue>0){
                //between 1 to 9
                minPart = "oh " + unitWords[unitMinsValue];
            }
        }
        else{
            List<Integer> minsPastTo = Arrays.asList(40,45,50,55);
           if(minsPastTo.contains(minuteValue)){
               return getMinutePrefix(minuteValue) + unitWords[unitHourValue+1] + suffix;
           }
            List<Integer> minsPastBy = Arrays.asList(5,10,20,15,30);
            if(minsPastBy.contains(minuteValue)){
                return getMinutePrefix(minuteValue) + unitWords[unitHourValue] + suffix;
            }

            minPart = tensWords[tensMinsValue] + "-" + unitWords[unitMinsValue];
        }
        return unitWords[unitHourValue] + " " + minPart + suffix;
    }

    String getMinutePrefix(int minuteValue){
        String preffix;
        if(minuteValue==15){
            preffix = "quarter past ";
            return preffix;
        }
        if(minuteValue==30){
            preffix= "half past ";
            return preffix;
        }
        if(minuteValue==45){
            preffix= "quarter to ";
            return preffix;
        }
        if(minuteValue==5){
            preffix = "five past ";
            return preffix;
        }
        if(minuteValue==10){
            preffix= "ten past ";
            return preffix;
        }
        if(minuteValue==20){
            preffix= "twenty past ";
            return preffix;
        }
        if(minuteValue==55){
            preffix = "five to ";
            return preffix;
        }
        if(minuteValue==50){
            preffix= "ten to ";
            return preffix;
        }
        if(minuteValue==40){
            preffix= "twenty to ";
            return preffix;
        }
        return "";
    }

    // the last part of the time sentence
    String getTextSuffix(int unitHourValue, int minuteValue) {
        if(unitHourValue<12 && unitHourValue>0){
            return textSuffix = " in the morning";
        }
        else
        {
            this.unitHourValue = unitHourValue - 12;
            if(this.unitHourValue<6){
                return textSuffix = " in the afternoon";
            }
            else
            {
                return textSuffix = " in the evening";
            }
        }
    }


}
