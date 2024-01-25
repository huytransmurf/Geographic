/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import common.Library;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import model.EastAsiaCountries;
import view.Menu;

/**
 *
 * @author LAPTOP ACER
 */
public class ManageEastAsiaCountries extends Menu<String> {

    private ArrayList<EastAsiaCountries> cList = new ArrayList<>();
    private Library lib = new Library();
    private static String[] mc = {"Input the information of 11 countries in East Asia",
        "Display the information of country you've just input",
        "Search the information of country by user-entered name",
        "Display the information of countries sorted name in ascending order",
        "Exit "};

    public ManageEastAsiaCountries() {
        super("MENU",mc);
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                doAddCountry();
                break;
            case 2:
                doDisplay();
                break;
            case 3:
                String name = lib.getString("Enter name of country");
                ArrayList<EastAsiaCountries> rs = doSearch(name);
                System.out.println(String.format("%15s | %15s | %7s | %15s", "Name","ID","Total", "Terrain"));
                for (EastAsiaCountries e: rs){
                    e.display();
                }
                break;
            case 4:
                System.out.println(String.format("%15s | %15s | %7s | %15s", "Name","ID","Total", "Terrain"));
                Collections.sort(cList);
                for (EastAsiaCountries e:cList){
                    e.display();
                }
                break;
            case 5:
                System.out.println("Exitting...");
                System.exit(0);
        }
    }

    public void doAddCountry() {
        String code = lib.getString("Enter code of country");
        String name = lib.getString("Enter name of country");
        float area = lib.getFloat("Enter total area");
        String terrain = lib.getString("Enter terrain of country");
        this.cList.add(new EastAsiaCountries(code, name, area, terrain));
        System.out.println("Successfully!!");
    }
    public void doDisplay(){
            
        System.out.println(String.format("%15s | %15s | %7s |%15s", "Name","ID","Total", "Terrain"));
        for(EastAsiaCountries e:this.cList){
            e.display();
        }
    }

    public ArrayList<EastAsiaCountries> doSearch(String name) {
        ArrayList<EastAsiaCountries> rs = new ArrayList<>();
        for (EastAsiaCountries e:this.cList){
            if (e.getCountryName().toLowerCase().contains(name)){
                rs.add(e);
            }
        }
        return rs;
    }
    
    
}
