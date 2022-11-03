package org.example;

import org.example.services.DatabaseService;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        try {
            DatabaseService dbService = new DatabaseService();

//            dbService.addRecord("Patine", 30, 5000.);

            //DELETE
            int deleteResult = dbService.deleteRecord(2);
            System.out.println(deleteResult);

            //UPDATE
            int updateResult = dbService.updateRecord("Kendrick", 3);
            System.out.println(updateResult);

            ResultSet result = dbService.getAllRecords();
            while(result.next()){
                String name = result.getString(2);
                int age= result.getInt(3);
                double salary = result.getDouble(4);
                System.out.println(name+","+age+","+salary);
            }

            System.out.println("Success");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}