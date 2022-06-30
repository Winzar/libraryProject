package com.example.LibraryProject;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


@Component
public class CSVReader {

    private Scanner scanner;

    @PostConstruct
    private void loadData(){
        try{
            scanner = new Scanner(new File("src/main/java/com/example/LibraryProject/books_data.csv"));
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()){
            String currentLine = scanner.nextLine();
            if (currentLine.equals("") || currentLine.equals("Number,Title,Author,Genre,SubGenre,Publisher")){
               //skips line
            } else {
                Book newBook = getBookFromLine(currentLine);
                System.out.println(newBook);
//                if (newBook!=null){
//                    this.bookMap.put(newBook);
//                }

            }
        }
    }
// Line 6 is unclean
    private Book getBookFromLine(String line){
        String[] split = line.split(",");

        int number = Integer.parseInt(split[0]);

        String title;
        String author;
        String genre;
        String subgenre;
        String publisher;
        // title check is with number 7

        if(split[1].contains("\"")){
//            System.out.println("speech marks detected");
            title = split[2].trim().replace("\"","") + " " + split[1].trim().replace("\"","");
            if(split[3].contains("\"")) {
                author = split[4].trim().replace("\"", "") + " " + split[3].trim().replace("\"", "");
                genre = split[5].trim();
                subgenre = split[6].trim();
                publisher = split[7].trim();
            } else {
                author = split[3].trim();
                genre = split[4].trim();
                subgenre = split[5].trim();
                publisher = split[6].trim();
            }


        } else {
            title = split[1].trim();
                if(split[2].contains("\"")) {
                    author = split[3].trim().replace("\"", "") + " " + split[2].trim().replace("\"", "");
                    genre = split[4].trim();
                    subgenre = split[5].trim();
                    publisher = split[6].trim();
                }else{
                    author = split[2].trim();
                    genre = split[3].trim();
                    subgenre = split[4].trim();
                    publisher = split[5].trim();
                }

        }




        Book book = new Book(number, title, author, genre, subgenre, publisher);
        return book;
    }

public static void main(String[] args){
        CSVReader csvReader = new CSVReader();
        csvReader.loadData();
//        System.out.println(csvReader.;
}



}
