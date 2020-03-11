package com.zipcodewilmington.looplabs;

import java.util.Map;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] nonDups = new String[getArray().length];
        int pos = 0;
        for(int x = 0; x <=  getArray().length -1; x++){
            int count = 0;
            for(int z = 0; z <=  getArray().length -1; z++){
                if(getArray()[x].equals(getArray()[z])){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                nonDups[pos] = (getArray()[x]);
                pos++;
            }else{
                nonDups[pos] = "null";
                pos++;
            }
        }

        int nunOfNulls = 0;
        for(String element : nonDups){
            if(element.equals("null")){
                nunOfNulls++;
            }
        }

        String[] answer1 =  new String[nonDups.length - nunOfNulls];
        int position = 0;
        for(String element :  nonDups){
            if(element.equals("null")){

            }else{
                answer1[position] = element;
                position++;
            }
        }
        return answer1;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] nonDups = new String[getArray().length];
        int pos = 0;
        for(int x = 0; x <=  getArray().length -1; x++){
            int count = 0;
            for(int z = 0; z <=  getArray().length -1; z++){
                if(getArray()[x].equals(getArray()[z])){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                nonDups[pos] = (getArray()[x]);
                pos++;
            }else{
                nonDups[pos] = "null";
                pos++;
            }
        }

        int nunOfNulls = 0;
        for(String element : nonDups){
            if(element.equals("null")){
                nunOfNulls++;
            }
        }

        String[] answer1 =  new String[nonDups.length - nunOfNulls];
        int position = 0;
        for(String element :  nonDups){
            if(element.equals("null")){

            }else{
                answer1[position] = element;
                position++;
            }
        }
        return answer1;
    }

    @Override
    String[] getArray() {
        return this.array;
    }
}
