package catalogofproduct;

import javax.xml.namespace.QName;

public class CatalogOfProduct {
    private String name;

    public String[] getCatalog() {
        return catalog;
    }

    private static String[] catalog={
            "Продукты",
            "Хозтовары",
            "Одежда",
            "Бытовая химия",
            "Дача, сад",
            "Автотовары"
    };
    public static void openCatalog(){
        for (String s:catalog
             ) {
            System.out.println(s);

        }
    }

}
