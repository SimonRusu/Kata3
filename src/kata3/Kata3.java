/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author Entrar
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram h = new Histogram();
        h.increment("GMAIL.COM");
        h.increment("GMAIL.COM");
        h.increment("HOTMAIL.COM");
        h.increment("OUTLOOK.COM");
        h.increment("OUTLOOK.COM");
        h.increment("OUTLOOK.COM");
        h.increment("OUTLOOK.COM");
        h.increment("OUTLOOK.COM");
        h.increment("OUTLOOK.COM");
        h.increment("MARCA.COM");
        h.increment("APPLE.COM");
        
        
        HistogramDisplay histo = new HistogramDisplay("Mi Histograma",h);
        histo.execute();
    }
    
}
