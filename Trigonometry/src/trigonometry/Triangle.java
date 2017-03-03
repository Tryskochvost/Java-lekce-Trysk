/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigonometry;

import java.util.Scanner;

/**
 *
 * @author vkrejci
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in, "Windows-1250");
        System.out.println("Trojuhelnikove bullshity.Yay!");
        System.out.println("Zadej prvni rozmer trojuhelniku:");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Zadej druhy rozmer trojuhelniku:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Zadej treti rozmer trojuhelniku:");
        double c = Double.parseDouble(sc.nextLine());
        double hypo = 0;
        double adja = 0;
        double oppo = 0;
        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a))
        {
            System.out.println("Zadane rozmery nemohou vytvorit trojuhelnik");
        }
        else
        {
            /**
             * Urceni, zda jde o rovnostranny trojuhelnik
             */
            if ( (a == b) && (a == c) && (c == b))
            {
                System.out.println("Jde o rovnostrany trojuhelnik");
                 /**
                 * Heronova veta
                 */
                double perimeter = a + b + c;
                System.out.println("S obvodem: " + perimeter + "cm");
                
                double halfperi = perimeter / 2;
                double area = halfperi * (halfperi - a) * (halfperi - b)
                        * (halfperi - c);
                area = Math.sqrt(area);
                System.out.println("a obsahem: " + area + "cm2");
            }
            /**
             * Urceni, zda jde o rovnoramenny trojuhelnik
             */
            else if ((a ==b) || (a == c) || (c==b))
            {
                System.out.println("Jde o rovnoramenny trojuhelnik");
                 /**
                 * Heronova veta
                 */
                double perimeter = a + b + c;
                System.out.println("S obvodem: " + perimeter + "cm");
                
                double halfperi = perimeter / 2;
                double area = halfperi * (halfperi - a) * (halfperi - b)
                        * (halfperi - c);
                area = Math.sqrt(area);
                System.out.println("a obsahem: " + area + "cm2");
            }
            else
            {
                /**
                 * Hledani prepony
                 */
                if ((a > b) && (a > c))
                {
                    hypo = a;
                    adja = b;
                    oppo = c;
                }
                else if ((b > a) && (b > c))
                {
                    hypo = b;
                    adja = a;
                    oppo = c;
                }
                else if ((c > a) && (c > b))
                {
                    hypo = c;
                    adja = a;
                    oppo = b;
                }
                else
                {
                    System.out.println("Z nejakeho duvodu doslo k chybe pri "
                            + "hledani prepony");
                    System.exit(-1);
                }
                
                /**
                 * Pythagorova veta
                 */
                if ((hypo * hypo) == ((adja * adja) + (oppo * oppo)))
                {
                    System.out.println("Jdena se o pravouhly trojuhelnik");
                }
                else
                {
                    System.out.println("Jedna se o obycejny a"
                            + " nudny trojuhelnik");
                }
                /**
                 * Heronova veta
                 */
                double perimeter = hypo + adja + oppo;
                System.out.println("S obvodem: " + perimeter + "cm");
                
                double halfperi = perimeter / 2;
                double area = halfperi * (halfperi - hypo) * (halfperi - adja)
                        * (halfperi - oppo);
                area = Math.sqrt(area);
                System.out.println("a obsahem: " + area + "cm2");
            }
        }
    }
    
}
