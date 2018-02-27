package clientjavawsperiodictable;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;

@Root(name = "newDataSet")
public class AtomicDatas {
    
    @ElementArray(name = "Table")
    private AtomicTable2[] Table;

    
    public void set(AtomicTable2[] Table) {
        this.Table = Table;
    }

    public AtomicTable2[] get() {
        return Table;
    }
    
}
