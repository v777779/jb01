package ch17.ex42.thrown;

/**
 * Created by V1 on 04-Apr-17.
 */
public class Element {
    private String ident;

    public Element(String ident) {
        this.ident = ident;
    }

    @Override
    public boolean equals(Object o) {   // реализация для работы в качестве ключа Map
        if (this == o) return true;
        if (!(o instanceof Element)) return false;

        Element element = (Element) o;

        return ident != null ? ident.equals(element.ident) : element.ident == null;
    }

    @Override
    public int hashCode() {             // реализация для работы в качестве ключа Map
        return ident != null ? ident.hashCode() : 0;
    }

    @Override
    protected void finalize() {
        System.out.println("Finalizing:"+ident);
    }

    @Override
    public String toString() {
        return ident;
    }
}
