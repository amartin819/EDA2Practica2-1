package material.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import material.ordereddictionary.BSTOrderedDict;
import material.ordereddictionary.Entry;


/**
 *
 * @author jvelez
 */
public class Index {
    
    /**
     * Load the test contained in the file.
     * @param filename Name of the file.
     * @param stopwords Name of the stopwords file.
     */
    
    BSTOrderedDict<String, Integer> ejemplo = new BSTOrderedDict<>();
    BSTOrderedDict<String, Integer> stop = new BSTOrderedDict<>();
    
    public void load(String filename, String stopwords) throws FileNotFoundException {
        //leer el fichero de palabras prohibidas
        Scanner scStop= new Scanner(new File(stopwords));
          
        Entry<String, Integer> aux;
        
        while(scStop.hasNextLine()){
            this.stop.insert(scStop.next(), Integer.SIZE);
            System.out.println(scStop.nextLine());
        }
        
         
        //leer el fichero del cuento
        Scanner scName= new Scanner(new File(filename));
         
        while(scName.hasNextLine()){
            aux = stop.find(scName.next());
            if(aux == null)
            //if(Character.isUpperCase(scName.next()) && !scName.hasNextInt()){
            this.ejemplo.insert(scName.next(), Integer.SIZE);
            System.out.println(scName.nextLine());
        }
        scStop.close();
        scStop.close(); 
       /*  while((bfNameRead = bfName.readLine()) != null){
             tempName = tempName + bfNameRead;
            if(Character.isUpperCase(tempName.charAt(0)) && !Character.isDigit(tempName.charAt(0))){
                    aux= stop.find(tempName);
                    if(aux==null){
                        ejemplo.insert(tempName, Integer.SIZE);
                    }
            }
        }*/
       
    }

    /**
     * 
     * @return a String with the occurrences of the words with uppercase 
     * in the text at its pages out of the stopword list.
     */
    public String allOccurrencesIndex() {
        String devolver = "";

        while(!this.ejemplo.isEmpty()){
           
        }
        
        return devolver;
    }

    /**
     * 
     * @return a String with the page of the first occurrence of each word 
     * with uppercase in the text out of the stopword list.
     */
    public String firstOccurrencesIndex() {
        throw new RuntimeException("Implements this method.");
    }
    
    
    public static void main(String[] args){
        load("ejemplo.txt", "stopwords.txt");
    }
}
