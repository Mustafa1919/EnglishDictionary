package spook.source.model;

import java.util.ArrayList;
import java.util.List;

public class DataObject extends DataController {

    private List<Object[]> wordDictionary = null;
    private List<String> listOfWord = null;
    private List<Integer> listOfNumber = null;

    public DataObject(){
        if(this.wordDictionary == null)
            this.wordDictionary = new ArrayList<Object[]>();
    }

    public boolean add(Object englishWord , Object turkishMeaning , Object ETNumberOfTrue , Object TENumberOfTrue){
        try{
            if(this.wordDictionary != null){
                //Önce gelen kelime varmı yokmu kontrol et
                Object[] tmpArray = {englishWord , turkishMeaning , ETNumberOfTrue , TENumberOfTrue};
                this.wordDictionary.add(tmpArray);
                return true;
            }
        }
        catch (Exception e){
            return false;
        }
        return false;
    }

    public boolean delete(Object englishWord){
        // Delete Komutu Çalıştır
        return false;
    }

    private void clearListOfWord(){
        if(this.listOfWord != null){
            this.listOfWord.clear();
            this.listOfWord = null;
        }
    }

    private void clearListOfNumber(){
        if(this.listOfNumber != null){
            this.listOfNumber.clear();
            this.listOfNumber = null;
        }
    }

    public List<String> getListOfEnglishWord(){
        clearListOfWord();
        try {
            this.listOfWord = new ArrayList<String>();
            if(this.wordDictionary != null){

                for (Object[] tmpObjectArray : this.wordDictionary){
                    this.listOfWord.add((String)tmpObjectArray[0]);
                }
                return this.listOfWord;
            }
        }
        catch (Exception e){
            return null;
        }
        return null;
    }

    public List<String> getListOfTurkishWord(){
        clearListOfWord();
        try {
            this.listOfWord = new ArrayList<String>();
            if(this.wordDictionary != null){

                for (Object[] tmpObjectArray : this.wordDictionary){
                    this.listOfWord.add((String)tmpObjectArray[1]);
                }
                return this.listOfWord;
            }
        }
        catch (Exception e){
            return null;
        }
        return null;
    }

    public List<Integer> getListOfEnglishNumber(){
        clearListOfWord();
        try {
            this.listOfNumber = new ArrayList<Integer>();
            if(this.wordDictionary != null){

                for (Object[] tmpObjectArray : this.wordDictionary){
                    this.listOfNumber.add((int)tmpObjectArray[2]);
                }
                return this.listOfNumber;
            }
        }
        catch (Exception e){
            return null;
        }
        return null;
    }

    public List<Integer> getListOfTurkishNumber(){
        clearListOfWord();
        try {
            this.listOfNumber = new ArrayList<Integer>();
            if(this.wordDictionary != null){

                for (Object[] tmpObjectArray : this.wordDictionary){
                    this.listOfNumber.add((int)tmpObjectArray[3]);
                }
                return this.listOfNumber;
            }
        }
        catch (Exception e){
            return null;
        }
        return null;
    }

    




}
