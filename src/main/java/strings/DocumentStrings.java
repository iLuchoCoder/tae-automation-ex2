package strings;

public class DocumentStrings {
    private String url,element1,element2,element3,element4,element5,element6,element7,element8,element9,element10;

    public DocumentStrings() {
        super();
        this.url="http://test-page-paul.herokuapp.com/";
        this.element1="body:nth-child(2) div.container:nth-child(1) address:nth-child(6) > a:nth-child(1)";
        this.element2="body:nth-child(2) div.container:nth-child(1) ul:nth-child(8) > li:nth-child(3)";
        this.element3="body:nth-child(2) div.container:nth-child(1) menu:nth-child(10) > li:nth-child(1)";
        this.element4="body:nth-child(2) div.container:nth-child(1) dir:nth-child(12) > li:nth-child(3)";
        this.element5="#but";
        this.element6="#f01";
        this.element7="div.container:nth-child(1) form:nth-child(15) div:nth-child(11) select:nth-child(3) > option:nth-child(3)";
        this.element8="div.container:nth-child(1) table:nth-child(18) tbody:nth-child(2) tr:nth-child(4) > td:nth-child(3)";
        this.element9="body:nth-child(2) div.container:nth-child(1) > p:nth-child(23)";
        this.element10="body:nth-child(2) div.container:nth-child(1) > h3:nth-child(26)";
    }

    public String getUrl() {
        return url;
    }

    public String getElement1() {
        return element1;
    }

    public String getElement2() {
        return element2;
    }

    public String getElement3() {
        return element3;
    }

    public String getElement4() {
        return element4;
    }

    public String getElement5() {
        return element5;
    }

    public String getElement6() {
        return element6;
    }

    public String getElement7() {
        return element7;
    }

    public String getElement8() {
        return element8;
    }

    public String getElement9() {
        return element9;
    }

    public String getElement10() {
        return element10;
    }
}
