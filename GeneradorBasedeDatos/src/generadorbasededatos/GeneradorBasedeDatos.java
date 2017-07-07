/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorbasededatos;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author David Castro
 */
public class GeneradorBasedeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] modelslist = {"Toyota Aygo" , "Toyota Allion" , "Toyota Aurion" , "Toyota Auris" , "Toyota Avalon" , "Toyota Belta" , "Toyota Camry" , "Toyota Century" , "Toyota Corolla Altis"};
        int[] pricelist = {12300 , 4500 , 3200, 8900, 1204, 4305, 2048, 22934, 9283, 40284, 4928, 9482, 4000, 5000, 13000, 15000};
        String[] typelist = {"MicroCar", "Hatchback", "Crossover SUV", "MiniVan", "Compact Executive", "Estate Car","Grand Tourer" , "Supercar", "Muscle Car", "Sport Utility Vehicle" };
        int[] yearlist = {2008,2009,2010,2011,2012,2013,2014,2015,2016,2017};
        String[] fueltypelist = {"Electric", "Gasoline", "Diesel"};
        String[] gearboxtypelist = {"Mechanic", "Automatic", "TipTronic"};
        int[] wheelsizelist = {10,11,12,13,14,15,16,17,18};
        double[] enginelist = {1.4,2.2,3.0,1.5,2.5,3.5,2.7};
        int modelrand, pricerand, typerand, yearrand, fueltyperand, wheelsizerand, enginerand, gearboxtyperand;
        for (int i = 0; i < 5000; i++) {
            modelrand = ThreadLocalRandom.current().nextInt(0, modelslist.length);
            pricerand = ThreadLocalRandom.current().nextInt(0, pricelist.length);
            typerand = ThreadLocalRandom.current().nextInt(0, typelist.length);
            fueltyperand = ThreadLocalRandom.current().nextInt(0, fueltypelist.length);
            wheelsizerand = ThreadLocalRandom.current().nextInt(0, wheelsizelist.length);
            yearrand = ThreadLocalRandom.current().nextInt(0, yearlist.length);
            enginerand = ThreadLocalRandom.current().nextInt(0, enginelist.length);
            gearboxtyperand = ThreadLocalRandom.current().nextInt(0, gearboxtypelist.length);
            Cars car = new Cars(modelslist[modelrand], pricelist[pricerand], typelist[typerand], 
                                yearlist[yearrand], fueltypelist[fueltyperand], gearboxtypelist[gearboxtyperand], wheelsizelist[wheelsizerand],
                                enginelist[enginerand]);
            System.out.println(car.toString());
        }
        
    }
    
}
