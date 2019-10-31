package spook.source.model;

import java.util.List;

public class DataController extends DataComparison {



    public boolean ifTurkishMeaningTrue(Object[] word , String turkishMeanin){
        if (word != null && word.length >= 2)
            return  word[1].equals(turkishMeanin);
        return false;
    }

    public boolean ifTurkishMeaningTrue(Object[] word , String englishWord , String turkishMeanin){
        if (word != null && word.length >= 2){
            if(word[0].equals(englishWord))
                return  word[1].equals(turkishMeanin);
        }

        return false;
    }


    public boolean ifEnglishMeaningTrue(Object[] word , String englishMeanin){
        if (word != null && word.length >= 2)
            return  word[0].equals(englishMeanin);
        return false;
    }

    public boolean ifEnglishMeaningTrue(Object[] word , String turkishWord , String englishMeanin){
        if (word != null && word.length >= 2){
            if(word[1].equals(turkishWord))
                return  word[0].equals(englishMeanin);
        }

        return false;
    }

    //Kelimenin englizce sorma hakkı kaldı mı kalmadımı
    public boolean isThereEnglishRight(Object[] word){
        if (word != null){
            if ((int)word[2] > 0)
                return true;
            else if((int)word[2] == 0)
                return false;
            else
                return false;
        }
        return false;
    }

    //Kelimenin türkçe sorma hakkı kaldı mı kalmadı mı
    public boolean isThereTurkishRight(Object[] word){
        if (word != null){
            if ((int)word[3] > 0)
                return true;
            else if((int)word[3] == 0)
                return false;
            else
                return false;
        }
        return false;
    }

    




}
