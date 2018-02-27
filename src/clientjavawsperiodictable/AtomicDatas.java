package clientjavawsperiodictable;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "NewDataSet")
public class AtomicDatas {
    
    @ElementList(inline = true)
    private List<AtomicTable2> Table;

    
    public void set(List<AtomicTable2> Table) {
        this.Table = Table;
    }

    public List<AtomicTable2> get() {
        return Table;
    }
    
}
