package xml.SpringCollections;




import java.util.*;

public class JavaCollection {
    List addresList;
    Set addresSet;
    Map addresMap;
    Properties addresProp;

    public java.util.List getAddresList() {
        System.out.println("List Element : " + addresList);
        return addresList;
    }

    public void setAddresList(java.util.List addresList) {
        this.addresList = addresList;
    }

    public Set getAddresSet() {
        System.out.println("Set element + " + addresSet);
        return addresSet;
    }

    public Map getAddresMap() {
        System.out.println("Map Element " + addresMap);
        return addresMap;
    }

    public Properties getAddresProp() {
        System.out.println("Property Elements :" + addresProp);
        return addresProp;
    }

    public void setAddresSet(Set addresSet) {
        this.addresSet = addresSet;
    }

    public void setAddresMap(Map addresMap) {
        this.addresMap = addresMap;
    }

    public void setAddresProp(Properties addresProp) {
        this.addresProp = addresProp;
    }
}

