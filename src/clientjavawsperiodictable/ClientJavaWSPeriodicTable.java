package clientjavawsperiodictable;

import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;





public class ClientJavaWSPeriodicTable {
    public static void main(String[] args) {
        /*String text = "Gold";
        String response1 = getAtomicNumber(text);
        String response2 = getElementSymbol(text);
        String response3 = getAtomicWeight(text);
        String response4 = getAtoms();

        if (!response1.equals("<NewDataSet />")) {
            String atomicNumber = parseResponse(response1, "</AtomicNumber>");
            System.out.println("Gold atomic number is: " + atomicNumber);
        }
        if (!response2.equals("<NewDataSet />")) {
            String elementSymbol = parseResponse(response2, "</Symbol>");
            System.out.println("Gold element symbol is: " + elementSymbol );
        }
        
        if (!response3.equals("<NewDataSet />")) {
            String atomicweight = parseResponse(response3, "</AtomicWeight>");
            System.out.println("Gold atomic weight is: " + atomicweight );
        }
        
        /*if (!response4.equals("<NewDataSet />")) {
            String atoms = parseResponse(response3, "</ElementName>");
            System.out.println("Gold atomic weight is: " + atoms);
        }*/
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Introduzca el nombre del elemento: ");
            Serializer serializer = new Persister();
            String atom = sc.nextLine();
            String xml = getAtomicNumber(atom);
            AtomicData ad = new AtomicData();
            serializer.read(ad, xml);
            
            System.out.println("El número atomico del elemento " + atom+ " es: " + ad.getAt().getAtomicNumber());
            System.out.println("El peso atomico del elemento " + atom + " es: " + ad.getAt().getAtomicWeight());
            System.out.println("El simbolo atomico del elemento " + atom + " es: " + ad.getAt().getSymbol());
            /*System.out.println(ad.getAt().getAtomicNumber());
            System.out.println(ad.getAt().getElementName());
            System.out.println(ad.getAt().getSymbol());
            System.out.println(ad.getAt().getAtomicWeight());
            System.out.println(ad.getAt().getBoilingPoint());
            System.out.println(ad.getAt().getIonisationPotential());
            System.out.println(ad.getAt().getEletroNegativity());
            System.out.println(ad.getAt().getAtomicRadius());
            System.out.println(ad.getAt().getMeltingPoint());
            System.out.println(ad.getAt().getDensity());*/
            
            AtomicDatas ads = new AtomicDatas();
            xml = getAtoms();
            serializer.read(ads, xml);
            System.out.print("Los atomos de la tabla periodica son: ");
            for (int i = 0; i < ads.get().size(); i++) {
                System.out.println(ads.get().get(i).getElementName());
                
            }
            
            
            
            
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
        
        
        

            
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        clientjavawsperiodictable.Periodictable service = new clientjavawsperiodictable.Periodictable();
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        clientjavawsperiodictable.Periodictable service = new clientjavawsperiodictable.Periodictable();
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtoms() {
        clientjavawsperiodictable.Periodictable service = new clientjavawsperiodictable.Periodictable();
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        clientjavawsperiodictable.Periodictable service = new clientjavawsperiodictable.Periodictable();
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    
    private static String parseResponse(String response, String endTag) {
        String beginTag = endTag.replace("/", "");
        final int from = response.indexOf(beginTag);
        final int to = response.lastIndexOf(endTag);
        final String beginTagAndContent = response.substring(from, to);
        return beginTagAndContent.substring(beginTagAndContent.indexOf(">") + 1);
    }
    
}
