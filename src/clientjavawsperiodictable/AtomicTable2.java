package clientjavawsperiodictable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class AtomicTable2 {
    @Element(name = "ElementName")
    private String ElementName;

    public String getElementName() {
        return ElementName;
    }
    
    
    
}
