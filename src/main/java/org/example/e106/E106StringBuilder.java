package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {

    StringBuffer sb = new StringBuffer ();

    sb = sb.append("Hello ");
    sb = sb.append("World");

    String st = sb.toString();
    st = st.toUpperCase();

        System.out.println(st);
    }
}
