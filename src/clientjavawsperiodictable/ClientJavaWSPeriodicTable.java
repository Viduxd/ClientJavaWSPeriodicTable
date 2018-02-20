package clientjavawsperiodictable;





public class ClientJavaWSPeriodicTable {
    public static void main(String[] args) {
        String text = "Gold";
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
