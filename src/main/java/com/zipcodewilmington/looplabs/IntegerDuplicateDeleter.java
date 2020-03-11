package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Integer[] arr;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] nonDups = new Integer[getArray().length];
        int pos = 0;
        for(int x = 0; x <=  getArray().length -1; x++){
            int count = 0;
            for(int z = 0; z <=  getArray().length -1; z++){
                if(getArray()[x] == getArray()[z]){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                nonDups[pos] = (getArray()[x]);
                pos++;
            }else{
                nonDups[pos] = null;
                pos++;
            }
        }

        int nunOfNulls = 0;
        for(Integer element : nonDups){
            if(element == null){
                nunOfNulls++;
            }
        }

        Integer[] answer1 =  new Integer[nonDups.length - nunOfNulls];
        int position = 0;
        for(Integer element :  nonDups){
            if(element == null){

            }else{
                answer1[position] = element;
                position++;
            }
        }
        return answer1;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] nonDups = new Integer[getArray().length];
        int pos = 0;
        for(int x = 0; x <=  getArray().length -1; x++){
            int count = 0;
            for(int z = 0; z <=  getArray().length -1; z++){
                if(getArray()[x] == getArray()[z]){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                nonDups[pos] = (getArray()[x]);
                pos++;
            }else{
                nonDups[pos] = null;
                pos++;
            }
        }

        int nunOfNulls = 0;
        for(Integer element : nonDups){
            if(element == null){
                nunOfNulls++;
            }
        }

        Integer[] answer1 =  new Integer[nonDups.length - nunOfNulls];
        int position = 0;
        for(Integer element :  nonDups){
            if(element == null){

            }else{
                answer1[position] = element;
                position++;
            }
        }
        return answer1;
    }

    @Override
    Integer[] getArray() {
        return this.array;
    }
}
