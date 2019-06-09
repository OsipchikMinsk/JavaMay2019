package cheefcook.service.implementations;


import cheefcook.exeption.MyNumberExeption;
import cheefcook.service.LoggerService;
import cheefcook.service.interfaces.ParsingFileService;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ParsingFileServiceImpl implements ParsingFileService {
    LoggerService loggerService = LoggerService.getInstance();
    private static final Logger log = LoggerService.getLog();



    @Override
    public void getKilocaloriesData(String path) {
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();  //спарсили строку
                String [] productOfData = line.split("\\s+");// распарсили по пороблелам [0] = название продукта, [1] = калорийность на 100 гр
                if(productOfData.length>1){ //есть ли 2 значения в строке
                    if((productOfData[0]!= null)||productOfData[0].length()>0){
                       int kiloCalories = 0;
                        try {
                           kiloCalories = Integer.parseInt(productOfData[1]);
                        }catch (Exception e ){
                            if (e instanceof NumberFormatException) {
                                try {
                                    throw new MyNumberExeption();
                                } catch (MyNumberExeption myEx) {
                                    log.warn("Kilocalories not found");
                                }
                            }
                        }
                        if (kiloCalories > 0) {
                            kilocaloriesDataOfProducts.put(productOfData[0].toUpperCase(), kiloCalories);
                        }
                    } else {
                        log.warn("Product not found");
                    }
                } else {
                    log.error("Not correct data in file of Kilocalories of products");
                }
            }

        } catch (FileNotFoundException e) {
            log.error("File not found", e);
        }
    }

    @Override
    public ArrayList<String> getProductsFromFile(String path) { //получаем данные из файла продукт и масса
        ArrayList<String> productList = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String [] products = line.split("\\s+");
                if(products.length>1){ //есть ли 2 значения в строке
                    if((products[0]!= null)||products[0].length()>0){
                      int weight = 0;
                       try {
                           weight = Integer.parseInt(products[1]);
                       }catch (Exception e){
                           log.warn("Weight not found");
                       }
                       if (weight>0){
                           productList.add(line);
                       }
                    } else {
                        log.warn("Product not found");
                    }
                } else {
                    log.error("Not correct data in file of products");
                }
            }
        }catch (FileNotFoundException e) {
            log.error("File not found", e);
        }
        return productList;
    }
    public void testPrint (){

        log.warn("Test Logger");
    }
}
