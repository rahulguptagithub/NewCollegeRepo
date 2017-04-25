package com.college.form;
import java.util.* ;
import org.apache.struts.util.* ;
public class OptionsCollectionElement extends LabelValueBean {

	private String p_value;
	private String p_label;
	
    public String getP_value() {
		return p_value;
	}

	public void setP_value(String p_value) {
		this.p_value = p_value;
	}

	public String getP_label() {
		return p_label;
	}

	public void setP_label(String p_label) {
		this.p_label = p_label;
	}

	public static final Comparator SORT_BY_VALUE =
        new OptionsCollectionElementComparatorByValue() ;

    public static final Comparator SORT_BY_LABEL =
        new OptionsCollectionElementComparatorByLabel() ;
    
    public OptionsCollectionElement(String p_value, String p_label) {
        super(p_label, p_value) ;
    }
    
    public OptionsCollectionElement(String p_value) {
        super(p_value, p_value) ;
    }

    static class OptionsCollectionElementComparatorByValue implements Comparator {
        
        public int compare(Object o1, Object o2) {
            OptionsCollectionElement oce1 = (OptionsCollectionElement) o1 ;
            OptionsCollectionElement oce2 = (OptionsCollectionElement) o2 ;
            return oce1.getValue().compareTo(oce2.getValue()) ;
        }
    }
        
    static class OptionsCollectionElementComparatorByLabel implements Comparator {
        
        public int compare(Object o1, Object o2) {
            OptionsCollectionElement oce1 = (OptionsCollectionElement) o1 ;
            OptionsCollectionElement oce2 = (OptionsCollectionElement) o2 ;
            return oce1.getLabel().compareTo(oce2.getLabel()) ;
        }
    }

}
