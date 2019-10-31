package spook.source.model;

import java.util.List;

public class DataComparison {

    //Bu kelime silincek mi Silinmiycek mi
    public boolean ifDeleteThisWord(List<Object[]> listOfEnglishDictionary , Object word){
        if(listOfEnglishDictionary != null){
            for (Object[] tmpObj : listOfEnglishDictionary){
                if (tmpObj[0].equals(word)) {
                    if((int)tmpObj[2] == 0 && (int)tmpObj[3] == 0)
                        return true;
                }
            }
        }
        return false;
    }


    //Bu ingilizce kelime listende var mı yok mu
    public boolean ifThisEnglishWordExist(List<String> listOfEnglishWord , String word){
        if(listOfEnglishWord != null){
            for (String tmpWord : listOfEnglishWord){
                if(tmpWord.equals(word))
                    return true;
            }
        }

        return false;
    }

    //Bu iki obje eşitmi değil mi
    public boolean ifEquals(Object[] word1 , Object[] word2){
        if(word1 != null && word2 != null){
            if (word1.length == 4 && word2.length == 4){
                for (int i=0 ; i<word1.length;i++){
                    if(!word1[i].equals(word2[i]))
                        return false;
                }
                return true;
            }
        }
        return false;
    }




}
