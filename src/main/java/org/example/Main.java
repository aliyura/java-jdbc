package org.example;

import org.example.services.DatabaseService;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        try {
            DatabaseService dbService = new DatabaseService();

//            dbService.addRecord("Patine", 30, 5000);

            ResultSet result = dbService.getAllRecords();
            while(result.next()){
                String name = result.getString(1);
                int age= result.getInt(2);
                double salary = result.getDouble(3);
                System.out.println(name+","+age+","+salary);
            }

            System.out.println("Success");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}