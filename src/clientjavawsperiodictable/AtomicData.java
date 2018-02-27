package clientjavawsperiodictable;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "newDataSet")
public class AtomicData {
    
    @Element(name = "Table")
    private AtomicTable Table;

    
    public void setAt(AtomicTable Table) {
        this.Table = Table;
    }

    public AtomicTable getAt() {
        return Table;
    }
    
}
